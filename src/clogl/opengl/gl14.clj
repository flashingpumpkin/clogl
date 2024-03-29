(ns clogl.opengl.gl14 (:use [clogl.utils.importer])) 

(import-field org.lwjgl.opengl.GL14 GL_GENERATE_MIPMAP_HINT gl_generate_mipmap_hint)
(import-field org.lwjgl.opengl.GL14 GL_FRAGMENT_DEPTH gl_fragment_depth)
(import-field org.lwjgl.opengl.GL14 GL_FOG_COORDINATE_ARRAY gl_fog_coordinate_array)
(import-field org.lwjgl.opengl.GL14 GL_DEPTH_TEXTURE_MODE gl_depth_texture_mode)
(import-field org.lwjgl.opengl.GL14 GL_POINT_SIZE_MIN gl_point_size_min)
(import-method org.lwjgl.opengl.GL14 glFogCoordf gl-fog-coordf)
(import-field org.lwjgl.opengl.GL14 GL_TEXTURE_COMPARE_FUNC gl_texture_compare_func)
(import-method org.lwjgl.opengl.GL14 glPointParameteri gl-point-parameteri)
(import-field org.lwjgl.opengl.GL14 GL_TEXTURE_DEPTH_SIZE gl_texture_depth_size)
(import-field org.lwjgl.opengl.GL14 GL_FOG_COORDINATE_ARRAY_POINTER gl_fog_coordinate_array_pointer)
(import-field org.lwjgl.opengl.GL14 GL_TEXTURE_COMPARE_MODE gl_texture_compare_mode)
(import-method org.lwjgl.opengl.GL14 glSecondaryColor3d gl-secondary-color3d)
(import-method org.lwjgl.opengl.GL14 glSecondaryColor3b gl-secondary-color3b)
(import-method org.lwjgl.opengl.GL14 glFogCoordd gl-fog-coordd)
(import-method org.lwjgl.opengl.GL14 glSecondaryColor3f gl-secondary-color3f)
(import-method org.lwjgl.opengl.GL14 glMultiDrawArrays gl-multi-draw-arrays)
(import-method org.lwjgl.opengl.GL14 glBlendFuncSeparate gl-blend-func-separate)
(import-method org.lwjgl.opengl.GL14 glWindowPos2i gl-window-pos2i)
(import-field org.lwjgl.opengl.GL14 GL_POINT_DISTANCE_ATTENUATION gl_point_distance_attenuation)
(import-field org.lwjgl.opengl.GL14 GL_CURRENT_FOG_COORDINATE gl_current_fog_coordinate)
(import-method org.lwjgl.opengl.GL14 glPointParameterf gl-point-parameterf)
(import-method org.lwjgl.opengl.GL14 glSecondaryColor3ub gl-secondary-color3ub)
(import-method org.lwjgl.opengl.GL14 glWindowPos3i gl-window-pos3i)
(import-field org.lwjgl.opengl.GL14 GL_COMPARE_R_TO_TEXTURE gl_compare_r_to_texture)
(import-field org.lwjgl.opengl.GL14 GL_SECONDARY_COLOR_ARRAY_SIZE gl_secondary_color_array_size)
(import-method org.lwjgl.opengl.GL14 glBlendColor gl-blend-color)
(import-method org.lwjgl.opengl.GL14 glBlendEquation gl-blend-equation)
(import-method org.lwjgl.opengl.GL14 glPointParameter gl-point-parameter)
(import-method org.lwjgl.opengl.GL14 glWindowPos2f gl-window-pos2f)
(import-method org.lwjgl.opengl.GL14 glFogCoordPointer gl-fog-coord-pointer)
(import-method org.lwjgl.opengl.GL14 glWindowPos3f gl-window-pos3f)
(import-field org.lwjgl.opengl.GL14 GL_TEXTURE_LOD_BIAS gl_texture_lod_bias)
(import-method org.lwjgl.opengl.GL14 glWindowPos2d gl-window-pos2d)
(import-method org.lwjgl.opengl.GL14 glSecondaryColorPointer gl-secondary-color-pointer)
(import-field org.lwjgl.opengl.GL14 GL_TEXTURE_FILTER_CONTROL gl_texture_filter_control)
(import-field org.lwjgl.opengl.GL14 GL_BLEND_EQUATION gl_blend_equation)
(import-method org.lwjgl.opengl.GL14 glWindowPos3d gl-window-pos3d)
(import-field org.lwjgl.opengl.GL14 GL_FOG_COORDINATE gl_fog_coordinate)
(import-field org.lwjgl.opengl.GL14 GL_SECONDARY_COLOR_ARRAY_TYPE gl_secondary_color_array_type)
(import-field org.lwjgl.opengl.GL14 GL_BLEND_SRC_ALPHA gl_blend_src_alpha)
(import-field org.lwjgl.opengl.GL14 GL_MAX_TEXTURE_LOD_BIAS gl_max_texture_lod_bias)
(import-field org.lwjgl.opengl.GL14 GL_BLEND_SRC_RGB gl_blend_src_rgb)
(import-field org.lwjgl.opengl.GL14 GL_MIN gl_min)
(import-field org.lwjgl.opengl.GL14 GL_MAX gl_max)
(import-field org.lwjgl.opengl.GL14 GL_BLEND_COLOR gl_blend_color)
(import-field org.lwjgl.opengl.GL14 GL_FUNC_ADD gl_func_add)
(import-field org.lwjgl.opengl.GL14 GL_SECONDARY_COLOR_ARRAY gl_secondary_color_array)
(import-field org.lwjgl.opengl.GL14 GL_FOG_COORDINATE_ARRAY_STRIDE gl_fog_coordinate_array_stride)
(import-field org.lwjgl.opengl.GL14 GL_CURRENT_SECONDARY_COLOR gl_current_secondary_color)
(import-field org.lwjgl.opengl.GL14 GL_INCR_WRAP gl_incr_wrap)
(import-field org.lwjgl.opengl.GL14 GL_SECONDARY_COLOR_ARRAY_STRIDE gl_secondary_color_array_stride)
(import-field org.lwjgl.opengl.GL14 GL_FUNC_SUBTRACT gl_func_subtract)
(import-field org.lwjgl.opengl.GL14 GL_FOG_COORDINATE_ARRAY_TYPE gl_fog_coordinate_array_type)
(import-field org.lwjgl.opengl.GL14 GL_BLEND_DST_ALPHA gl_blend_dst_alpha)
(import-field org.lwjgl.opengl.GL14 GL_FOG_COORDINATE_SOURCE gl_fog_coordinate_source)
(import-field org.lwjgl.opengl.GL14 GL_BLEND_DST_RGB gl_blend_dst_rgb)
(import-field org.lwjgl.opengl.GL14 GL_COLOR_SUM gl_color_sum)
(import-field org.lwjgl.opengl.GL14 GL_DECR_WRAP gl_decr_wrap)
(import-field org.lwjgl.opengl.GL14 GL_POINT_FADE_THRESHOLD_SIZE gl_point_fade_threshold_size)
(import-field org.lwjgl.opengl.GL14 GL_SECONDARY_COLOR_ARRAY_POINTER gl_secondary_color_array_pointer)
(import-field org.lwjgl.opengl.GL14 GL_DEPTH_COMPONENT32 gl_depth_component32)
(import-field org.lwjgl.opengl.GL14 GL_DEPTH_COMPONENT24 gl_depth_component24)
(import-field org.lwjgl.opengl.GL14 GL_DEPTH_COMPONENT16 gl_depth_component16)
(import-field org.lwjgl.opengl.GL14 GL_GENERATE_MIPMAP gl_generate_mipmap)
(import-field org.lwjgl.opengl.GL14 GL_MIRRORED_REPEAT gl_mirrored_repeat)
(import-field org.lwjgl.opengl.GL14 GL_FUNC_REVERSE_SUBTRACT gl_func_reverse_subtract)
(import-field org.lwjgl.opengl.GL14 GL_POINT_SIZE_MAX gl_point_size_max)
