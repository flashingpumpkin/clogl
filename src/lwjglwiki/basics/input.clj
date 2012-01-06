(ns lwjglwiki.basics.input
  (:require [clogl.opengl.display :as display]
            [clogl.input.mouse :as mouse]
            [clogl.input.keyboard :as keyboard])
  (:import [org.lwjgl.opengl DisplayMode]))

(defn poll-input []
  (when (mouse/is-button-down 0)
    (println (str "Mouse is down at: " (mouse/get-x) " " (mouse/get-y))))
  (when (keyboard/is-key-down keyboard/key_space)
    (println (str "Space pressed")))
  (while (keyboard/next)
    (let [current-key (keyboard/get-event-key)
          status (if (keyboard/get-event-key-state)
                   (condp = current-key
                     keyboard/key_a "A pressed"
                     keyboard/key_s "S pressed"
                     keyboard/key_d "D pressed"
                     "Something else pressed")
                   (condp = current-key
                     keyboard/key_a "A released"
                     keyboard/key_s "S released"
                     keyboard/key_d "D released"
                     "Something else released"))]
      (println status))))

(defn run []
  (let [mode (DisplayMode. 800 600)]
    (display/set-display-mode mode)
    (display/create)
    (loop []
      (when (not (display/is-close-requested))
        (do
          (poll-input)
          (display/update))
          (recur)))
    (display/destroy)))

