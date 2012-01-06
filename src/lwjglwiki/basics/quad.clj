(ns lwjglwiki.basics.quad
  (:require [clogl.opengl.display :as display]
            [clogl.input.mouse :as mouse]
            [clogl.input.keyboard :as keyboard])
  (:import [org.lwjgl.opengl DisplayMode]))

(use 'clogl.opengl.gl11)

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

(defn draw []
  (gl-clear (bit-or gl_color_buffer_bit gl_depth_buffer_bit))
  (gl-color3f (float 0.5) (float 0.5) (float 1.0))
  (gl-begin gl_quads)
  (gl-vertex2f 100 100)
  (gl-vertex2f 300 100)
  (gl-vertex2f 300 300)
  (gl-vertex2f 100 300)
  (gl-end))

(defn run []
  (let [mode (DisplayMode. 800 600)]
    (display/set-display-mode mode)
    (display/create)
    (gl-matrix-mode gl_projection)
    (gl-load-identity)
    (gl-ortho 0 800 600 0 1 -1)
    (gl-matrix-mode gl_modelview)
    
    (loop []
      (when (not (display/is-close-requested))
        (do
          (poll-input)
          (draw)
          (display/update))
          (recur)))
    (display/destroy)))

