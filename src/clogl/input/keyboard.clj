(ns clogl.input.keyboard (:use [clogl.utils.importer])) 

(import-field org.lwjgl.input.Keyboard KEY_NOCONVERT key_noconvert)
(import-method org.lwjgl.input.Keyboard isCreated is-created)
(import-field org.lwjgl.input.Keyboard KEY_R key_r)
(import-field org.lwjgl.input.Keyboard KEY_B key_b)
(import-field org.lwjgl.input.Keyboard KEY_2 key_2)
(import-field org.lwjgl.input.Keyboard KEY_YEN key_yen)
(import-method org.lwjgl.input.Keyboard isKeyDown is-key-down)
(import-method org.lwjgl.input.Keyboard enableRepeatEvents enable-repeat-events)
(import-field org.lwjgl.input.Keyboard KEY_Q key_q)
(import-field org.lwjgl.input.Keyboard KEY_A key_a)
(import-field org.lwjgl.input.Keyboard KEY_1 key_1)
(import-field org.lwjgl.input.Keyboard KEY_RMENU key_rmenu)
(import-field org.lwjgl.input.Keyboard CHAR_NONE char_none)
(import-field org.lwjgl.input.Keyboard KEY_LMETA key_lmeta)
(import-field org.lwjgl.input.Keyboard KEY_NUMLOCK key_numlock)
(import-field org.lwjgl.input.Keyboard KEY_ADD key_add)
(import-field org.lwjgl.input.Keyboard KEY_SEMICOLON key_semicolon)
(import-field org.lwjgl.input.Keyboard KEY_DECIMAL key_decimal)
(import-method org.lwjgl.input.Keyboard getEventNanoseconds get-event-nanoseconds)
(import-field org.lwjgl.input.Keyboard KEY_RETURN key_return)
(import-field org.lwjgl.input.Keyboard KEY_CIRCUMFLEX key_circumflex)
(import-field org.lwjgl.input.Keyboard KEY_RSHIFT key_rshift)
(import-field org.lwjgl.input.Keyboard KEY_NUMPADEQUALS key_numpadequals)
(import-field org.lwjgl.input.Keyboard KEY_F5 key_f5)
(import-field org.lwjgl.input.Keyboard KEY_SUBTRACT key_subtract)
(import-field org.lwjgl.input.Keyboard KEY_MINUS key_minus)
(import-field org.lwjgl.input.Keyboard KEY_SCROLL key_scroll)
(import-field org.lwjgl.input.Keyboard KEY_RWIN key_rwin)
(import-field org.lwjgl.input.Keyboard KEY_AT key_at)
(import-field org.lwjgl.input.Keyboard KEY_F9 key_f9)
(import-field org.lwjgl.input.Keyboard KEY_NONE key_none)
(import-field org.lwjgl.input.Keyboard KEY_ESCAPE key_escape)
(import-field org.lwjgl.input.Keyboard KEY_HOME key_home)
(import-field org.lwjgl.input.Keyboard KEY_PERIOD key_period)
(import-field org.lwjgl.input.Keyboard KEY_RBRACKET key_rbracket)
(import-field org.lwjgl.input.Keyboard KEY_AX key_ax)
(import-field org.lwjgl.input.Keyboard KEY_F4 key_f4)
(import-field org.lwjgl.input.Keyboard KEY_LCONTROL key_lcontrol)
(import-field org.lwjgl.input.Keyboard KEY_DOWN key_down)
(import-field org.lwjgl.input.Keyboard KEY_STOP key_stop)
(import-field org.lwjgl.input.Keyboard KEY_KANA key_kana)
(import-field org.lwjgl.input.Keyboard KEY_F8 key_f8)
(import-field org.lwjgl.input.Keyboard KEY_UP key_up)
(import-field org.lwjgl.input.Keyboard KEY_LWIN key_lwin)
(import-field org.lwjgl.input.Keyboard EVENT_SIZE event_size)
(import-field org.lwjgl.input.Keyboard KEY_F3 key_f3)
(import-field org.lwjgl.input.Keyboard KEY_MULTIPLY key_multiply)
(import-field org.lwjgl.input.Keyboard KEY_NEXT key_next)
(import-field org.lwjgl.input.Keyboard KEY_F7 key_f7)
(import-field org.lwjgl.input.Keyboard KEY_F2 key_f2)
(import-field org.lwjgl.input.Keyboard KEY_RCONTROL key_rcontrol)
(import-field org.lwjgl.input.Keyboard KEY_APOSTROPHE key_apostrophe)
(import-field org.lwjgl.input.Keyboard KEY_DELETE key_delete)
(import-field org.lwjgl.input.Keyboard KEY_LBRACKET key_lbracket)
(import-field org.lwjgl.input.Keyboard KEY_P key_p)
(import-field org.lwjgl.input.Keyboard KEY_F6 key_f6)
(import-field org.lwjgl.input.Keyboard KEY_APPS key_apps)
(import-field org.lwjgl.input.Keyboard KEY_EQUALS key_equals)
(import-field org.lwjgl.input.Keyboard KEY_0 key_0)
(import-field org.lwjgl.input.Keyboard KEY_F1 key_f1)
(import-field org.lwjgl.input.Keyboard KEY_INSERT key_insert)
(import-field org.lwjgl.input.Keyboard KEY_LEFT key_left)
(import-field org.lwjgl.input.Keyboard KEY_BACK key_back)
(import-field org.lwjgl.input.Keyboard KEY_DIVIDE key_divide)
(import-field org.lwjgl.input.Keyboard KEY_LSHIFT key_lshift)
(import-field org.lwjgl.input.Keyboard KEY_COLON key_colon)
(import-field org.lwjgl.input.Keyboard KEY_O key_o)
(import-method org.lwjgl.input.Keyboard getEventCharacter get-event-character)
(import-field org.lwjgl.input.Keyboard KEY_N key_n)
(import-method org.lwjgl.input.Keyboard areRepeatEventsEnabled are-repeat-events-enabled)
(import-field org.lwjgl.input.Keyboard KEY_M key_m)
(import-field org.lwjgl.input.Keyboard KEY_SLASH key_slash)
(import-method org.lwjgl.input.Keyboard create create)
(import-method org.lwjgl.input.Keyboard isRepeatEvent is-repeat-event)
(import-method org.lwjgl.input.Keyboard next next)
(import-method org.lwjgl.input.Keyboard poll poll)
(import-field org.lwjgl.input.Keyboard KEY_UNDERLINE key_underline)
(import-field org.lwjgl.input.Keyboard KEY_RIGHT key_right)
(import-field org.lwjgl.input.Keyboard KEY_L key_l)
(import-field org.lwjgl.input.Keyboard KEY_NUMPAD9 key_numpad9)
(import-field org.lwjgl.input.Keyboard KEY_SYSRQ key_sysrq)
(import-field org.lwjgl.input.Keyboard KEY_NUMPAD8 key_numpad8)
(import-field org.lwjgl.input.Keyboard KEY_NUMPADENTER key_numpadenter)
(import-field org.lwjgl.input.Keyboard KEY_LMENU key_lmenu)
(import-field org.lwjgl.input.Keyboard KEY_K key_k)
(import-field org.lwjgl.input.Keyboard KEY_END key_end)
(import-method org.lwjgl.input.Keyboard getKeyName get-key-name)
(import-field org.lwjgl.input.Keyboard KEY_F15 key_f15)
(import-field org.lwjgl.input.Keyboard KEY_Z key_z)
(import-field org.lwjgl.input.Keyboard KEY_J key_j)
(import-field org.lwjgl.input.Keyboard KEY_UNLABELED key_unlabeled)
(import-field org.lwjgl.input.Keyboard KEY_PRIOR key_prior)
(import-field org.lwjgl.input.Keyboard KEY_NUMPAD7 key_numpad7)
(import-field org.lwjgl.input.Keyboard KEY_I key_i)
(import-field org.lwjgl.input.Keyboard KEY_9 key_9)
(import-field org.lwjgl.input.Keyboard KEYBOARD_SIZE keyboard_size)
(import-field org.lwjgl.input.Keyboard KEY_NUMPAD6 key_numpad6)
(import-field org.lwjgl.input.Keyboard KEY_F14 key_f14)
(import-field org.lwjgl.input.Keyboard KEY_Y key_y)
(import-field org.lwjgl.input.Keyboard KEY_NUMPAD5 key_numpad5)
(import-field org.lwjgl.input.Keyboard KEY_F13 key_f13)
(import-field org.lwjgl.input.Keyboard KEY_CAPITAL key_capital)
(import-field org.lwjgl.input.Keyboard KEY_X key_x)
(import-field org.lwjgl.input.Keyboard KEY_H key_h)
(import-field org.lwjgl.input.Keyboard KEY_NUMPADCOMMA key_numpadcomma)
(import-field org.lwjgl.input.Keyboard KEY_8 key_8)
(import-method org.lwjgl.input.Keyboard getKeyIndex get-key-index)
(import-field org.lwjgl.input.Keyboard KEY_RMETA key_rmeta)
(import-field org.lwjgl.input.Keyboard KEY_F12 key_f12)
(import-field org.lwjgl.input.Keyboard KEY_KANJI key_kanji)
(import-field org.lwjgl.input.Keyboard KEY_SLEEP key_sleep)
(import-field org.lwjgl.input.Keyboard KEY_W key_w)
(import-field org.lwjgl.input.Keyboard KEY_G key_g)
(import-field org.lwjgl.input.Keyboard KEY_7 key_7)
(import-field org.lwjgl.input.Keyboard KEY_NUMPAD4 key_numpad4)
(import-method org.lwjgl.input.Keyboard getNumKeyboardEvents get-num-keyboard-events)
(import-method org.lwjgl.input.Keyboard destroy destroy)
(import-field org.lwjgl.input.Keyboard KEY_NUMPAD3 key_numpad3)
(import-field org.lwjgl.input.Keyboard KEY_V key_v)
(import-field org.lwjgl.input.Keyboard KEY_F key_f)
(import-field org.lwjgl.input.Keyboard KEY_6 key_6)
(import-field org.lwjgl.input.Keyboard KEY_PAUSE key_pause)
(import-method org.lwjgl.input.Keyboard getEventKeyState get-event-key-state)
(import-field org.lwjgl.input.Keyboard KEY_F11 key_f11)
(import-field org.lwjgl.input.Keyboard KEY_SPACE key_space)
(import-field org.lwjgl.input.Keyboard KEY_BACKSLASH key_backslash)
(import-field org.lwjgl.input.Keyboard KEY_E key_e)
(import-field org.lwjgl.input.Keyboard KEY_GRAVE key_grave)
(import-field org.lwjgl.input.Keyboard KEY_5 key_5)
(import-field org.lwjgl.input.Keyboard KEY_TAB key_tab)
(import-field org.lwjgl.input.Keyboard KEY_POWER key_power)
(import-field org.lwjgl.input.Keyboard KEY_F10 key_f10)
(import-field org.lwjgl.input.Keyboard KEY_COMMA key_comma)
(import-field org.lwjgl.input.Keyboard KEY_NUMPAD2 key_numpad2)
(import-field org.lwjgl.input.Keyboard KEY_U key_u)
(import-method org.lwjgl.input.Keyboard getKeyCount get-key-count)
(import-method org.lwjgl.input.Keyboard getEventKey get-event-key)
(import-field org.lwjgl.input.Keyboard KEY_NUMPAD1 key_numpad1)
(import-field org.lwjgl.input.Keyboard KEY_T key_t)
(import-field org.lwjgl.input.Keyboard KEY_D key_d)
(import-field org.lwjgl.input.Keyboard KEY_4 key_4)
(import-field org.lwjgl.input.Keyboard KEY_CONVERT key_convert)
(import-field org.lwjgl.input.Keyboard KEY_S key_s)
(import-field org.lwjgl.input.Keyboard KEY_C key_c)
(import-field org.lwjgl.input.Keyboard KEY_3 key_3)
(import-field org.lwjgl.input.Keyboard KEY_NUMPAD0 key_numpad0)