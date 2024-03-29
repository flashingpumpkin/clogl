(ns clogl.opengl.gl20 (:use [clogl.utils.importer])) 

(import-method org.lwjgl.opengl.GL20 glGetShader gl-get-shader)
(import-method org.lwjgl.opengl.GL20 glDetachShader gl-detach-shader)
(import-method org.lwjgl.opengl.GL20 glCompileShader gl-compile-shader)
(import-field org.lwjgl.opengl.GL20 GL_VERTEX_PROGRAM_TWO_SIDE gl_vertex_program_two_side)
(import-field org.lwjgl.opengl.GL20 GL_DRAW_BUFFER10 gl_draw_buffer10)
(import-field org.lwjgl.opengl.GL20 GL_VERTEX_ATTRIB_ARRAY_POINTER gl_vertex_attrib_array_pointer)
(import-field org.lwjgl.opengl.GL20 GL_DRAW_BUFFER1 gl_draw_buffer1)
(import-field org.lwjgl.opengl.GL20 GL_SHADING_LANGUAGE_VERSION gl_shading_language_version)
(import-field org.lwjgl.opengl.GL20 GL_CURRENT_VERTEX_ATTRIB gl_current_vertex_attrib)
(import-field org.lwjgl.opengl.GL20 GL_BOOL_VEC4 gl_bool_vec4)
(import-field org.lwjgl.opengl.GL20 GL_ACTIVE_UNIFORM_MAX_LENGTH gl_active_uniform_max_length)
(import-field org.lwjgl.opengl.GL20 GL_POINT_SPRITE_COORD_ORIGIN gl_point_sprite_coord_origin)
(import-field org.lwjgl.opengl.GL20 GL_VERTEX_ATTRIB_ARRAY_ENABLED gl_vertex_attrib_array_enabled)
(import-field org.lwjgl.opengl.GL20 GL_ACTIVE_ATTRIBUTE_MAX_LENGTH gl_active_attribute_max_length)
(import-field org.lwjgl.opengl.GL20 GL_ACTIVE_UNIFORMS gl_active_uniforms)
(import-field org.lwjgl.opengl.GL20 GL_VERTEX_PROGRAM_POINT_SIZE gl_vertex_program_point_size)
(import-field org.lwjgl.opengl.GL20 GL_FLOAT_MAT3 gl_float_mat3)
(import-field org.lwjgl.opengl.GL20 GL_SAMPLER_1D_SHADOW gl_sampler_1d_shadow)
(import-field org.lwjgl.opengl.GL20 GL_STENCIL_BACK_VALUE_MASK gl_stencil_back_value_mask)
(import-field org.lwjgl.opengl.GL20 GL_DRAW_BUFFER15 gl_draw_buffer15)
(import-field org.lwjgl.opengl.GL20 GL_DRAW_BUFFER13 gl_draw_buffer13)
(import-field org.lwjgl.opengl.GL20 GL_VALIDATE_STATUS gl_validate_status)
(import-field org.lwjgl.opengl.GL20 GL_LINK_STATUS gl_link_status)
(import-field org.lwjgl.opengl.GL20 GL_COORD_REPLACE gl_coord_replace)
(import-field org.lwjgl.opengl.GL20 GL_MAX_FRAGMENT_UNIFORM_COMPONENTS gl_max_fragment_uniform_components)
(import-field org.lwjgl.opengl.GL20 GL_DRAW_BUFFER11 gl_draw_buffer11)
(import-field org.lwjgl.opengl.GL20 GL_BOOL_VEC3 gl_bool_vec3)
(import-field org.lwjgl.opengl.GL20 GL_SHADER_OBJECT gl_shader_object)
(import-field org.lwjgl.opengl.GL20 GL_FRAGMENT_SHADER_DERIVATIVE_HINT gl_fragment_shader_derivative_hint)
(import-field org.lwjgl.opengl.GL20 GL_FRAGMENT_SHADER gl_fragment_shader)
(import-field org.lwjgl.opengl.GL20 GL_CURRENT_PROGRAM gl_current_program)
(import-field org.lwjgl.opengl.GL20 GL_ACTIVE_ATTRIBUTES gl_active_attributes)
(import-field org.lwjgl.opengl.GL20 GL_STENCIL_BACK_FAIL gl_stencil_back_fail)
(import-field org.lwjgl.opengl.GL20 GL_STENCIL_BACK_FUNC gl_stencil_back_func)
(import-field org.lwjgl.opengl.GL20 GL_DELETE_STATUS gl_delete_status)
(import-field org.lwjgl.opengl.GL20 GL_SAMPLER_2D_SHADOW gl_sampler_2d_shadow)
(import-field org.lwjgl.opengl.GL20 GL_MAX_TEXTURE_IMAGE_UNITS gl_max_texture_image_units)
(import-field org.lwjgl.opengl.GL20 GL_MAX_VERTEX_UNIFORM_COMPONENTS gl_max_vertex_uniform_components)
(import-field org.lwjgl.opengl.GL20 GL_INFO_LOG_LENGTH gl_info_log_length)
(import-field org.lwjgl.opengl.GL20 GL_SHADER_TYPE gl_shader_type)
(import-field org.lwjgl.opengl.GL20 GL_STENCIL_BACK_PASS_DEPTH_PASS gl_stencil_back_pass_depth_pass)
(import-field org.lwjgl.opengl.GL20 GL_VERTEX_SHADER gl_vertex_shader)
(import-field org.lwjgl.opengl.GL20 GL_STENCIL_BACK_WRITEMASK gl_stencil_back_writemask)
(import-field org.lwjgl.opengl.GL20 GL_BOOL_VEC2 gl_bool_vec2)
(import-field org.lwjgl.opengl.GL20 GL_DRAW_BUFFER14 gl_draw_buffer14)
(import-field org.lwjgl.opengl.GL20 GL_DRAW_BUFFER12 gl_draw_buffer12)
(import-method org.lwjgl.opengl.GL20 glVertexAttrib3d gl-vertex-attrib3d)
(import-method org.lwjgl.opengl.GL20 glVertexAttrib3s gl-vertex-attrib3s)
(import-method org.lwjgl.opengl.GL20 glVertexAttrib2f gl-vertex-attrib2f)
(import-method org.lwjgl.opengl.GL20 glVertexAttrib2d gl-vertex-attrib2d)
(import-method org.lwjgl.opengl.GL20 glVertexAttrib4f gl-vertex-attrib4f)
(import-method org.lwjgl.opengl.GL20 glVertexAttrib2s gl-vertex-attrib2s)
(import-method org.lwjgl.opengl.GL20 glVertexAttrib4d gl-vertex-attrib4d)
(import-method org.lwjgl.opengl.GL20 glVertexAttrib1f gl-vertex-attrib1f)
(import-method org.lwjgl.opengl.GL20 glVertexAttrib4Nub gl-vertex-attrib4nub)
(import-method org.lwjgl.opengl.GL20 glVertexAttrib4s gl-vertex-attrib4s)
(import-method org.lwjgl.opengl.GL20 glVertexAttrib3f gl-vertex-attrib3f)
(import-method org.lwjgl.opengl.GL20 glVertexAttrib1d gl-vertex-attrib1d)
(import-method org.lwjgl.opengl.GL20 glVertexAttrib1s gl-vertex-attrib1s)
(import-field org.lwjgl.opengl.GL20 GL_LOWER_LEFT gl_lower_left)
(import-method org.lwjgl.opengl.GL20 glGetVertexAttrib gl-get-vertex-attrib)
(import-method org.lwjgl.opengl.GL20 glStencilFuncSeparate gl-stencil-func-separate)
(import-field org.lwjgl.opengl.GL20 GL_DRAW_BUFFER0 gl_draw_buffer0)
(import-field org.lwjgl.opengl.GL20 GL_FLOAT_MAT2 gl_float_mat2)
(import-method org.lwjgl.opengl.GL20 glShaderSource gl-shader-source)
(import-method org.lwjgl.opengl.GL20 glAttachShader gl-attach-shader)
(import-field org.lwjgl.opengl.GL20 GL_UPPER_LEFT gl_upper_left)
(import-field org.lwjgl.opengl.GL20 GL_POINT_SPRITE gl_point_sprite)
(import-method org.lwjgl.opengl.GL20 glGetShaderSource gl-get-shader-source)
(import-method org.lwjgl.opengl.GL20 glUseProgram gl-use-program)
(import-field org.lwjgl.opengl.GL20 GL_STENCIL_BACK_PASS_DEPTH_FAIL gl_stencil_back_pass_depth_fail)
(import-method org.lwjgl.opengl.GL20 glBindAttribLocation gl-bind-attrib-location)
(import-method org.lwjgl.opengl.GL20 glVertexAttribPointer gl-vertex-attrib-pointer)
(import-method org.lwjgl.opengl.GL20 glGetActiveAttrib gl-get-active-attrib)
(import-field org.lwjgl.opengl.GL20 GL_FLOAT_VEC4 gl_float_vec4)
(import-field org.lwjgl.opengl.GL20 GL_ATTACHED_SHADERS gl_attached_shaders)
(import-field org.lwjgl.opengl.GL20 GL_MAX_DRAW_BUFFERS gl_max_draw_buffers)
(import-method org.lwjgl.opengl.GL20 glGetProgram gl-get-program)
(import-method org.lwjgl.opengl.GL20 glGetUniform gl-get-uniform)
(import-field org.lwjgl.opengl.GL20 GL_FLOAT_VEC3 gl_float_vec3)
(import-method org.lwjgl.opengl.GL20 glGetProgramInfoLog gl-get-program-info-log)
(import-method org.lwjgl.opengl.GL20 glGetActiveAttribType gl-get-active-attrib-type)
(import-field org.lwjgl.opengl.GL20 GL_VERTEX_ATTRIB_ARRAY_SIZE gl_vertex_attrib_array_size)
(import-method org.lwjgl.opengl.GL20 glUniform4 gl-uniform4)
(import-field org.lwjgl.opengl.GL20 GL_FLOAT_VEC2 gl_float_vec2)
(import-field org.lwjgl.opengl.GL20 GL_MAX_VARYING_FLOATS gl_max_varying_floats)
(import-method org.lwjgl.opengl.GL20 glUniformMatrix3 gl-uniform-matrix3)
(import-method org.lwjgl.opengl.GL20 glGetShaderInfoLog gl-get-shader-info-log)
(import-method org.lwjgl.opengl.GL20 glUniformMatrix4 gl-uniform-matrix4)
(import-method org.lwjgl.opengl.GL20 glUniformMatrix2 gl-uniform-matrix2)
(import-method org.lwjgl.opengl.GL20 glUniform3 gl-uniform3)
(import-field org.lwjgl.opengl.GL20 GL_INT_VEC4 gl_int_vec4)
(import-field org.lwjgl.opengl.GL20 GL_SHADER_SOURCE_LENGTH gl_shader_source_length)
(import-method org.lwjgl.opengl.GL20 glIsShader gl-is-shader)
(import-method org.lwjgl.opengl.GL20 glGetAttribLocation gl-get-attrib-location)
(import-method org.lwjgl.opengl.GL20 glUniform2 gl-uniform2)
(import-field org.lwjgl.opengl.GL20 GL_INT_VEC3 gl_int_vec3)
(import-method org.lwjgl.opengl.GL20 glGetActiveUniform gl-get-active-uniform)
(import-method org.lwjgl.opengl.GL20 glDeleteShader gl-delete-shader)
(import-method org.lwjgl.opengl.GL20 glDisableVertexAttribArray gl-disable-vertex-attrib-array)
(import-method org.lwjgl.opengl.GL20 glUniform1 gl-uniform1)
(import-field org.lwjgl.opengl.GL20 GL_INT_VEC2 gl_int_vec2)
(import-field org.lwjgl.opengl.GL20 GL_COMPILE_STATUS gl_compile_status)
(import-field org.lwjgl.opengl.GL20 GL_DRAW_BUFFER9 gl_draw_buffer9)
(import-field org.lwjgl.opengl.GL20 GL_STENCIL_BACK_REF gl_stencil_back_ref)
(import-method org.lwjgl.opengl.GL20 glCreateShader gl-create-shader)
(import-method org.lwjgl.opengl.GL20 glStencilMaskSeparate gl-stencil-mask-separate)
(import-method org.lwjgl.opengl.GL20 glBlendEquationSeparate gl-blend-equation-separate)
(import-field org.lwjgl.opengl.GL20 GL_MAX_TEXTURE_COORDS gl_max_texture_coords)
(import-field org.lwjgl.opengl.GL20 GL_DRAW_BUFFER8 gl_draw_buffer8)
(import-method org.lwjgl.opengl.GL20 glGetUniformLocation gl-get-uniform-location)
(import-method org.lwjgl.opengl.GL20 glGetVertexAttribPointer gl-get-vertex-attrib-pointer)
(import-field org.lwjgl.opengl.GL20 GL_SAMPLER_CUBE gl_sampler_cube)
(import-field org.lwjgl.opengl.GL20 GL_DRAW_BUFFER7 gl_draw_buffer7)
(import-method org.lwjgl.opengl.GL20 glGetActiveUniformType gl-get-active-uniform-type)
(import-method org.lwjgl.opengl.GL20 glGetActiveUniformSize gl-get-active-uniform-size)
(import-field org.lwjgl.opengl.GL20 GL_DRAW_BUFFER6 gl_draw_buffer6)
(import-field org.lwjgl.opengl.GL20 GL_VERTEX_ATTRIB_ARRAY_TYPE gl_vertex_attrib_array_type)
(import-field org.lwjgl.opengl.GL20 GL_DRAW_BUFFER5 gl_draw_buffer5)
(import-field org.lwjgl.opengl.GL20 GL_BOOL gl_bool)
(import-field org.lwjgl.opengl.GL20 GL_SAMPLER_1D gl_sampler_1d)
(import-method org.lwjgl.opengl.GL20 glEnableVertexAttribArray gl-enable-vertex-attrib-array)
(import-method org.lwjgl.opengl.GL20 glUniform2i gl-uniform2i)
(import-method org.lwjgl.opengl.GL20 glUniform4f gl-uniform4f)
(import-field org.lwjgl.opengl.GL20 GL_SAMPLER_2D gl_sampler_2d)
(import-field org.lwjgl.opengl.GL20 GL_MAX_VERTEX_ATTRIBS gl_max_vertex_attribs)
(import-method org.lwjgl.opengl.GL20 glUniform2f gl-uniform2f)
(import-field org.lwjgl.opengl.GL20 GL_BLEND_EQUATION_ALPHA gl_blend_equation_alpha)
(import-method org.lwjgl.opengl.GL20 glUniform3i gl-uniform3i)
(import-method org.lwjgl.opengl.GL20 glGetAttachedShaders gl-get-attached-shaders)
(import-method org.lwjgl.opengl.GL20 glUniform1i gl-uniform1i)
(import-method org.lwjgl.opengl.GL20 glUniform3f gl-uniform3f)
(import-field org.lwjgl.opengl.GL20 GL_DRAW_BUFFER4 gl_draw_buffer4)
(import-method org.lwjgl.opengl.GL20 glUniform1f gl-uniform1f)
(import-method org.lwjgl.opengl.GL20 glUniform4i gl-uniform4i)
(import-field org.lwjgl.opengl.GL20 GL_VERTEX_ATTRIB_ARRAY_STRIDE gl_vertex_attrib_array_stride)
(import-method org.lwjgl.opengl.GL20 glGetActiveAttribSize gl-get-active-attrib-size)
(import-method org.lwjgl.opengl.GL20 glLinkProgram gl-link-program)
(import-method org.lwjgl.opengl.GL20 glIsProgram gl-is-program)
(import-method org.lwjgl.opengl.GL20 glValidateProgram gl-validate-program)
(import-method org.lwjgl.opengl.GL20 glCreateProgram gl-create-program)
(import-method org.lwjgl.opengl.GL20 glDeleteProgram gl-delete-program)
(import-field org.lwjgl.opengl.GL20 GL_BLEND_EQUATION_RGB gl_blend_equation_rgb)
(import-field org.lwjgl.opengl.GL20 GL_DRAW_BUFFER3 gl_draw_buffer3)
(import-method org.lwjgl.opengl.GL20 glStencilOpSeparate gl-stencil-op-separate)
(import-field org.lwjgl.opengl.GL20 GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS gl_max_combined_texture_image_units)
(import-field org.lwjgl.opengl.GL20 GL_SAMPLER_3D gl_sampler_3d)
(import-method org.lwjgl.opengl.GL20 glDrawBuffers gl-draw-buffers)
(import-field org.lwjgl.opengl.GL20 GL_VERTEX_ATTRIB_ARRAY_NORMALIZED gl_vertex_attrib_array_normalized)
(import-field org.lwjgl.opengl.GL20 GL_DRAW_BUFFER2 gl_draw_buffer2)
(import-field org.lwjgl.opengl.GL20 GL_FLOAT_MAT4 gl_float_mat4)
(import-field org.lwjgl.opengl.GL20 GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS gl_max_vertex_texture_image_units)
