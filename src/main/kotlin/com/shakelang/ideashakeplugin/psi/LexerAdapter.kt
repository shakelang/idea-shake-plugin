package com.shakelang.ideashakeplugin.psi
import com.intellij.lexer.LexerBase
import com.shakelang.shake.lexer.ShakeLexer
import com.shakelang.shake.lexer.token.ShakeToken
import com.shakelang.shake.lexer.token.stream.ShakeTokenInputStream
import com.shakelang.util.parseutils.characters.source.CharacterSource
import com.shakelang.util.parseutils.characters.streaming.SourceCharacterInputStream

class ShakeLexerAdapter : LexerBase() {
    private var state = 0
    private var source: CharacterSource? = null
    private var tokenStream: ShakeTokenInputStream? = null
    private var actualToken: ShakeToken? = null

    override fun start(
        buffer: CharSequence,
        startOffset: Int,
        endOffset: Int,
        initialState: Int,
    ) {
        // map into parseutils CharacterSource
        this.source =
            object : CharacterSource {
                override val all: CharArray
                    get() = buffer.subSequence(startOffset, endOffset).toCharArray()

                override val length: Int
                    get() = buffer.length - startOffset
                override val location: String
                    get() = "<IDEA>"

                override fun get(
                    start: Int,
                    end: Int,
                ): CharArray = buffer.subSequence(startOffset + start, startOffset + end).toCharArray()
            }

        val charStream = SourceCharacterInputStream(source!!)
        val lexer = ShakeLexer(charStream)
        tokenStream = lexer.stream()
        state = initialState
        advance()
    }

    override fun getState(): Int = state

    override fun getTokenType(): ShakePSITokenType? {
        if (tokenStart >= bufferEnd) return null
        // Implement token type determination logic here
    }

    override fun getTokenStart(): Int = actualToken?.start ?: throw IllegalStateException("No token")

    override fun getTokenEnd(): Int = actualToken?.end ?: throw IllegalStateException("No token")

    override fun advance() {
        if (tokenStart >= bufferEnd) return
        actualToken = tokenStream!!.next()
    }

    override fun getBufferSequence(): CharSequence = source!!.all.joinToString("")

    override fun getBufferEnd(): Int = source!!.length
}

fun CharSequence.toCharArray(): CharArray {
    val array = CharArray(length)
    var i = 0
    for (c in this) {
        array[i++] = c
    }
    return array
}
