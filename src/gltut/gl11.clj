(ns gltut.gl11
  (:use [gltut.importer]))

(import-method org.lwjgl.opengl.GL11 glClearColor gl-clear-color)
(import-method org.lwjgl.opengl.GL11 glClear gl-clear)
(import-method org.lwjgl.opengl.GL11 glGetError gl-get-error)
(import-method org.lwjgl.opengl.GL11 glGetString gl-get-string)
(import-method org.lwjgl.opengl.GL11 glGetInteger gl-get-integer)
(import-method org.lwjgl.opengl.GL11 glGetInteger gl-get-integer)
(import-method org.lwjgl.opengl.GL11 glAccum gl-accum)
(import-method org.lwjgl.opengl.GL11 glAlphaFunc gl-alpha-func)
(import-method org.lwjgl.opengl.GL11 glClearAccum gl-clear-accum)
(import-method org.lwjgl.opengl.GL11 glCallLists gl-call-lists)
(import-method org.lwjgl.opengl.GL11 glCallLists gl-call-lists)
(import-method org.lwjgl.opengl.GL11 glCallLists gl-call-lists)
(import-method org.lwjgl.opengl.GL11 glCallList gl-call-list)
(import-method org.lwjgl.opengl.GL11 glBlendFunc gl-blend-func)
(import-method org.lwjgl.opengl.GL11 glBitmap gl-bitmap)
(import-method org.lwjgl.opengl.GL11 glBitmap gl-bitmap)
(import-method org.lwjgl.opengl.GL11 glBindTexture gl-bind-texture)
(import-method org.lwjgl.opengl.GL11 glPrioritizeTextures gl-prioritize-textures)
(import-method org.lwjgl.opengl.GL11 glAreTexturesResident gl-are-textures-resident)
(import-method org.lwjgl.opengl.GL11 glBegin gl-begin)
(import-method org.lwjgl.opengl.GL11 glEnd gl-end)
(import-method org.lwjgl.opengl.GL11 glArrayElement gl-array-element)
(import-method org.lwjgl.opengl.GL11 glClearDepth gl-clear-depth)
(import-method org.lwjgl.opengl.GL11 glDeleteLists gl-delete-lists)
(import-method org.lwjgl.opengl.GL11 glDeleteTextures gl-delete-textures)
(import-method org.lwjgl.opengl.GL11 glDeleteTextures gl-delete-textures)
(import-method org.lwjgl.opengl.GL11 glCullFace gl-cull-face)
(import-method org.lwjgl.opengl.GL11 glCopyTexSubImage2D gl-copy-tex-sub-image2d)
(import-method org.lwjgl.opengl.GL11 glCopyTexSubImage1D gl-copy-tex-sub-image1d)
(import-method org.lwjgl.opengl.GL11 glCopyTexImage2D gl-copy-tex-image2d)
(import-method org.lwjgl.opengl.GL11 glCopyTexImage1D gl-copy-tex-image1d)
(import-method org.lwjgl.opengl.GL11 glCopyPixels gl-copy-pixels)
(import-method org.lwjgl.opengl.GL11 glColorPointer gl-color-pointer)
(import-method org.lwjgl.opengl.GL11 glColorPointer gl-color-pointer)
(import-method org.lwjgl.opengl.GL11 glColorPointer gl-color-pointer)
(import-method org.lwjgl.opengl.GL11 glColorPointer gl-color-pointer)
(import-method org.lwjgl.opengl.GL11 glColorMaterial gl-color-material)
(import-method org.lwjgl.opengl.GL11 glColorMask gl-color-mask)
(import-method org.lwjgl.opengl.GL11 glColor3b gl-color3b)
(import-method org.lwjgl.opengl.GL11 glColor3f gl-color3f)
(import-method org.lwjgl.opengl.GL11 glColor3d gl-color3d)
(import-method org.lwjgl.opengl.GL11 glColor3ub gl-color3ub)
(import-method org.lwjgl.opengl.GL11 glColor4b gl-color4b)
(import-method org.lwjgl.opengl.GL11 glColor4f gl-color4f)
(import-method org.lwjgl.opengl.GL11 glColor4d gl-color4d)
(import-method org.lwjgl.opengl.GL11 glColor4ub gl-color4ub)
(import-method org.lwjgl.opengl.GL11 glClipPlane gl-clip-plane)
(import-method org.lwjgl.opengl.GL11 glClearStencil gl-clear-stencil)
(import-method org.lwjgl.opengl.GL11 glEvalPoint1 gl-eval-point1)
(import-method org.lwjgl.opengl.GL11 glEvalPoint2 gl-eval-point2)
(import-method org.lwjgl.opengl.GL11 glEvalMesh1 gl-eval-mesh1)
(import-method org.lwjgl.opengl.GL11 glEvalMesh2 gl-eval-mesh2)
(import-method org.lwjgl.opengl.GL11 glEvalCoord1f gl-eval-coord1f)
(import-method org.lwjgl.opengl.GL11 glEvalCoord1d gl-eval-coord1d)
(import-method org.lwjgl.opengl.GL11 glEvalCoord2f gl-eval-coord2f)
(import-method org.lwjgl.opengl.GL11 glEvalCoord2d gl-eval-coord2d)
(import-method org.lwjgl.opengl.GL11 glEnableClientState gl-enable-client-state)
(import-method org.lwjgl.opengl.GL11 glDisableClientState gl-disable-client-state)
(import-method org.lwjgl.opengl.GL11 glEnable gl-enable)
(import-method org.lwjgl.opengl.GL11 glDisable gl-disable)
(import-method org.lwjgl.opengl.GL11 glEdgeFlagPointer gl-edge-flag-pointer)
(import-method org.lwjgl.opengl.GL11 glEdgeFlagPointer gl-edge-flag-pointer)
(import-method org.lwjgl.opengl.GL11 glEdgeFlag gl-edge-flag)
(import-method org.lwjgl.opengl.GL11 glDrawPixels gl-draw-pixels)
(import-method org.lwjgl.opengl.GL11 glDrawPixels gl-draw-pixels)
(import-method org.lwjgl.opengl.GL11 glDrawPixels gl-draw-pixels)
(import-method org.lwjgl.opengl.GL11 glDrawPixels gl-draw-pixels)
(import-method org.lwjgl.opengl.GL11 glDrawElements gl-draw-elements)
(import-method org.lwjgl.opengl.GL11 glDrawElements gl-draw-elements)
(import-method org.lwjgl.opengl.GL11 glDrawElements gl-draw-elements)
(import-method org.lwjgl.opengl.GL11 glDrawElements gl-draw-elements)
(import-method org.lwjgl.opengl.GL11 glDrawBuffer gl-draw-buffer)
(import-method org.lwjgl.opengl.GL11 glDrawArrays gl-draw-arrays)
(import-method org.lwjgl.opengl.GL11 glDepthRange gl-depth-range)
(import-method org.lwjgl.opengl.GL11 glDepthMask gl-depth-mask)
(import-method org.lwjgl.opengl.GL11 glDepthFunc gl-depth-func)
(import-method org.lwjgl.opengl.GL11 glFeedbackBuffer gl-feedback-buffer)
(import-method org.lwjgl.opengl.GL11 glGetPixelMap gl-get-pixel-map)
(import-method org.lwjgl.opengl.GL11 glGetPixelMapfv gl-get-pixel-mapfv)
(import-method org.lwjgl.opengl.GL11 glGetPixelMapu gl-get-pixel-mapu)
(import-method org.lwjgl.opengl.GL11 glGetPixelMapu gl-get-pixel-mapu)
(import-method org.lwjgl.opengl.GL11 glGetPixelMapuiv gl-get-pixel-mapuiv)
(import-method org.lwjgl.opengl.GL11 glGetPixelMapusv gl-get-pixel-mapusv)
(import-method org.lwjgl.opengl.GL11 glGetMaterial gl-get-material)
(import-method org.lwjgl.opengl.GL11 glGetMaterial gl-get-material)
(import-method org.lwjgl.opengl.GL11 glGetMap gl-get-map)
(import-method org.lwjgl.opengl.GL11 glGetMap gl-get-map)
(import-method org.lwjgl.opengl.GL11 glGetMap gl-get-map)
(import-method org.lwjgl.opengl.GL11 glGetLight gl-get-light)
(import-method org.lwjgl.opengl.GL11 glGetLight gl-get-light)
(import-method org.lwjgl.opengl.GL11 glGetClipPlane gl-get-clip-plane)
(import-method org.lwjgl.opengl.GL11 glGetBoolean gl-get-boolean)
(import-method org.lwjgl.opengl.GL11 glGetBoolean gl-get-boolean)
(import-method org.lwjgl.opengl.GL11 glGetDouble gl-get-double)
(import-method org.lwjgl.opengl.GL11 glGetDouble gl-get-double)
(import-method org.lwjgl.opengl.GL11 glGetFloat gl-get-float)
(import-method org.lwjgl.opengl.GL11 glGetFloat gl-get-float)
(import-method org.lwjgl.opengl.GL11 glGenTextures gl-gen-textures)
(import-method org.lwjgl.opengl.GL11 glGenTextures gl-gen-textures)
(import-method org.lwjgl.opengl.GL11 glGenLists gl-gen-lists)
(import-method org.lwjgl.opengl.GL11 glFrustum gl-frustum)
(import-method org.lwjgl.opengl.GL11 glFrontFace gl-front-face)
(import-method org.lwjgl.opengl.GL11 glFogf gl-fogf)
(import-method org.lwjgl.opengl.GL11 glFogi gl-fogi)
(import-method org.lwjgl.opengl.GL11 glFog gl-fog)
(import-method org.lwjgl.opengl.GL11 glFog gl-fog)
(import-method org.lwjgl.opengl.GL11 glFlush gl-flush)
(import-method org.lwjgl.opengl.GL11 glFinish gl-finish)
(import-method org.lwjgl.opengl.GL11 glGetPointer gl-get-pointer)
(import-method org.lwjgl.opengl.GL11 glIsEnabled gl-is-enabled)
(import-method org.lwjgl.opengl.GL11 glInterleavedArrays gl-interleaved-arrays)
(import-method org.lwjgl.opengl.GL11 glInterleavedArrays gl-interleaved-arrays)
(import-method org.lwjgl.opengl.GL11 glInterleavedArrays gl-interleaved-arrays)
(import-method org.lwjgl.opengl.GL11 glInterleavedArrays gl-interleaved-arrays)
(import-method org.lwjgl.opengl.GL11 glInterleavedArrays gl-interleaved-arrays)
(import-method org.lwjgl.opengl.GL11 glInterleavedArrays gl-interleaved-arrays)
(import-method org.lwjgl.opengl.GL11 glInitNames gl-init-names)
(import-method org.lwjgl.opengl.GL11 glHint gl-hint)
(import-method org.lwjgl.opengl.GL11 glGetTexParameter gl-get-tex-parameter)
(import-method org.lwjgl.opengl.GL11 glGetTexParameter gl-get-tex-parameter)
(import-method org.lwjgl.opengl.GL11 glGetTexParameterf gl-get-tex-parameterf)
(import-method org.lwjgl.opengl.GL11 glGetTexParameteri gl-get-tex-parameteri)
(import-method org.lwjgl.opengl.GL11 glGetTexLevelParameter gl-get-tex-level-parameter)
(import-method org.lwjgl.opengl.GL11 glGetTexLevelParameter gl-get-tex-level-parameter)
(import-method org.lwjgl.opengl.GL11 glGetTexLevelParameterf gl-get-tex-level-parameterf)
(import-method org.lwjgl.opengl.GL11 glGetTexLevelParameteri gl-get-tex-level-parameteri)
(import-method org.lwjgl.opengl.GL11 glGetTexImage gl-get-tex-image)
(import-method org.lwjgl.opengl.GL11 glGetTexImage gl-get-tex-image)
(import-method org.lwjgl.opengl.GL11 glGetTexImage gl-get-tex-image)
(import-method org.lwjgl.opengl.GL11 glGetTexImage gl-get-tex-image)
(import-method org.lwjgl.opengl.GL11 glGetTexImage gl-get-tex-image)
(import-method org.lwjgl.opengl.GL11 glGetTexImage gl-get-tex-image)
(import-method org.lwjgl.opengl.GL11 glGetTexGen gl-get-tex-gen)
(import-method org.lwjgl.opengl.GL11 glGetTexGen gl-get-tex-gen)
(import-method org.lwjgl.opengl.GL11 glGetTexGen gl-get-tex-gen)
(import-method org.lwjgl.opengl.GL11 glGetTexGeni gl-get-tex-geni)
(import-method org.lwjgl.opengl.GL11 glGetTexGenf gl-get-tex-genf)
(import-method org.lwjgl.opengl.GL11 glGetTexGend gl-get-tex-gend)
(import-method org.lwjgl.opengl.GL11 glGetTexEnv gl-get-tex-env)
(import-method org.lwjgl.opengl.GL11 glGetTexEnv gl-get-tex-env)
(import-method org.lwjgl.opengl.GL11 glGetTexEnvi gl-get-tex-envi)
(import-method org.lwjgl.opengl.GL11 glGetTexEnvf gl-get-tex-envf)
(import-method org.lwjgl.opengl.GL11 glGetPolygonStipple gl-get-polygon-stipple)
(import-method org.lwjgl.opengl.GL11 glGetPolygonStipple gl-get-polygon-stipple)
(import-method org.lwjgl.opengl.GL11 glIsList gl-is-list)
(import-method org.lwjgl.opengl.GL11 glMaterialf gl-materialf)
(import-method org.lwjgl.opengl.GL11 glMateriali gl-materiali)
(import-method org.lwjgl.opengl.GL11 glMaterial gl-material)
(import-method org.lwjgl.opengl.GL11 glMaterial gl-material)
(import-method org.lwjgl.opengl.GL11 glMapGrid1f gl-map-grid1f)
(import-method org.lwjgl.opengl.GL11 glMapGrid1d gl-map-grid1d)
(import-method org.lwjgl.opengl.GL11 glMapGrid2f gl-map-grid2f)
(import-method org.lwjgl.opengl.GL11 glMapGrid2d gl-map-grid2d)
(import-method org.lwjgl.opengl.GL11 glMap2f gl-map2f)
(import-method org.lwjgl.opengl.GL11 glMap2d gl-map2d)
(import-method org.lwjgl.opengl.GL11 glMap1f gl-map1f)
(import-method org.lwjgl.opengl.GL11 glMap1d gl-map1d)
(import-method org.lwjgl.opengl.GL11 glLogicOp gl-logic-op)
(import-method org.lwjgl.opengl.GL11 glLoadName gl-load-name)
(import-method org.lwjgl.opengl.GL11 glLoadMatrix gl-load-matrix)
(import-method org.lwjgl.opengl.GL11 glLoadMatrix gl-load-matrix)
(import-method org.lwjgl.opengl.GL11 glLoadIdentity gl-load-identity)
(import-method org.lwjgl.opengl.GL11 glListBase gl-list-base)
(import-method org.lwjgl.opengl.GL11 glLineWidth gl-line-width)
(import-method org.lwjgl.opengl.GL11 glLineStipple gl-line-stipple)
(import-method org.lwjgl.opengl.GL11 glLightModelf gl-light-modelf)
(import-method org.lwjgl.opengl.GL11 glLightModeli gl-light-modeli)
(import-method org.lwjgl.opengl.GL11 glLightModel gl-light-model)
(import-method org.lwjgl.opengl.GL11 glLightModel gl-light-model)
(import-method org.lwjgl.opengl.GL11 glLightf gl-lightf)
(import-method org.lwjgl.opengl.GL11 glLighti gl-lighti)
(import-method org.lwjgl.opengl.GL11 glLight gl-light)
(import-method org.lwjgl.opengl.GL11 glLight gl-light)
(import-method org.lwjgl.opengl.GL11 glIsTexture gl-is-texture)
(import-method org.lwjgl.opengl.GL11 glMatrixMode gl-matrix-mode)
(import-method org.lwjgl.opengl.GL11 glPolygonStipple gl-polygon-stipple)
(import-method org.lwjgl.opengl.GL11 glPolygonStipple gl-polygon-stipple)
(import-method org.lwjgl.opengl.GL11 glPolygonOffset gl-polygon-offset)
(import-method org.lwjgl.opengl.GL11 glPolygonMode gl-polygon-mode)
(import-method org.lwjgl.opengl.GL11 glPointSize gl-point-size)
(import-method org.lwjgl.opengl.GL11 glPixelZoom gl-pixel-zoom)
(import-method org.lwjgl.opengl.GL11 glPixelTransferf gl-pixel-transferf)
(import-method org.lwjgl.opengl.GL11 glPixelTransferi gl-pixel-transferi)
(import-method org.lwjgl.opengl.GL11 glPixelStoref gl-pixel-storef)
(import-method org.lwjgl.opengl.GL11 glPixelStorei gl-pixel-storei)
(import-method org.lwjgl.opengl.GL11 glPixelMap gl-pixel-map)
(import-method org.lwjgl.opengl.GL11 glPixelMapfv gl-pixel-mapfv)
(import-method org.lwjgl.opengl.GL11 glPixelMapu gl-pixel-mapu)
(import-method org.lwjgl.opengl.GL11 glPixelMapu gl-pixel-mapu)
(import-method org.lwjgl.opengl.GL11 glPixelMapuiv gl-pixel-mapuiv)
(import-method org.lwjgl.opengl.GL11 glPixelMapusv gl-pixel-mapusv)
(import-method org.lwjgl.opengl.GL11 glPassThrough gl-pass-through)
(import-method org.lwjgl.opengl.GL11 glOrtho gl-ortho)
(import-method org.lwjgl.opengl.GL11 glNormalPointer gl-normal-pointer)
(import-method org.lwjgl.opengl.GL11 glNormalPointer gl-normal-pointer)
(import-method org.lwjgl.opengl.GL11 glNormalPointer gl-normal-pointer)
(import-method org.lwjgl.opengl.GL11 glNormalPointer gl-normal-pointer)
(import-method org.lwjgl.opengl.GL11 glNormalPointer gl-normal-pointer)
(import-method org.lwjgl.opengl.GL11 glNormal3b gl-normal3b)
(import-method org.lwjgl.opengl.GL11 glNormal3f gl-normal3f)
(import-method org.lwjgl.opengl.GL11 glNormal3d gl-normal3d)
(import-method org.lwjgl.opengl.GL11 glNormal3i gl-normal3i)
(import-method org.lwjgl.opengl.GL11 glNewList gl-new-list)
(import-method org.lwjgl.opengl.GL11 glEndList gl-end-list)
(import-method org.lwjgl.opengl.GL11 glMultMatrix gl-mult-matrix)
(import-method org.lwjgl.opengl.GL11 glMultMatrix gl-mult-matrix)
(import-method org.lwjgl.opengl.GL11 glShadeModel gl-shade-model)
(import-method org.lwjgl.opengl.GL11 glSelectBuffer gl-select-buffer)
(import-method org.lwjgl.opengl.GL11 glScissor gl-scissor)
(import-method org.lwjgl.opengl.GL11 glScalef gl-scalef)
(import-method org.lwjgl.opengl.GL11 glScaled gl-scaled)
(import-method org.lwjgl.opengl.GL11 glRotatef gl-rotatef)
(import-method org.lwjgl.opengl.GL11 glRenderMode gl-render-mode)
(import-method org.lwjgl.opengl.GL11 glRectf gl-rectf)
(import-method org.lwjgl.opengl.GL11 glRectd gl-rectd)
(import-method org.lwjgl.opengl.GL11 glRecti gl-recti)
(import-method org.lwjgl.opengl.GL11 glReadPixels gl-read-pixels)
(import-method org.lwjgl.opengl.GL11 glReadPixels gl-read-pixels)
(import-method org.lwjgl.opengl.GL11 glReadPixels gl-read-pixels)
(import-method org.lwjgl.opengl.GL11 glReadPixels gl-read-pixels)
(import-method org.lwjgl.opengl.GL11 glReadPixels gl-read-pixels)
(import-method org.lwjgl.opengl.GL11 glReadPixels gl-read-pixels)
(import-method org.lwjgl.opengl.GL11 glReadBuffer gl-read-buffer)
(import-method org.lwjgl.opengl.GL11 glRasterPos2f gl-raster-pos2f)
(import-method org.lwjgl.opengl.GL11 glRasterPos2d gl-raster-pos2d)
(import-method org.lwjgl.opengl.GL11 glRasterPos2i gl-raster-pos2i)
(import-method org.lwjgl.opengl.GL11 glRasterPos3f gl-raster-pos3f)
(import-method org.lwjgl.opengl.GL11 glRasterPos3d gl-raster-pos3d)
(import-method org.lwjgl.opengl.GL11 glRasterPos3i gl-raster-pos3i)
(import-method org.lwjgl.opengl.GL11 glRasterPos4f gl-raster-pos4f)
(import-method org.lwjgl.opengl.GL11 glRasterPos4d gl-raster-pos4d)
(import-method org.lwjgl.opengl.GL11 glRasterPos4i gl-raster-pos4i)
(import-method org.lwjgl.opengl.GL11 glPushName gl-push-name)
(import-method org.lwjgl.opengl.GL11 glPopName gl-pop-name)
(import-method org.lwjgl.opengl.GL11 glPushMatrix gl-push-matrix)
(import-method org.lwjgl.opengl.GL11 glPopMatrix gl-pop-matrix)
(import-method org.lwjgl.opengl.GL11 glPushClientAttrib gl-push-client-attrib)
(import-method org.lwjgl.opengl.GL11 glPopClientAttrib gl-pop-client-attrib)
(import-method org.lwjgl.opengl.GL11 glPushAttrib gl-push-attrib)
(import-method org.lwjgl.opengl.GL11 glPopAttrib gl-pop-attrib)
(import-method org.lwjgl.opengl.GL11 glStencilFunc gl-stencil-func)
(import-method org.lwjgl.opengl.GL11 glVertexPointer gl-vertex-pointer)
(import-method org.lwjgl.opengl.GL11 glVertexPointer gl-vertex-pointer)
(import-method org.lwjgl.opengl.GL11 glVertexPointer gl-vertex-pointer)
(import-method org.lwjgl.opengl.GL11 glVertexPointer gl-vertex-pointer)
(import-method org.lwjgl.opengl.GL11 glVertexPointer gl-vertex-pointer)
(import-method org.lwjgl.opengl.GL11 glVertex2f gl-vertex2f)
(import-method org.lwjgl.opengl.GL11 glVertex2d gl-vertex2d)
(import-method org.lwjgl.opengl.GL11 glVertex2i gl-vertex2i)
(import-method org.lwjgl.opengl.GL11 glVertex3f gl-vertex3f)
(import-method org.lwjgl.opengl.GL11 glVertex3d gl-vertex3d)
(import-method org.lwjgl.opengl.GL11 glVertex3i gl-vertex3i)
(import-method org.lwjgl.opengl.GL11 glVertex4f gl-vertex4f)
(import-method org.lwjgl.opengl.GL11 glVertex4d gl-vertex4d)
(import-method org.lwjgl.opengl.GL11 glVertex4i gl-vertex4i)
(import-method org.lwjgl.opengl.GL11 glTranslatef gl-translatef)
(import-method org.lwjgl.opengl.GL11 glTranslated gl-translated)
(import-method org.lwjgl.opengl.GL11 glTexImage1D gl-tex-image1d)
(import-method org.lwjgl.opengl.GL11 glTexImage1D gl-tex-image1d)
(import-method org.lwjgl.opengl.GL11 glTexImage1D gl-tex-image1d)
(import-method org.lwjgl.opengl.GL11 glTexImage1D gl-tex-image1d)
(import-method org.lwjgl.opengl.GL11 glTexImage1D gl-tex-image1d)
(import-method org.lwjgl.opengl.GL11 glTexImage1D gl-tex-image1d)
(import-method org.lwjgl.opengl.GL11 glTexImage2D gl-tex-image2d)
(import-method org.lwjgl.opengl.GL11 glTexImage2D gl-tex-image2d)
(import-method org.lwjgl.opengl.GL11 glTexImage2D gl-tex-image2d)
(import-method org.lwjgl.opengl.GL11 glTexImage2D gl-tex-image2d)
(import-method org.lwjgl.opengl.GL11 glTexImage2D gl-tex-image2d)
(import-method org.lwjgl.opengl.GL11 glTexImage2D gl-tex-image2d)
(import-method org.lwjgl.opengl.GL11 glTexSubImage1D gl-tex-sub-image1d)
(import-method org.lwjgl.opengl.GL11 glTexSubImage1D gl-tex-sub-image1d)
(import-method org.lwjgl.opengl.GL11 glTexSubImage1D gl-tex-sub-image1d)
(import-method org.lwjgl.opengl.GL11 glTexSubImage1D gl-tex-sub-image1d)
(import-method org.lwjgl.opengl.GL11 glTexSubImage1D gl-tex-sub-image1d)
(import-method org.lwjgl.opengl.GL11 glTexSubImage1D gl-tex-sub-image1d)
(import-method org.lwjgl.opengl.GL11 glTexSubImage2D gl-tex-sub-image2d)
(import-method org.lwjgl.opengl.GL11 glTexSubImage2D gl-tex-sub-image2d)
(import-method org.lwjgl.opengl.GL11 glTexSubImage2D gl-tex-sub-image2d)
(import-method org.lwjgl.opengl.GL11 glTexSubImage2D gl-tex-sub-image2d)
(import-method org.lwjgl.opengl.GL11 glTexSubImage2D gl-tex-sub-image2d)
(import-method org.lwjgl.opengl.GL11 glTexSubImage2D gl-tex-sub-image2d)
(import-method org.lwjgl.opengl.GL11 glTexParameterf gl-tex-parameterf)
(import-method org.lwjgl.opengl.GL11 glTexParameteri gl-tex-parameteri)
(import-method org.lwjgl.opengl.GL11 glTexParameter gl-tex-parameter)
(import-method org.lwjgl.opengl.GL11 glTexParameter gl-tex-parameter)
(import-method org.lwjgl.opengl.GL11 glTexGenf gl-tex-genf)
(import-method org.lwjgl.opengl.GL11 glTexGend gl-tex-gend)
(import-method org.lwjgl.opengl.GL11 glTexGen gl-tex-gen)
(import-method org.lwjgl.opengl.GL11 glTexGen gl-tex-gen)
(import-method org.lwjgl.opengl.GL11 glTexGen gl-tex-gen)
(import-method org.lwjgl.opengl.GL11 glTexGeni gl-tex-geni)
(import-method org.lwjgl.opengl.GL11 glTexEnvf gl-tex-envf)
(import-method org.lwjgl.opengl.GL11 glTexEnvi gl-tex-envi)
(import-method org.lwjgl.opengl.GL11 glTexEnv gl-tex-env)
(import-method org.lwjgl.opengl.GL11 glTexEnv gl-tex-env)
(import-method org.lwjgl.opengl.GL11 glTexCoordPointer gl-tex-coord-pointer)
(import-method org.lwjgl.opengl.GL11 glTexCoordPointer gl-tex-coord-pointer)
(import-method org.lwjgl.opengl.GL11 glTexCoordPointer gl-tex-coord-pointer)
(import-method org.lwjgl.opengl.GL11 glTexCoordPointer gl-tex-coord-pointer)
(import-method org.lwjgl.opengl.GL11 glTexCoordPointer gl-tex-coord-pointer)
(import-method org.lwjgl.opengl.GL11 glTexCoord1f gl-tex-coord1f)
(import-method org.lwjgl.opengl.GL11 glTexCoord1d gl-tex-coord1d)
(import-method org.lwjgl.opengl.GL11 glTexCoord2f gl-tex-coord2f)
(import-method org.lwjgl.opengl.GL11 glTexCoord2d gl-tex-coord2d)
(import-method org.lwjgl.opengl.GL11 glTexCoord3f gl-tex-coord3f)
(import-method org.lwjgl.opengl.GL11 glTexCoord3d gl-tex-coord3d)
(import-method org.lwjgl.opengl.GL11 glTexCoord4f gl-tex-coord4f)
(import-method org.lwjgl.opengl.GL11 glTexCoord4d gl-tex-coord4d)
(import-method org.lwjgl.opengl.GL11 glStencilOp gl-stencil-op)
(import-method org.lwjgl.opengl.GL11 glStencilMask gl-stencil-mask)
(import-method org.lwjgl.opengl.GL11 glViewport gl-viewport)