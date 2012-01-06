(defproject clogl "0.0.1-SNAPSHOT"
  :description "Wrapper around the LWJGL API and OpenGL tutorial"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 ; Penumbra version that works with Clojure 1.3 - Just
                 ; for the OpenGL bits
                 [kephale/penumbra "0.6.0-SNAPSHOT"]
                 [slick-util "1.0.0"]]
  :java-source-path "java"
  :checksum-deps false)