;;; some utility funcitons 

(defn mk-counter 
  "returns a function that for each returns a successive integer 
   for each invocation." 
  ([] (mk-counter 0)) 
  ([start] 
     (let [n (atom start)] 
       (fn [] (- (swap! n inc) 1))))) 

(defn seq-to-multimap 
  "takes a sequence s of possibly repeating elements 
   and converts it to a map, where keys are obtained 
   by applying key-fn to elements of s and values are 
   sequences of all elements of s with a given key" 
  [s key-fn] 
  (reduce 
   (fn [m el] 
     (let [key (key-fn el)] 
       (assoc m key 
              (conj (m key []) el)))) 
   {} s)) 

;;; static import helper functions 

(def primitive-type-translation { "bool" "Boolean" 
                                  "char" "Character" 
                                  "long" "Long" 
                                  "int" "Integer" 
                                  "short" "Short" 
                                  "byte" "Byte" 
                                  "float" "Float" 
                                  "double" "Double"}) 

(defn resolve-primitive-type [#^String t] (primitive-type-translation 
t t)) 

(defn type-2-symbol 
  "resolves type name into a symbol, converts primitive types 
   to boxed types" 
  [type] 
  (symbol (resolve-primitive-type (.getCanonicalName type)))) 

(defn get-ps-methods 
  "returns all public static methods of a class c" 
  [c] 
  (let [methods (.getMethods c)] 
    (filter #(let [mod (.getModifiers %1)] 
               (and (java.lang.reflect.Modifier/isStatic mod) 
                    (java.lang.reflect.Modifier/isPublic mod))) methods))) 

(defn get-methods-multimap 
  "returns a multimap of publi static methods of a class c" 
  [c] 
  (seq-to-multimap (get-ps-methods c) #(.getName %1))) 

(defn make-java-method-symbol 
  "returns a symbol that corresponds to a fully qualified 
   name of the java method" 
  [#^java.lang.reflect.Method method] 
  (symbol (str 
           (.. method getDeclaringClass getName) 
           "/" 
           (.getName method)))) 

(defn get-method-args 
  "returns a java Class[] array of method's argument types" 
  [method] 
  (.getParameterTypes method)) 

(defn mk-param [param count] 
  "returns clojure expression for the parameter declaration with the 
type" 
  (with-meta (symbol (str "param" count)) 
             {:tag (type-2-symbol param)})) 

(defn mk-params-list [method] 
  "returns clojure expression for the parameter declarations of a 
funciton" 
  (let [c (mk-counter 0)] 
    (into [] (map #(mk-param %1 (c)) (get-method-args method))))) 

(defn mk-call-exp [method] 
  "returns clojure expression for the function call. 
   Example: (java.lang.Math/min param0 param1) " 
  (let [c (mk-counter 0)] 
    (cons (make-java-method-symbol method) 
          (map (fn [param] (symbol (str "param" (c)))) 
               (get-method-args method))))) 

(defn mk-func-name [prefix method] 
  (symbol (str prefix "-" (.getName method)))) 

(defn mk-func-def [prefix method] 
  `(defn ~(mk-func-name prefix method) 
         ~(mk-params-list method) 
         ~(mk-call-exp method))) 

;;; the macro itself 

(defmacro import-static 
  "wraps all public static functions of a class in 
   closure functions and imports them into the current 
   namespace. Clojure name will be prefix-'method name'. 

   Example: (import-static \"foo\" java.lang.Math) 

   TODO: multimethod support, currently only the first 
         of overloaded methods will be imported. " 
  [prefix class] 
  `(do ~@(map (fn [[name [method & rest]]] 
                (mk-func-def prefix method)) 
              (get-methods-multimap 
               (. Class forName (str class)))))) 