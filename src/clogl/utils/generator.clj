; A set of functions that generates Clojure code which in turn imports
; static methods from a class. Used to import the whole LWJGL OpenGL
; API                                        

(ns clogl.utils.generator
  (:use [clogl.utils.importer])
  (:require [clojure.string :as s]
            [clojure.java.io :as io])
  (:import [org.lwjgl.opengl GL11 GL12 GL13 GL14 GL15 GL20 GL21 GL30 GL31 GL32 
            GL33 GL40 Display ]))

(defn renamer [name-fn method]
  "Rename camelCaseMethods to hyphenated-methods"
  (let [name (name-fn method)
        ; Add spaces in between camelCasedMembers
        replaced (s/replace name #"([a-z])([A-Z])" "$1 $2")
        ; Split on spaces
        split (s/split replaced #" ")]
    ; Join-with-hyphens-and-make-lowercase
    (s/lower-case (s/join "-" split))))

(defn create-line [import-what cls-symbol method-name import-name]
  (str "(" import-what " " cls-symbol " " method-name " " import-name ")"))

(defn method-import [cls-symbol]
  (fn [method]
    (create-line "import-method" cls-symbol (method-name method) (renamer method-name method))))

(defn field-import [cls-symbol]
  (fn [field]
    (create-line "import-field" cls-symbol (field-name field)
                 (s/replace  (renamer field-name field) #"\_" "-" ))))

(defn is-gl-method [method]
  "Ungyl ugly ugly. Need to implement something like (starts-with? string search)"
  (let [name (method-name method)]
    (and (= (first name) \g)
         (= (second name) \l ))))

(defn is-java-method [method]
  "Just check if a given method is a Java built in."
  (let [javas #{"toString" "wait" "notify" "equals" "hashCode" "notifyAll" "getClass"}]
    (if (some javas [(method-name method)])
      true
      false)))

(defn gl-methods [class]
  "Filters out all non-gl methods"
  (filter is-gl-method (get-methods class)))

(defn no-java-methods [class]
  "Filters out all standard java methods"
  (filter #(not (is-java-method %)) (get-methods class)))

(defn get-class-symbol [class]
  (second (s/split (str `~class))))

(defn for-class [class methods-fn fields-fn]
  "Do the importing for a given class. Import all static fields and only 
   static methods starting with gl"
  (let [cls-symbol (second (s/split (str `~class) #" "))
        methods (methods-fn class)
        fields (fields-fn class)
        method-lines (into #{} (map (method-import cls-symbol) methods))
        field-lines (into #{} (map (field-import cls-symbol) fields))
        ]
    (into []  (into method-lines field-lines))))

(defn write-to-file [namespace filename lines]
  "Write the imports to a file and give it a namespace"
  (with-open [writer (io/writer filename)]
    (.write writer (str "(ns " namespace " (:use [clogl.utils.importer])) \n\n"))
    (doseq [line lines]
      (.write writer line)
      (.write writer "\n"))))

(defn import-gl-api []
  "Import the OpenGL API"
  (let [w write-to-file]
    (w "clogl.opengl.gl11" "src/clogl/opengl/gl11.clj" (for-class GL11 gl-methods get-fields))
    (w "clogl.opengl.gl12" "src/clogl/opengl/gl12.clj" (for-class GL12 gl-methods get-fields))
    (w "clogl.opengl.gl13" "src/clogl/opengl/gl13.clj" (for-class GL13 gl-methods get-fields))
    (w "clogl.opengl.gl14" "src/clogl/opengl/gl14.clj" (for-class GL14 gl-methods get-fields))
    (w "clogl.opengl.gl15" "src/clogl/opengl/gl15.clj" (for-class GL15 gl-methods get-fields))
    (w "clogl.opengl.gl20" "src/clogl/opengl/gl20.clj" (for-class GL20 gl-methods get-fields))
    (w "clogl.opengl.gl21" "src/clogl/opengl/gl21.clj" (for-class GL21 gl-methods get-fields))
    (w "clogl.opengl.gl30" "src/clogl/opengl/gl30.clj" (for-class GL30 gl-methods get-fields))
    (w "clogl.opengl.gl31" "src/clogl/opengl/gl31.clj" (for-class GL31 gl-methods get-fields))
    (w "clogl.opengl.gl32" "src/clogl/opengl/gl32.clj" (for-class GL32 gl-methods get-fields))
    (w "clogl.opengl.gl33" "src/clogl/opengl/gl33.clj" (for-class GL33 gl-methods get-fields))
    (w "clogl.opengl.gl40" "src/clogl/opengl/gl40.clj" (for-class GL40 gl-methods get-fields))))

(defn import-display-api []
  "Import the Display API"
  (let [w write-to-file]
    (w "clogl.opengl.display" "src/clogl/opengl/display.clj" (for-class Display no-java-methods get-fields))))

(defn import []
  "Import all the APIs. Run this from the root of this project to generate the files."
  (import-gl-api)
  (import-display-api))
