(ns lwjglwiki.basics.display
  (:require [clogl.opengl.display :as display])
  (:import [org.lwjgl.opengl DisplayMode]))

(defn run []
  (let [mode (DisplayMode. 800 600)]
    (display/set-display-mode mode)
    (display/create)
    (loop []
      (when (not (display/is-close-requested))
        (do (display/update))
          (recur)))
    (display/destroy)))

