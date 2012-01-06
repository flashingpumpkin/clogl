(ns clogl.opengl.gl32 (:use [clogl.utils.importer])) 

(import-field org.lwjgl.opengl.GL32 GL_MAX_GEOMETRY_INPUT_COMPONENTS gl_max_geometry_input_components)
(import-field org.lwjgl.opengl.GL32 GL_CONDITION_SATISFIED gl_condition_satisfied)
(import-field org.lwjgl.opengl.GL32 GL_PROVOKING_VERTEX gl_provoking_vertex)
(import-field org.lwjgl.opengl.GL32 GL_GEOMETRY_INPUT_TYPE gl_geometry_input_type)
(import-field org.lwjgl.opengl.GL32 GL_FIRST_VERTEX_CONVENTION gl_first_vertex_convention)
(import-field org.lwjgl.opengl.GL32 GL_LINE_STRIP_ADJACENCY gl_line_strip_adjacency)
(import-field org.lwjgl.opengl.GL32 GL_MAX_SAMPLE_MASK_WORDS gl_max_sample_mask_words)
(import-field org.lwjgl.opengl.GL32 GL_FRAMEBUFFER_ATTACHMENT_LAYERED gl_framebuffer_attachment_layered)
(import-field org.lwjgl.opengl.GL32 GL_MAX_SERVER_WAIT_TIMEOUT gl_max_server_wait_timeout)
(import-field org.lwjgl.opengl.GL32 GL_TEXTURE_CUBE_MAP_SEAMLESS gl_texture_cube_map_seamless)
(import-field org.lwjgl.opengl.GL32 GL_TIMEOUT_EXPIRED gl_timeout_expired)
(import-field org.lwjgl.opengl.GL32 GL_GEOMETRY_VERTICES_OUT gl_geometry_vertices_out)
(import-field org.lwjgl.opengl.GL32 GL_CONTEXT_COMPATIBILITY_PROFILE_BIT gl_context_compatibility_profile_bit)
(import-field org.lwjgl.opengl.GL32 GL_DEPTH_CLAMP gl_depth_clamp)
(import-field org.lwjgl.opengl.GL32 GL_MAX_COLOR_TEXTURE_SAMPLES gl_max_color_texture_samples)
(import-field org.lwjgl.opengl.GL32 GL_MAX_DEPTH_TEXTURE_SAMPLES gl_max_depth_texture_samples)
(import-field org.lwjgl.opengl.GL32 GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE gl_unsigned_int_sampler_2d_multisample)
(import-field org.lwjgl.opengl.GL32 GL_TEXTURE_SAMPLES gl_texture_samples)
(import-field org.lwjgl.opengl.GL32 GL_SAMPLE_MASK gl_sample_mask)
(import-field org.lwjgl.opengl.GL32 GL_TIMEOUT_IGNORED gl_timeout_ignored)
(import-field org.lwjgl.opengl.GL32 GL_TRIANGLES_ADJACENCY gl_triangles_adjacency)
(import-field org.lwjgl.opengl.GL32 GL_MAX_INTEGER_SAMPLES gl_max_integer_samples)
(import-field org.lwjgl.opengl.GL32 GL_SYNC_STATUS gl_sync_status)
(import-field org.lwjgl.opengl.GL32 GL_LINES_ADJACENCY gl_lines_adjacency)
(import-field org.lwjgl.opengl.GL32 GL_SAMPLE_POSITION gl_sample_position)
(import-field org.lwjgl.opengl.GL32 GL_WAIT_FAILED gl_wait_failed)
(import-field org.lwjgl.opengl.GL32 GL_MAX_GEOMETRY_UNIFORM_COMPONENTS gl_max_geometry_uniform_components)
(import-method org.lwjgl.opengl.GL32 glFramebufferTextureLayer gl-framebuffer-texture-layer)
(import-field org.lwjgl.opengl.GL32 GL_SAMPLE_MASK_VALUE gl_sample_mask_value)
(import-field org.lwjgl.opengl.GL32 GL_MAX_FRAGMENT_INPUT_COMPONENTS gl_max_fragment_input_components)
(import-field org.lwjgl.opengl.GL32 GL_SYNC_FLUSH_COMMANDS_BIT gl_sync_flush_commands_bit)
(import-method org.lwjgl.opengl.GL32 glClientWaitSync gl-client-wait-sync)
(import-field org.lwjgl.opengl.GL32 GL_GEOMETRY_SHADER gl_geometry_shader)
(import-field org.lwjgl.opengl.GL32 GL_OBJECT_TYPE gl_object_type)
(import-field org.lwjgl.opengl.GL32 GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY gl_unsigned_int_sampler_2d_multisample_array)
(import-method org.lwjgl.opengl.GL32 glProvokingVertex gl-provoking-vertex)
(import-field org.lwjgl.opengl.GL32 GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY gl_proxy_texture_2d_multisample_array)
(import-field org.lwjgl.opengl.GL32 GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS gl_max_geometry_texture_image_units)
(import-field org.lwjgl.opengl.GL32 GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS gl_framebuffer_incomplete_layer_targets)
(import-field org.lwjgl.opengl.GL32 GL_MAX_GEOMETRY_OUTPUT_VERTICES gl_max_geometry_output_vertices)
(import-method org.lwjgl.opengl.GL32 glDrawElementsBaseVertex gl-draw-elements-base-vertex)
(import-method org.lwjgl.opengl.GL32 glWaitSync gl-wait-sync)
(import-field org.lwjgl.opengl.GL32 GL_MAX_VERTEX_OUTPUT_COMPONENTS gl_max_vertex_output_components)
(import-field org.lwjgl.opengl.GL32 GL_TEXTURE_2D_MULTISAMPLE_ARRAY gl_texture_2d_multisample_array)
(import-field org.lwjgl.opengl.GL32 GL_BGRA gl_bgra)
(import-field org.lwjgl.opengl.GL32 GL_TEXTURE_BINDING_2D_MULTISAMPLE gl_texture_binding_2d_multisample)
(import-field org.lwjgl.opengl.GL32 GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER gl_framebuffer_attachment_texture_layer)
(import-field org.lwjgl.opengl.GL32 GL_SYNC_FLAGS gl_sync_flags)
(import-field org.lwjgl.opengl.GL32 GL_LAST_VERTEX_CONVENTION gl_last_vertex_convention)
(import-method org.lwjgl.opengl.GL32 glGetMultisample gl-get-multisample)
(import-method org.lwjgl.opengl.GL32 glGetInteger gl-get-integer)
(import-field org.lwjgl.opengl.GL32 GL_CONTEXT_PROFILE_MASK gl_context_profile_mask)
(import-field org.lwjgl.opengl.GL32 GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT gl_framebuffer_incomplete_layer_count)
(import-field org.lwjgl.opengl.GL32 GL_MAX_GEOMETRY_OUTPUT_COMPONENTS gl_max_geometry_output_components)
(import-method org.lwjgl.opengl.GL32 glSampleMaski gl-sample-maski)
(import-field org.lwjgl.opengl.GL32 GL_MAX_VARYING_COMPONENTS gl_max_varying_components)
(import-field org.lwjgl.opengl.GL32 GL_UNSIGNALED gl_unsignaled)
(import-method org.lwjgl.opengl.GL32 glIsSync gl-is-sync)
(import-field org.lwjgl.opengl.GL32 GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION gl_quads_follow_provoking_vertex_convention)
(import-method org.lwjgl.opengl.GL32 glDeleteSync gl-delete-sync)
(import-field org.lwjgl.opengl.GL32 GL_ALREADY_SIGNALED gl_already_signaled)
(import-field org.lwjgl.opengl.GL32 GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY gl_texture_binding_2d_multisample_array)
(import-method org.lwjgl.opengl.GL32 glDrawElementsInstancedBaseVertex gl-draw-elements-instanced-base-vertex)
(import-field org.lwjgl.opengl.GL32 GL_INT_SAMPLER_2D_MULTISAMPLE gl_int_sampler_2d_multisample)
(import-field org.lwjgl.opengl.GL32 GL_SYNC_FENCE gl_sync_fence)
(import-field org.lwjgl.opengl.GL32 GL_SAMPLER_2D_MULTISAMPLE gl_sampler_2d_multisample)
(import-method org.lwjgl.opengl.GL32 glGetSync gl-get-sync)
(import-method org.lwjgl.opengl.GL32 glFenceSync gl-fence-sync)
(import-field org.lwjgl.opengl.GL32 GL_PROXY_TEXTURE_2D_MULTISAMPLE gl_proxy_texture_2d_multisample)
(import-field org.lwjgl.opengl.GL32 GL_PROGRAM_POINT_SIZE gl_program_point_size)
(import-field org.lwjgl.opengl.GL32 GL_GEOMETRY_OUTPUT_TYPE gl_geometry_output_type)
(import-field org.lwjgl.opengl.GL32 GL_TRIANGLE_STRIP_ADJACENCY gl_triangle_strip_adjacency)
(import-field org.lwjgl.opengl.GL32 GL_TEXTURE_2D_MULTISAMPLE gl_texture_2d_multisample)
(import-method org.lwjgl.opengl.GL32 glFramebufferTexture gl-framebuffer-texture)
(import-field org.lwjgl.opengl.GL32 GL_SYNC_GPU_COMMANDS_COMPLETE gl_sync_gpu_commands_complete)
(import-method org.lwjgl.opengl.GL32 glTexImage3DMultisample gl-tex-image3dmultisample)
(import-field org.lwjgl.opengl.GL32 GL_TEXTURE_FIXED_SAMPLE_LOCATIONS gl_texture_fixed_sample_locations)
(import-method org.lwjgl.opengl.GL32 glTexImage2DMultisample gl-tex-image2dmultisample)
(import-field org.lwjgl.opengl.GL32 GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS gl_max_geometry_total_output_components)
(import-field org.lwjgl.opengl.GL32 GL_SIGNALED gl_signaled)
(import-method org.lwjgl.opengl.GL32 glDrawRangeElementsBaseVertex gl-draw-range-elements-base-vertex)
(import-field org.lwjgl.opengl.GL32 GL_CONTEXT_CORE_PROFILE_BIT gl_context_core_profile_bit)
(import-field org.lwjgl.opengl.GL32 GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY gl_int_sampler_2d_multisample_array)
(import-field org.lwjgl.opengl.GL32 GL_SYNC_CONDITION gl_sync_condition)
(import-field org.lwjgl.opengl.GL32 GL_SAMPLER_2D_MULTISAMPLE_ARRAY gl_sampler_2d_multisample_array)
