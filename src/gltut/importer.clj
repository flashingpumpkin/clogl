(ns gltut.importer
  (:import [org.lwjgl.opengl Display]
           [java.lang.reflect Method Field])
  (:use [clojure.pprint]))

(defn get-methods
  "Return all the methods on a class"
  [#^Class cls]
  (into [] (. cls getMethods)))

(defn get-fields
  "Return all the fields on a class"
  [#^Class cls]
  (into [] (. cls getFields)))

(defn method-name
  "Return the name of a given method"
  [#^Method method]
  (.getName method))

(defn field-name
  "Return the name of a given field"
  [#^Field field]
  (.getName field))

(defn get-parameters
  "Return a vector of types that this method takes in order of declaration."
  [#^Method method]
  (into [] (.getParameterTypes method)))


;; (defmacro importer [import-from import-what import-as]
;;   `(defn  ~import-as [& args#] 
;;      (do (. ~import-from ~import-what))))

;; (symbol (join "-" (map lower-case (split (replace "fooBarBaz" #"([a-z])([A-Z])" "$1 $2") #" "))))

(defmacro importer [import-from import-what import-as]
  (let [method (get-method import-from (str import-what))]
    method))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn make-params-list
  [method]
  )

(defn make-call-exp
  [method])

(defn get-cls-method
  "Return the first method on a class matching
   a given name.

  user=> (get-method System \"currentTimeMillis\")"
  [class the-method]
  (first (filter #(= (method-name %) the-method)
                 (get-methods class))))


(defn make-fn [class method method-name fn-name]
  (let [ps (into [] (map (fn [_] `arg#) (get-parameters method)))
        params (if (= (count ps) 0)
                 []
                 ps)]
    `(defn ~fn-name ~params
       (. ~class ~method-name ~@params))))
  
  ;; (let [params (get-parameters method)]    
   ;; (if (> (count params) 0)
   ;;    (do
   ;;      `(defn ~fn-name [& args#]
   ;;         (apply #(method) args#)))
   ;;    (. ~class method))))
    ;; `(defn ~fn-name [& args#]
    ;;    (if (> (count params) 0)
    ;;      (apply #(. ~class ~method) args#)
    ;;      (. ~class method)))))

(defmacro import-static
  "Wrap public static functions of a class in closure functions and imports
   them into the current namespace.
   Methods names are split on uppercase and rejoined with a hyphen,
   e.g. currentTimeMillis becomes current-time-millis.

  user=> (import-static java.lang.Math sqrt my-sqrt)"
  [class import-what import-as]
  (let [the-class (. Class forName (str class))
        the-method (get-cls-method the-class (str import-what))]
    (make-fn the-class the-method import-what import-as)))

  