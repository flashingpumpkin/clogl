(ns gltut.vectors)

(defn op [op a b]
  (map #(apply op %) (map vector a b)))
  
(defn scalar [scale]
  (repeatedly (fn [] scale)))

(defn add [a b]
  (op + a b))

(defn substract [a b]
  (op - a b))
 
(defn multiply [a b]
  (op * a b))

(defn divide [a b]
  (op / a b))

(defn scale [a scale]
  (op * a (scalar scale)))

(defn scale-add [a scale]
  (op + a (scalar scale)))

(defn length [a]
  (let [power (op * a a)]
    (Math/sqrt (reduce + power))))

(defn normalize [a]
  "Normalize a vector to length 1"
  (let [length (length a)]
    (op / a (scalar length))))