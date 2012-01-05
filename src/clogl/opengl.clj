(ns clogl.opengl
  (:import [org.lwjgl.opengl 
                             Display DisplayMode
                             GL11 GL12 GL13 GL14 GL15
                             GL20 GL21
                             GL30 GL31 GL32 GL33
                             GL40])
  (:use clogl.utils.import-static))

(import-static org.lwjgl.opengl.Display setDisplayMode)

(println `setDisplayMode)
;(import-static org.lwjgl.opengl.Display destroyDisplay)

;(import-all-statics org.lwjgl.opengl.Display)
;(import-all-statics org.lwjgl.opengl.GL11)
