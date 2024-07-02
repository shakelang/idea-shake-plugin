package com.shakelang.ideashakeplugin.psi

import com.intellij.psi.tree.IElementType
import com.shakelang.ideashakeplugin.ShakeLanguage
import com.shakelang.shake.lexer.token.ShakeTokenType

class ShakePSITokenType(
    debugName: String,
) : IElementType(debugName, ShakeLanguage) {
    override fun toString(): String = "ShakeTokenType." + super.toString()

    companion object {
        @OptIn(ExperimentalStdlibApi::class)
        val TOKEN_MAP: Map<ShakeTokenType, ShakePSITokenType> =
            buildMap {
                for (type in ShakeTokenType.entries) {
                    put(type, ShakePSITokenType(type.name))
                }
            }

        @OptIn(ExperimentalStdlibApi::class)
        val TOKEN_MAP_REVERSED: Map<ShakePSITokenType, ShakeTokenType> =
            buildMap {
                for (type in ShakeTokenType.entries) {
                    put(ShakePSITokenType(type.name), type)
                }
            }
    }
}

class ShakePSIElementType(
    debugName: String,
) : IElementType(debugName, ShakeLanguage)
