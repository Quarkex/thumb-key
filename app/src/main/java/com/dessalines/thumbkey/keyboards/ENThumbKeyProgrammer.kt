@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

// Adds more punctuation options to the main screen to reduce switches to the numeric keyboard
val KB_EN_THUMBKEY_PROGRAMMING_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    bottomRight = KeyC("w"),
                    bottomLeft = KeyC("(", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("\\", color = MUTED),
                    topRight = KeyC("/", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    bottom = KeyC("g"),
                    top = KeyC("^", color = MUTED),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC(">", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    bottomLeft = KeyC("u"),
                    bottomRight = KeyC(")", color = MUTED),
                    topLeft = KeyC("=", color = MUTED),
                    topRight = KeyC("+", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    right = KeyC("m"),
                    left = KeyC("@", color = MUTED),
                    top = KeyC("$", color = MUTED),
                    bottom = KeyC("&", color = MUTED),
                    bottomLeft = KeyC("|", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    topLeft = KeyC("j"),
                    top = KeyC("q"),
                    topRight = KeyC("b"),
                    right = KeyC("p"),
                    bottomRight = KeyC("y"),
                    bottom = KeyC("x"),
                    bottomLeft = KeyC("v"),
                    left = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    left = KeyC("l"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = CommitText("\t"),
                            color = MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topRight = KeyC("c"),
                    bottom = KeyC(",", color = MUTED),
                    topLeft = KeyC("{", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    top = KeyC("f"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("z"),
                    bottomRight = KeyC("-", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC("?", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("d"),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_PROGRAMMING_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_PROGRAMMING_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    bottomRight = KeyC("W"),
                    bottomLeft = KeyC("(", color = MUTED),
                    topLeft = KeyC("~", color = MUTED),
                    top = KeyC("\\", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    bottom = KeyC("G"),
                    top = KeyC("^", color = MUTED),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC(">", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    bottomLeft = KeyC("U"),
                    bottomRight = KeyC(")", color = MUTED),
                    topLeft = KeyC("=", color = MUTED),
                    topRight = KeyC("+", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    right = KeyC("M"),
                    left = KeyC("#", color = MUTED),
                    top = KeyC("€", color = MUTED),
                    bottom = KeyC("&", color = MUTED),
                    bottomLeft = KeyC("|", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    topLeft = KeyC("J"),
                    top = KeyC("Q"),
                    topRight = KeyC("B"),
                    right = KeyC("P"),
                    bottomRight = KeyC("Y"),
                    bottom = KeyC("X"),
                    bottomLeft = KeyC("V"),
                    left = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    left = KeyC("L"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                            action = CommitText("\t"),
                            color = MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topRight = KeyC("C"),
                    bottom = KeyC(",", color = MUTED),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("https://", color = MUTED, size = SMALLEST),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    top = KeyC("F"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC("_"),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC("*", color = MUTED),
                    left = KeyC("?", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("D"),
                    bottomLeft = KeyC(";", color = MUTED),
                    bottom = KeyC(":", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    right = KeyC(".com", color = MUTED, size = SMALLEST),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_PROGRAMMING_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_PROGRAMMING_CTRLED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_S, "s", size = LARGE),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_W, "w"),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_9, "(", color = MUTED),
                    topLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_GRAVE, "`", color = MUTED),
                    top = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_BACKSLASH, "\\", color = MUTED),
                    topRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_SLASH, "/", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_R, "r", size = LARGE),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_G, "g"),
                    top = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_6, "^", color = MUTED),
                    topLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_APOSTROPHE, "\"", color = MUTED),
                    left = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_COMMA, "<", color = MUTED),
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_PERIOD, ">", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_O, "o", size = LARGE),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_U, "u"),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_0, ")", color = MUTED),
                    topLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_EQUALS, "=", color = MUTED),
                    topRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_PLUS, "+", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_N, "n", size = LARGE),
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_M, "m"),
                    left = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_AT, "@", color = MUTED),
                    top = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_4, "$", color = MUTED),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_7, "&", color = MUTED),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_BACKSLASH, "|", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_H, "h", size = LARGE),
                    topLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_J, "j"),
                    top = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_Q, "q"),
                    topRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_B, "b"),
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_P, "p"),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_Y, "y"),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_X, "x"),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_V, "v"),
                    left = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_K, "k"),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_A, "a", size = LARGE),
                    left = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_L, "l"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_T, "t", size = LARGE),
                    topRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_C, "c"),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_COMMA, ",", color = MUTED),
                    topLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_LEFT_BRACKET, "{", color = MUTED),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_LEFT_BRACKET, "[", color = MUTED),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_1, "!", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_I, "i", size = LARGE),
                    top = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_F, "f"),
                    topRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_APOSTROPHE, "'", color = MUTED),
                    right = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_Z, "z"),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_MINUS, "-", color = MUTED),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_PERIOD, ".", color = MUTED),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_8, "*", color = MUTED),
                    left = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_SLASH, "?", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_E, "e", size = LARGE),
                    topLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_D, "d"),
                    bottomLeft = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_SEMICOLON, ";", color = MUTED),
                    bottom = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_SEMICOLON, ":", color = MUTED),
                    topRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_RIGHT_BRACKET, "}", color = MUTED),
                    bottomRight = keyCModifier(KeyEvent.META_CTRL_ON, KeyEvent.KEYCODE_RIGHT_BRACKET, "]", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_PROGRAMMING_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_PROGRAMMING_ALTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_S, "s", size = LARGE),
                    bottomRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_W, "w"),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_9, "(", color = MUTED),
                    topLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_GRAVE, "`", color = MUTED),
                    top = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_BACKSLASH, "\\", color = MUTED),
                    topRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_SLASH, "/", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_R, "r", size = LARGE),
                    bottom = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_G, "g"),
                    top = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_6, "^", color = MUTED),
                    topLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_APOSTROPHE, "\"", color = MUTED),
                    left = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_COMMA, "<", color = MUTED),
                    right = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_PERIOD, ">", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_O, "o", size = LARGE),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_U, "u"),
                    bottomRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_0, ")", color = MUTED),
                    topLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_EQUALS, "=", color = MUTED),
                    topRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_PLUS, "+", color = MUTED),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_N, "n", size = LARGE),
                    right = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_M, "m"),
                    left = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_AT, "@", color = MUTED),
                    top = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_4, "$", color = MUTED),
                    bottom = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_7, "&", color = MUTED),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_BACKSLASH, "|", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_H, "h", size = LARGE),
                    topLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_J, "j"),
                    top = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_Q, "q"),
                    topRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_B, "b"),
                    right = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_P, "p"),
                    bottomRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_Y, "y"),
                    bottom = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_X, "x"),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_V, "v"),
                    left = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_K, "k"),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_A, "a", size = LARGE),
                    left = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_L, "l"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_T, "t", size = LARGE),
                    topRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_C, "c"),
                    bottom = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_COMMA, ",", color = MUTED),
                    topLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_LEFT_BRACKET, "{", color = MUTED),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_LEFT_BRACKET, "[", color = MUTED),
                    bottomRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_1, "!", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_I, "i", size = LARGE),
                    top = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_F, "f"),
                    topRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_APOSTROPHE, "'", color = MUTED),
                    right = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_Z, "z"),
                    bottomRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_MINUS, "-", color = MUTED),
                    bottom = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_PERIOD, ".", color = MUTED),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_8, "*", color = MUTED),
                    left = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_SLASH, "?", color = MUTED),
                ),
                KeyItemC(
                    center = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_E, "e", size = LARGE),
                    topLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_D, "d"),
                    bottomLeft = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_SEMICOLON, ";", color = MUTED),
                    bottom = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_SEMICOLON, ":", color = MUTED),
                    topRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_RIGHT_BRACKET, "}", color = MUTED),
                    bottomRight = keyCModifier(KeyEvent.META_ALT_ON, KeyEvent.KEYCODE_RIGHT_BRACKET, "]", color = MUTED),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_PROGRAMMING_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_THUMBKEY_PROGRAMMING: KeyboardDefinition =
    KeyboardDefinition(
        title = "english thumb-key programming",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_THUMBKEY_PROGRAMMING_MAIN,
                shifted = KB_EN_THUMBKEY_PROGRAMMING_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
                ctrled = KB_EN_THUMBKEY_PROGRAMMING_CTRLED,
                alted = KB_EN_THUMBKEY_PROGRAMMING_ALTED,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
