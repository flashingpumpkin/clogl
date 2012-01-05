; A set of functions that generates Clojure code which in turn imports
; static methods from a class.

(ns gltut.macro-generator
  (:use [gltut.importer])
  (:require [clojure.string :as s]))

(defn renamer [method]
   (let [name (method-name method)
         replaced (s/replace name #"([a-z])([A-Z])" "$1 $2")
         split (s/split replaced #" ")]
     (s/lower-case (s/join "-" split))))

(defn create-line [cls-symbol method-name import-name]
  (str "(import-method " cls-symbol " " method-name " " import-name ")"))

(defn print-imports [class]
  (let [cls-symbol (second (s/split (str `~class) #" "))
        methods (get-methods class)]
    (s/join "\n" (into #{}  (map #(create-line cls-symbol (method-name %) (renamer %)) methods)))))

