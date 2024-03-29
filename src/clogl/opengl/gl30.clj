(ns clogl.opengl.gl30 (:use [clogl.utils.importer])) 

(import-method org.lwjgl.opengl.GL30 glDeleteVertexArrays gl-delete-vertex-arrays)
(import-field org.lwjgl.opengl.GL30 GL_MAP_READ_BIT gl_map_read_bit)
(import-field org.lwjgl.opengl.GL30 GL_RGB16I gl_rgb16i)
(import-field org.lwjgl.opengl.GL30 GL_FIXED_ONLY gl_fixed_only)
(import-field org.lwjgl.opengl.GL30 GL_SAMPLER_BUFFER gl_sampler_buffer)
(import-field org.lwjgl.opengl.GL30 GL_INT_SAMPLER_BUFFER gl_int_sampler_buffer)
(import-field org.lwjgl.opengl.GL30 GL_MAX_ARRAY_TEXTURE_LAYERS gl_max_array_texture_layers)
(import-field org.lwjgl.opengl.GL30 GL_RGBA32UI gl_rgba32ui)
(import-field org.lwjgl.opengl.GL30 GL_COMPRESSED_SIGNED_RED_RGTC1 gl_compressed_signed_red_rgtc1)
(import-field org.lwjgl.opengl.GL30 GL_INT_SAMPLER_2D_RECT gl_int_sampler_2d_rect)
(import-field org.lwjgl.opengl.GL30 GL_RENDERBUFFER_RED_SIZE gl_renderbuffer_red_size)
(import-field org.lwjgl.opengl.GL30 GL_ALPHA8I gl_alpha8i)
(import-field org.lwjgl.opengl.GL30 GL_UNSIGNED_INT_VEC2 gl_unsigned_int_vec2)
(import-field org.lwjgl.opengl.GL30 GL_MAP_INVALIDATE_BUFFER_BIT gl_map_invalidate_buffer_bit)
(import-field org.lwjgl.opengl.GL30 GL_MAJOR_VERSION gl_major_version)
(import-field org.lwjgl.opengl.GL30 GL_QUERY_BY_REGION_NO_WAIT gl_query_by_region_no_wait)
(import-field org.lwjgl.opengl.GL30 GL_VERTEX_ATTRIB_ARRAY_INTEGER gl_vertex_attrib_array_integer)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER gl_framebuffer)
(import-field org.lwjgl.opengl.GL30 GL_MAX_COLOR_ATTACHMENTS gl_max_color_attachments)
(import-field org.lwjgl.opengl.GL30 GL_COMPRESSED_RED_GREEN_RGTC2 gl_compressed_red_green_rgtc2)
(import-field org.lwjgl.opengl.GL30 GL_RGB16UI gl_rgb16ui)
(import-field org.lwjgl.opengl.GL30 GL_R16 gl_r16)
(import-field org.lwjgl.opengl.GL30 GL_RENDERBUFFER_GREEN_SIZE gl_renderbuffer_green_size)
(import-field org.lwjgl.opengl.GL30 GL_RGB32UI gl_rgb32ui)
(import-field org.lwjgl.opengl.GL30 GL_RGB9_E5 gl_rgb9_e5)
(import-field org.lwjgl.opengl.GL30 GL_RENDERBUFFER_DEPTH_SIZE gl_renderbuffer_depth_size)
(import-field org.lwjgl.opengl.GL30 GL_RGB8I gl_rgb8i)
(import-field org.lwjgl.opengl.GL30 GL_INVALID_FRAMEBUFFER_OPERATION gl_invalid_framebuffer_operation)
(import-field org.lwjgl.opengl.GL30 GL_COLOR_ATTACHMENT2 gl_color_attachment2)
(import-field org.lwjgl.opengl.GL30 GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS gl_max_transform_feedback_separate_components)
(import-field org.lwjgl.opengl.GL30 GL_MINOR_VERSION gl_minor_version)
(import-field org.lwjgl.opengl.GL30 GL_TRANSFORM_FEEDBACK_BUFFER_START gl_transform_feedback_buffer_start)
(import-field org.lwjgl.opengl.GL30 GL_RG8UI gl_rg8ui)
(import-field org.lwjgl.opengl.GL30 GL_ALPHA_INTEGER gl_alpha_integer)
(import-field org.lwjgl.opengl.GL30 GL_COLOR_ATTACHMENT5 gl_color_attachment5)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT gl_framebuffer_incomplete_missing_attachment)
(import-field org.lwjgl.opengl.GL30 GL_BUFFER_ACCESS_FLAGS gl_buffer_access_flags)
(import-field org.lwjgl.opengl.GL30 GL_STENCIL_INDEX16 gl_stencil_index16)
(import-field org.lwjgl.opengl.GL30 GL_COLOR_ATTACHMENT8 gl_color_attachment8)
(import-field org.lwjgl.opengl.GL30 GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH gl_transform_feedback_varying_max_length)
(import-field org.lwjgl.opengl.GL30 GL_R32UI gl_r32ui)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS gl_framebuffer_incomplete_dimensions)
(import-field org.lwjgl.opengl.GL30 GL_MAP_WRITE_BIT gl_map_write_bit)
(import-field org.lwjgl.opengl.GL30 GL_RENDERBUFFER gl_renderbuffer)
(import-field org.lwjgl.opengl.GL30 GL_R8 gl_r8)
(import-field org.lwjgl.opengl.GL30 GL_RG16F gl_rg16f)
(import-method org.lwjgl.opengl.GL30 glTexParameterI gl-tex-parameter-i)
(import-field org.lwjgl.opengl.GL30 GL_TRANSFORM_FEEDBACK_BUFFER gl_transform_feedback_buffer)
(import-field org.lwjgl.opengl.GL30 GL_UNSIGNED_INT_SAMPLER_CUBE gl_unsigned_int_sampler_cube)
(import-field org.lwjgl.opengl.GL30 GL_ALPHA16I gl_alpha16i)
(import-field org.lwjgl.opengl.GL30 GL_ALPHA16UI gl_alpha16ui)
(import-method org.lwjgl.opengl.GL30 glUniform4ui gl-uniform4ui)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET gl_framebuffer_attachment_texture_3d_zoffset)
(import-field org.lwjgl.opengl.GL30 GL_UNSIGNED_INT_VEC3 gl_unsigned_int_vec3)
(import-field org.lwjgl.opengl.GL30 GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT gl_context_flag_forward_compatible_bit)
(import-method org.lwjgl.opengl.GL30 glGenVertexArrays gl-gen-vertex-arrays)
(import-field org.lwjgl.opengl.GL30 GL_CONTEXT_FLAGS gl_context_flags)
(import-field org.lwjgl.opengl.GL30 GL_DEPTH_COMPONENT32F gl_depth_component32f)
(import-field org.lwjgl.opengl.GL30 GL_RG8I gl_rg8i)
(import-field org.lwjgl.opengl.GL30 GL_RED gl_red)
(import-field org.lwjgl.opengl.GL30 GL_SAMPLER_1D_ARRAY_SHADOW gl_sampler_1d_array_shadow)
(import-field org.lwjgl.opengl.GL30 GL_RG16I gl_rg16i)
(import-field org.lwjgl.opengl.GL30 GL_R8I gl_r8i)
(import-field org.lwjgl.opengl.GL30 GL_INTERLEAVED_ATTRIBS gl_interleaved_attribs)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_BINDING gl_framebuffer_binding)
(import-field org.lwjgl.opengl.GL30 GL_UNSIGNED_NORMALIZED gl_unsigned_normalized)
(import-field org.lwjgl.opengl.GL30 GL_TRANSFORM_FEEDBACK_VARYINGS gl_transform_feedback_varyings)
(import-field org.lwjgl.opengl.GL30 GL_BUFFER_MAP_LENGTH gl_buffer_map_length)
(import-field org.lwjgl.opengl.GL30 GL_SAMPLER_CUBE_SHADOW gl_sampler_cube_shadow)
(import-field org.lwjgl.opengl.GL30 GL_RGB_INTEGER gl_rgb_integer)
(import-field org.lwjgl.opengl.GL30 GL_BGR_INTEGER gl_bgr_integer)
(import-field org.lwjgl.opengl.GL30 GL_COLOR_ATTACHMENT0 gl_color_attachment0)
(import-field org.lwjgl.opengl.GL30 GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS gl_max_transform_feedback_separate_attribs)
(import-field org.lwjgl.opengl.GL30 GL_UNSIGNED_INT_SAMPLER_3D gl_unsigned_int_sampler_3d)
(import-field org.lwjgl.opengl.GL30 GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN gl_transform_feedback_primitives_written)
(import-field org.lwjgl.opengl.GL30 GL_COLOR_ATTACHMENT3 gl_color_attachment3)
(import-field org.lwjgl.opengl.GL30 GL_STENCIL_ATTACHMENT gl_stencil_attachment)
(import-field org.lwjgl.opengl.GL30 GL_RG8 gl_rg8)
(import-field org.lwjgl.opengl.GL30 GL_R16UI gl_r16ui)
(import-field org.lwjgl.opengl.GL30 GL_COLOR_ATTACHMENT6 gl_color_attachment6)
(import-field org.lwjgl.opengl.GL30 GL_MAX_SAMPLES gl_max_samples)
(import-field org.lwjgl.opengl.GL30 GL_GREEN_INTEGER gl_green_integer)
(import-field org.lwjgl.opengl.GL30 GL_COMPRESSED_RG gl_compressed_rg)
(import-field org.lwjgl.opengl.GL30 GL_RGBA32I gl_rgba32i)
(import-field org.lwjgl.opengl.GL30 GL_SAMPLER_2D_ARRAY_SHADOW gl_sampler_2d_array_shadow)
(import-field org.lwjgl.opengl.GL30 GL_RG32F gl_rg32f)
(import-method org.lwjgl.opengl.GL30 glTexParameterIui gl-tex-parameter-iui)
(import-field org.lwjgl.opengl.GL30 GL_TRANSFORM_FEEDBACK_BUFFER_BINDING gl_transform_feedback_buffer_binding)
(import-field org.lwjgl.opengl.GL30 GL_COLOR_ATTACHMENT9 gl_color_attachment9)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_UNSUPPORTED gl_framebuffer_unsupported)
(import-field org.lwjgl.opengl.GL30 GL_RGBA32F gl_rgba32f)
(import-field org.lwjgl.opengl.GL30 GL_DEPTH_STENCIL gl_depth_stencil)
(import-field org.lwjgl.opengl.GL30 GL_DEPTH32F_STENCIL8 gl_depth32f_stencil8)
(import-field org.lwjgl.opengl.GL30 GL_RED_INTEGER gl_red_integer)
(import-field org.lwjgl.opengl.GL30 GL_TEXTURE_SHARED_SIZE gl_texture_shared_size)
(import-field org.lwjgl.opengl.GL30 GL_RGBA16I gl_rgba16i)
(import-field org.lwjgl.opengl.GL30 GL_RENDERBUFFER_HEIGHT gl_renderbuffer_height)
(import-field org.lwjgl.opengl.GL30 GL_UNSIGNED_INT_SAMPLER_2D gl_unsigned_int_sampler_2d)
(import-field org.lwjgl.opengl.GL30 GL_UNSIGNED_INT_VEC4 gl_unsigned_int_vec4)
(import-field org.lwjgl.opengl.GL30 GL_RGBA16F gl_rgba16f)
(import-field org.lwjgl.opengl.GL30 GL_UNSIGNED_INT_SAMPLER_1D_ARRAY gl_unsigned_int_sampler_1d_array)
(import-field org.lwjgl.opengl.GL30 GL_ALPHA32UI gl_alpha32ui)
(import-field org.lwjgl.opengl.GL30 GL_RG32I gl_rg32i)
(import-field org.lwjgl.opengl.GL30 GL_COMPRESSED_SIGNED_RED_GREEN_RGTC2 gl_compressed_signed_red_green_rgtc2)
(import-field org.lwjgl.opengl.GL30 GL_UNSIGNED_INT_SAMPLER_2D_ARRAY gl_unsigned_int_sampler_2d_array)
(import-field org.lwjgl.opengl.GL30 GL_QUERY_NO_WAIT gl_query_no_wait)
(import-field org.lwjgl.opengl.GL30 GL_DEPTH24_STENCIL8 gl_depth24_stencil8)
(import-field org.lwjgl.opengl.GL30 GL_UNSIGNED_INT_SAMPLER_BUFFER gl_unsigned_int_sampler_buffer)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL gl_framebuffer_attachment_texture_level)
(import-field org.lwjgl.opengl.GL30 GL_COLOR_ATTACHMENT1 gl_color_attachment1)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT gl_framebuffer_incomplete_attachment)
(import-field org.lwjgl.opengl.GL30 GL_UNSIGNED_INT_SAMPLER_1D gl_unsigned_int_sampler_1d)
(import-field org.lwjgl.opengl.GL30 GL_RGBA_INTEGER_MODE gl_rgba_integer_mode)
(import-field org.lwjgl.opengl.GL30 GL_COLOR_ATTACHMENT4 gl_color_attachment4)
(import-field org.lwjgl.opengl.GL30 GL_COLOR_ATTACHMENT7 gl_color_attachment7)
(import-field org.lwjgl.opengl.GL30 GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS gl_max_transform_feedback_interleaved_components)
(import-field org.lwjgl.opengl.GL30 GL_UNSIGNED_INT_24_8 gl_unsigned_int_24_8)
(import-field org.lwjgl.opengl.GL30 GL_TEXTURE_BLUE_TYPE gl_texture_blue_type)
(import-field org.lwjgl.opengl.GL30 GL_RENDERBUFFER_ALPHA_SIZE gl_renderbuffer_alpha_size)
(import-field org.lwjgl.opengl.GL30 GL_MAX_RENDERBUFFER_SIZE gl_max_renderbuffer_size)
(import-field org.lwjgl.opengl.GL30 GL_RENDERBUFFER_STENCIL_SIZE gl_renderbuffer_stencil_size)
(import-field org.lwjgl.opengl.GL30 GL_BUFFER_MAP_OFFSET gl_buffer_map_offset)
(import-field org.lwjgl.opengl.GL30 GL_RGBA8UI gl_rgba8ui)
(import-method org.lwjgl.opengl.GL30 glGetTransformFeedbackVarying gl-get-transform-feedback-varying)
(import-field org.lwjgl.opengl.GL30 GL_RG gl_rg)
(import-field org.lwjgl.opengl.GL30 GL_R32F gl_r32f)
(import-field org.lwjgl.opengl.GL30 GL_RGBA8I gl_rgba8i)
(import-field org.lwjgl.opengl.GL30 GL_STENCIL_INDEX4 gl_stencil_index4)
(import-method org.lwjgl.opengl.GL30 glVertexAttribI4ui gl-vertex-attrib-i4ui)
(import-method org.lwjgl.opengl.GL30 glGetRenderbufferParameter gl-get-renderbuffer-parameter)
(import-method org.lwjgl.opengl.GL30 glUniform3ui gl-uniform3ui)
(import-field org.lwjgl.opengl.GL30 GL_TEXTURE_LUMINANCE_TYPE gl_texture_luminance_type)
(import-method org.lwjgl.opengl.GL30 glTransformFeedbackVaryings gl-transform-feedback-varyings)
(import-method org.lwjgl.opengl.GL30 glClearBufferfi gl-clear-bufferfi)
(import-method org.lwjgl.opengl.GL30 glGenerateMipmap gl-generate-mipmap)
(import-field org.lwjgl.opengl.GL30 GL_SAMPLER_1D_ARRAY gl_sampler_1d_array)
(import-method org.lwjgl.opengl.GL30 glVertexAttribI4u gl-vertex-attrib-i4u)
(import-method org.lwjgl.opengl.GL30 glVertexAttribI1u gl-vertex-attrib-i1u)
(import-method org.lwjgl.opengl.GL30 glUniform2ui gl-uniform2ui)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE gl_framebuffer_incomplete_multisample)
(import-method org.lwjgl.opengl.GL30 glVertexAttribI3i gl-vertex-attrib-i3i)
(import-field org.lwjgl.opengl.GL30 GL_VERTEX_ARRAY_BINDING gl_vertex_array_binding)
(import-field org.lwjgl.opengl.GL30 GL_RG_INTEGER gl_rg_integer)
(import-method org.lwjgl.opengl.GL30 glTexParameterIu gl-tex-parameter-iu)
(import-method org.lwjgl.opengl.GL30 glVertexAttribI3u gl-vertex-attrib-i3u)
(import-field org.lwjgl.opengl.GL30 GL_RGB16F gl_rgb16f)
(import-field org.lwjgl.opengl.GL30 GL_READ_FRAMEBUFFER gl_read_framebuffer)
(import-method org.lwjgl.opengl.GL30 glVertexAttribI2i gl-vertex-attrib-i2i)
(import-method org.lwjgl.opengl.GL30 glVertexAttribI2u gl-vertex-attrib-i2u)
(import-field org.lwjgl.opengl.GL30 GL_INT_SAMPLER_1D_ARRAY gl_int_sampler_1d_array)
(import-method org.lwjgl.opengl.GL30 glVertexAttribI3ui gl-vertex-attrib-i3ui)
(import-method org.lwjgl.opengl.GL30 glVertexAttribI4i gl-vertex-attrib-i4i)
(import-method org.lwjgl.opengl.GL30 glVertexAttribI1i gl-vertex-attrib-i1i)
(import-method org.lwjgl.opengl.GL30 glGetTexParameterIu gl-get-tex-parameter-iu)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER gl_framebuffer_attachment_texture_layer)
(import-field org.lwjgl.opengl.GL30 GL_ALPHA16F gl_alpha16f)
(import-field org.lwjgl.opengl.GL30 GL_STENCIL_BUFFER gl_stencil_buffer)
(import-field org.lwjgl.opengl.GL30 GL_COLOR_ATTACHMENT15 gl_color_attachment15)
(import-method org.lwjgl.opengl.GL30 glMapBufferRange gl-map-buffer-range)
(import-method org.lwjgl.opengl.GL30 glUniform1ui gl-uniform1ui)
(import-field org.lwjgl.opengl.GL30 GL_INT_SAMPLER_2D_ARRAY gl_int_sampler_2d_array)
(import-field org.lwjgl.opengl.GL30 GL_RGBA_INTEGER gl_rgba_integer)
(import-field org.lwjgl.opengl.GL30 GL_BGRA_INTEGER gl_bgra_integer)
(import-field org.lwjgl.opengl.GL30 GL_COMPRESSED_RED gl_compressed_red)
(import-field org.lwjgl.opengl.GL30 GL_CLIP_DISTANCE7 gl_clip_distance7)
(import-field org.lwjgl.opengl.GL30 GL_SAMPLER_2D_ARRAY gl_sampler_2d_array)
(import-method org.lwjgl.opengl.GL30 glVertexAttribI2ui gl-vertex-attrib-i2ui)
(import-method org.lwjgl.opengl.GL30 glDisablei gl-disablei)
(import-method org.lwjgl.opengl.GL30 glGetBoolean gl-get-boolean)
(import-method org.lwjgl.opengl.GL30 glBindFragDataLocation gl-bind-frag-data-location)
(import-method org.lwjgl.opengl.GL30 glGetUniformu gl-get-uniformu)
(import-method org.lwjgl.opengl.GL30 glGetStringi gl-get-stringi)
(import-method org.lwjgl.opengl.GL30 glGetInteger gl-get-integer)
(import-method org.lwjgl.opengl.GL30 glVertexAttribI1ui gl-vertex-attrib-i1ui)
(import-field org.lwjgl.opengl.GL30 GL_PROXY_TEXTURE_1D_ARRAY gl_proxy_texture_1d_array)
(import-field org.lwjgl.opengl.GL30 GL_CLIP_DISTANCE6 gl_clip_distance6)
(import-field org.lwjgl.opengl.GL30 GL_COLOR_ATTACHMENT14 gl_color_attachment14)
(import-field org.lwjgl.opengl.GL30 GL_R16I gl_r16i)
(import-field org.lwjgl.opengl.GL30 GL_DRAW_FRAMEBUFFER gl_draw_framebuffer)
(import-field org.lwjgl.opengl.GL30 GL_STENCIL_INDEX1 gl_stencil_index1)
(import-method org.lwjgl.opengl.GL30 glBindFramebuffer gl-bind-framebuffer)
(import-method org.lwjgl.opengl.GL30 glGetVertexAttribIu gl-get-vertex-attrib-iu)
(import-method org.lwjgl.opengl.GL30 glDeleteRenderbuffers gl-delete-renderbuffers)
(import-method org.lwjgl.opengl.GL30 glIsFramebuffer gl-is-framebuffer)
(import-method org.lwjgl.opengl.GL30 glClearBuffer gl-clear-buffer)
(import-method org.lwjgl.opengl.GL30 glBlitFramebuffer gl-blit-framebuffer)
(import-field org.lwjgl.opengl.GL30 GL_COMPRESSED_RED_RGTC1 gl_compressed_red_rgtc1)
(import-method org.lwjgl.opengl.GL30 glVertexAttribI4 gl-vertex-attrib-i4)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME gl_framebuffer_attachment_object_name)
(import-field org.lwjgl.opengl.GL30 GL_COLOR_ATTACHMENT13 gl_color_attachment13)
(import-field org.lwjgl.opengl.GL30 GL_CLIP_DISTANCE5 gl_clip_distance5)
(import-field org.lwjgl.opengl.GL30 GL_TEXTURE_1D_ARRAY gl_texture_1d_array)
(import-field org.lwjgl.opengl.GL30 GL_PROXY_TEXTURE_2D_ARRAY gl_proxy_texture_2d_array)
(import-method org.lwjgl.opengl.GL30 glFlushMappedBufferRange gl-flush-mapped-buffer-range)
(import-field org.lwjgl.opengl.GL30 GL_CLIP_DISTANCE4 gl_clip_distance4)
(import-field org.lwjgl.opengl.GL30 GL_RENDERBUFFER_INTERNAL_FORMAT gl_renderbuffer_internal_format)
(import-field org.lwjgl.opengl.GL30 GL_HALF_FLOAT gl_half_float)
(import-method org.lwjgl.opengl.GL30 glVertexAttribI3 gl-vertex-attrib-i3)
(import-field org.lwjgl.opengl.GL30 GL_MAP_FLUSH_EXPLICIT_BIT gl_map_flush_explicit_bit)
(import-field org.lwjgl.opengl.GL30 GL_RENDERBUFFER_SAMPLES gl_renderbuffer_samples)
(import-field org.lwjgl.opengl.GL30 GL_TEXTURE_2D_ARRAY gl_texture_2d_array)
(import-field org.lwjgl.opengl.GL30 GL_UNSIGNED_INT_SAMPLER_2D_RECT gl_unsigned_int_sampler_2d_rect)
(import-field org.lwjgl.opengl.GL30 GL_MAX_VARYING_COMPONENTS gl_max_varying_components)
(import-field org.lwjgl.opengl.GL30 GL_COLOR_ATTACHMENT12 gl_color_attachment12)
(import-method org.lwjgl.opengl.GL30 glBindBufferBase gl-bind-buffer-base)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE gl_framebuffer_attachment_object_type)
(import-method org.lwjgl.opengl.GL30 glRenderbufferStorage gl-renderbuffer-storage)
(import-method org.lwjgl.opengl.GL30 glIsRenderbuffer gl-is-renderbuffer)
(import-method org.lwjgl.opengl.GL30 glIsEnabledi gl-is-enabledi)
(import-method org.lwjgl.opengl.GL30 glColorMaski gl-color-maski)
(import-field org.lwjgl.opengl.GL30 GL_COLOR_ATTACHMENT11 gl_color_attachment11)
(import-field org.lwjgl.opengl.GL30 GL_DEPTH_ATTACHMENT gl_depth_attachment)
(import-field org.lwjgl.opengl.GL30 GL_CLIP_DISTANCE3 gl_clip_distance3)
(import-field org.lwjgl.opengl.GL30 GL_TEXTURE_ALPHA_TYPE gl_texture_alpha_type)
(import-field org.lwjgl.opengl.GL30 GL_RGB8UI gl_rgb8ui)
(import-field org.lwjgl.opengl.GL30 GL_QUERY_BY_REGION_WAIT gl_query_by_region_wait)
(import-field org.lwjgl.opengl.GL30 GL_R16F gl_r16f)
(import-method org.lwjgl.opengl.GL30 glVertexAttribI2 gl-vertex-attrib-i2)
(import-field org.lwjgl.opengl.GL30 GL_UNSIGNED_INT_10F_11F_11F_REV gl_unsigned_int_10f_11f_11f_rev)
(import-method org.lwjgl.opengl.GL30 glDeleteFramebuffers gl-delete-framebuffers)
(import-method org.lwjgl.opengl.GL30 glGetTexParameterI gl-get-tex-parameter-i)
(import-method org.lwjgl.opengl.GL30 glGetTexParameterIui gl-get-tex-parameter-iui)
(import-field org.lwjgl.opengl.GL30 GL_RG16UI gl_rg16ui)
(import-method org.lwjgl.opengl.GL30 glVertexAttribI1 gl-vertex-attrib-i1)
(import-field org.lwjgl.opengl.GL30 GL_COLOR_ATTACHMENT10 gl_color_attachment10)
(import-method org.lwjgl.opengl.GL30 glBindVertexArray gl-bind-vertex-array)
(import-method org.lwjgl.opengl.GL30 glIsVertexArray gl-is-vertex-array)
(import-method org.lwjgl.opengl.GL30 glRenderbufferStorageMultisample gl-renderbuffer-storage-multisample)
(import-field org.lwjgl.opengl.GL30 GL_MAP_UNSYNCHRONIZED_BIT gl_map_unsynchronized_bit)
(import-field org.lwjgl.opengl.GL30 GL_CLIP_DISTANCE2 gl_clip_distance2)
(import-field org.lwjgl.opengl.GL30 GL_ALPHA8UI gl_alpha8ui)
(import-field org.lwjgl.opengl.GL30 GL_CLAMP_READ_COLOR gl_clamp_read_color)
(import-method org.lwjgl.opengl.GL30 glGetFramebufferAttachmentParameter gl-get-framebuffer-attachment-parameter)
(import-field org.lwjgl.opengl.GL30 GL_CLIP_DISTANCE1 gl_clip_distance1)
(import-field org.lwjgl.opengl.GL30 GL_COMPARE_REF_TO_TEXTURE gl_compare_ref_to_texture)
(import-field org.lwjgl.opengl.GL30 GL_RENDERBUFFER_BLUE_SIZE gl_renderbuffer_blue_size)
(import-field org.lwjgl.opengl.GL30 GL_SEPARATE_ATTRIBS gl_separate_attribs)
(import-field org.lwjgl.opengl.GL30 GL_RGB32I gl_rgb32i)
(import-field org.lwjgl.opengl.GL30 GL_NUM_EXTENSIONS gl_num_extensions)
(import-field org.lwjgl.opengl.GL30 GL_RGBA16UI gl_rgba16ui)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_INCOMPLETE_FORMATS gl_framebuffer_incomplete_formats)
(import-field org.lwjgl.opengl.GL30 GL_RENDERBUFFER_WIDTH gl_renderbuffer_width)
(import-field org.lwjgl.opengl.GL30 GL_UNSIGNED_INT_5_9_9_9_REV gl_unsigned_int_5_9_9_9_rev)
(import-method org.lwjgl.opengl.GL30 glGetVertexAttribI gl-get-vertex-attrib-i)
(import-method org.lwjgl.opengl.GL30 glBindRenderbuffer gl-bind-renderbuffer)
(import-method org.lwjgl.opengl.GL30 glGenRenderbuffers gl-gen-renderbuffers)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_SRGB gl_framebuffer_srgb)
(import-field org.lwjgl.opengl.GL30 GL_RENDERBUFFER_BINDING gl_renderbuffer_binding)
(import-field org.lwjgl.opengl.GL30 GL_INT_SAMPLER_CUBE gl_int_sampler_cube)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE gl_framebuffer_attachment_texture_cube_map_face)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER gl_framebuffer_incomplete_draw_buffer)
(import-field org.lwjgl.opengl.GL30 GL_ALPHA32I gl_alpha32i)
(import-method org.lwjgl.opengl.GL30 glBeginConditionalRender gl-begin-conditional-render)
(import-field org.lwjgl.opengl.GL30 GL_CLIP_DISTANCE0 gl_clip_distance0)
(import-field org.lwjgl.opengl.GL30 GL_QUERY_WAIT gl_query_wait)
(import-field org.lwjgl.opengl.GL30 GL_PRIMITIVES_GENERATED gl_primitives_generated)
(import-field org.lwjgl.opengl.GL30 GL_DEPTH_BUFFER gl_depth_buffer)
(import-field org.lwjgl.opengl.GL30 GL_CLAMP_VERTEX_COLOR gl_clamp_vertex_color)
(import-field org.lwjgl.opengl.GL30 GL_TEXTURE_RED_TYPE gl_texture_red_type)
(import-field org.lwjgl.opengl.GL30 GL_FLOAT_32_UNSIGNED_INT_24_8_REV gl_float_32_unsigned_int_24_8_rev)
(import-field org.lwjgl.opengl.GL30 GL_MIN_PROGRAM_TEXEL_OFFSET gl_min_program_texel_offset)
(import-field org.lwjgl.opengl.GL30 GL_TEXTURE_BINDING_1D_ARRAY gl_texture_binding_1d_array)
(import-method org.lwjgl.opengl.GL30 glBeginTransformFeedback gl-begin-transform-feedback)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_COMPLETE gl_framebuffer_complete)
(import-field org.lwjgl.opengl.GL30 GL_TRANSFORM_FEEDBACK_BUFFER_MODE gl_transform_feedback_buffer_mode)
(import-method org.lwjgl.opengl.GL30 glUniform2u gl-uniform2u)
(import-field org.lwjgl.opengl.GL30 GL_MAX_PROGRAM_TEXEL_OFFSET gl_max_program_texel_offset)
(import-method org.lwjgl.opengl.GL30 glEndConditionalRender gl-end-conditional-render)
(import-field org.lwjgl.opengl.GL30 GL_RGB32F gl_rgb32f)
(import-field org.lwjgl.opengl.GL30 GL_R8UI gl_r8ui)
(import-field org.lwjgl.opengl.GL30 GL_RG16 gl_rg16)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER gl_framebuffer_incomplete_read_buffer)
(import-method org.lwjgl.opengl.GL30 glBindBufferRange gl-bind-buffer-range)
(import-field org.lwjgl.opengl.GL30 GL_TEXTURE_INTENSITY_TYPE gl_texture_intensity_type)
(import-method org.lwjgl.opengl.GL30 glUniform3u gl-uniform3u)
(import-field org.lwjgl.opengl.GL30 GL_R11F_G11F_B10F gl_r11f_g11f_b10f)
(import-field org.lwjgl.opengl.GL30 GL_INT_SAMPLER_1D gl_int_sampler_1d)
(import-field org.lwjgl.opengl.GL30 GL_MAP_INVALIDATE_RANGE_BIT gl_map_invalidate_range_bit)
(import-field org.lwjgl.opengl.GL30 GL_READ_FRAMEBUFFER_BINDING gl_read_framebuffer_binding)
(import-method org.lwjgl.opengl.GL30 glUniform1u gl-uniform1u)
(import-field org.lwjgl.opengl.GL30 GL_TEXTURE_BINDING_2D_ARRAY gl_texture_binding_2d_array)
(import-field org.lwjgl.opengl.GL30 GL_MAX_CLIP_DISTANCES gl_max_clip_distances)
(import-method org.lwjgl.opengl.GL30 glUniform4u gl-uniform4u)
(import-field org.lwjgl.opengl.GL30 GL_TEXTURE_DEPTH_TYPE gl_texture_depth_type)
(import-field org.lwjgl.opengl.GL30 GL_RASTERIZER_DISCARD gl_rasterizer_discard)
(import-method org.lwjgl.opengl.GL30 glEnablei gl-enablei)
(import-method org.lwjgl.opengl.GL30 glVertexAttribIPointer gl-vertex-attrib-ipointer)
(import-field org.lwjgl.opengl.GL30 GL_TEXTURE_GREEN_TYPE gl_texture_green_type)
(import-method org.lwjgl.opengl.GL30 glFramebufferTexture3D gl-framebuffer-texture3d)
(import-method org.lwjgl.opengl.GL30 glFramebufferTexture2D gl-framebuffer-texture2d)
(import-method org.lwjgl.opengl.GL30 glFramebufferTexture1D gl-framebuffer-texture1d)
(import-method org.lwjgl.opengl.GL30 glClearBufferu gl-clear-bufferu)
(import-field org.lwjgl.opengl.GL30 GL_STENCIL_INDEX8 gl_stencil_index8)
(import-field org.lwjgl.opengl.GL30 GL_ALPHA32F gl_alpha32f)
(import-field org.lwjgl.opengl.GL30 GL_COMPARE_REF_DEPTH_TO_TEXTURE gl_compare_ref_depth_to_texture)
(import-field org.lwjgl.opengl.GL30 GL_TRANSFORM_FEEDBACK_BUFFER_SIZE gl_transform_feedback_buffer_size)
(import-field org.lwjgl.opengl.GL30 GL_BLUE_INTEGER gl_blue_integer)
(import-method org.lwjgl.opengl.GL30 glEndTransformFeedback gl-end-transform-feedback)
(import-method org.lwjgl.opengl.GL30 glCheckFramebufferStatus gl-check-framebuffer-status)
(import-field org.lwjgl.opengl.GL30 GL_INT_SAMPLER_2D gl_int_sampler_2d)
(import-field org.lwjgl.opengl.GL30 GL_FRAMEBUFFER_SRGB_CAPABLE gl_framebuffer_srgb_capable)
(import-method org.lwjgl.opengl.GL30 glGetFragDataLocation gl-get-frag-data-location)
(import-method org.lwjgl.opengl.GL30 glTexParameterIi gl-tex-parameter-ii)
(import-field org.lwjgl.opengl.GL30 GL_INT_SAMPLER_3D gl_int_sampler_3d)
(import-field org.lwjgl.opengl.GL30 GL_DRAW_FRAMEBUFFER_BINDING gl_draw_framebuffer_binding)
(import-field org.lwjgl.opengl.GL30 GL_TEXTURE_STENCIL_SIZE gl_texture_stencil_size)
(import-method org.lwjgl.opengl.GL30 glFramebufferTextureLayer gl-framebuffer-texture-layer)
(import-field org.lwjgl.opengl.GL30 GL_CLAMP_FRAGMENT_COLOR gl_clamp_fragment_color)
(import-field org.lwjgl.opengl.GL30 GL_RG32UI gl_rg32ui)
(import-field org.lwjgl.opengl.GL30 GL_R32I gl_r32i)
(import-method org.lwjgl.opengl.GL30 glClampColor gl-clamp-color)
(import-method org.lwjgl.opengl.GL30 glGetTexParameterIi gl-get-tex-parameter-ii)
(import-method org.lwjgl.opengl.GL30 glFramebufferRenderbuffer gl-framebuffer-renderbuffer)
(import-method org.lwjgl.opengl.GL30 glGenFramebuffers gl-gen-framebuffers)
