(ns gltut.core
  (:import [org.lwjgl.opengl Display DisplayMode]))

(defn start-single-thread [app loop-fn]
  "Start a rendering thread running `loop-fn`"
  )

(defn basic-loop []
  "The most basic loop for rendering.")

(defn start [callbacks state]
  "Start the application from scratch, or some predefined state.
  Callbacks include:
  
  :defaults [state] - Called before the display is created. Change title, size, etc here.
  :init     [state] - Called after Lwjgl is initialized. Load things into OpenGL here before actual rendering takes place.
  :reshape  [[x y width height] state] - Called when the window is resized.
  :keyboard [key state] - Called whenever the user presses a key"
  (start-single-thread (create callbacks state) basic-loop))