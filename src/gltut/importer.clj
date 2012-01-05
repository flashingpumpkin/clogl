(ns gltut.importer
  (:import [java.lang.reflect Method Field]))

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

(defn get-cls-method
  "Return the first method on a class matching a given name.

  user=> (get-method System \"currentTimeMillis\")"
  [class the-method]
  (first (filter #(= (method-name %) the-method)
                 (get-methods class))))

(defn get-cls-field
  "Return the field on a class matching the given name"
  [class the-field]
  (first (filter #(= (field-name %) the-field)
                 (get-fields class))))

(defmacro import-method
  "Import public static methods on classes as functions into the current
   namespace for later reuse.

  user=> (import-method java.lang.Math sqrt my-sqrt)"
  [class import-what import-as]
  (let [the-class (. Class forName (str class))
        the-method (get-cls-method the-class (str import-what))
        tmp-params (into [] (map (fn [_] `arg#) (get-parameters the-method)))
        params (or tmp-params [])]
    `(defn ~import-as ~params
       (. ~class ~import-what ~@params))))

(defmacro import-field
  "Import a public static field from a class into the current namespace as
   a def"
  [class import-what import-as]
  (let [the-class (. Class forName (str class))]
    `(def ~import-as (. ~class ~import-what))))

(defmacro import-cls-method
  "Import public static methods from classes directly
   user=> (import-cls-method System currentTimeMillis millis"
  [cls]
  `~'cls)


(import-method java.lang.System currentTimeMillis millis)