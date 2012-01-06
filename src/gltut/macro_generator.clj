; A set of functions that generates Clojure code which in turn imports
; static methods from a class.

(ns gltut.macro-generator
  (:use [gltut.importer])
  (:require [clojure.string :as s]
            [clojure.java.io :as io])
  (:import [org.lwjgl.opengl GL11 GL12 GL13 GL14 GL15 GL20 GL21 GL30 GL31 GL32 GL33 GL40 ]))

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
  (let [name (method-name method)]
    (and (= (first name) \g)
         (= (second name) \l ))))

(defn imports-for-class [class]
  (let [cls-symbol (second (s/split (str `~class) #" "))
        methods (filter is-gl-method (get-methods class))
        fields (get-fields class)
        method-lines (into #{} (map (method-import cls-symbol) methods))
        field-lines (into #{} (map (field-import cls-symbol) fields))
        ]
    (into []  (into method-lines field-lines))))

(defn imports-for-classes [classes]
  (let [all (map imports-for-class classes)]
    (flatten all)))

(defn write-to-file [filename lines]
  (with-open [writer (io/writer filename)]
    (.write writer "(ns gltut.glapi (:use [gltut.importer]))\n\n")
    (doseq [line lines]
      (.write writer line)
      (.write writer "\n"))))

(defn import-api
  "Import the whole opengl api"
  []

  (write-to-file "src/gltut/glapi.clj" (imports-for-classes
                                        [GL11 GL12 GL13 GL14 GL15 GL20 GL21 GL30 GL31 GL32 GL33 GL40])))