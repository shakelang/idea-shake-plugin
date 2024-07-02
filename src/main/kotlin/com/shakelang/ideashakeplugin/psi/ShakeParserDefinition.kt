package com.shakelang.ideashakeplugin.psi

import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class MyLanguageParserDefinition : ParserDefinition {
    override fun createLexer(project: Project?): Lexer {
        // Return a lexer if needed or a dummy lexer
        return ShakeLexerAdapter()
    }

    override fun createParser(project: Project?): PsiParser {
        return PsiParser { root, builder ->
            val rootMarker = builder.mark()
            val myParser = MyExistingParser() // Your existing parser
            val result = myParser.parse(builder)
            if (result.isSuccessful) {
                rootMarker.done(root)
            } else {
                rootMarker.error("Parse error")
            }
            return@PsiParser builder.treeBuilt
        }
    }

    override fun getFileNodeType(): IFileElementType = MyLanguageFileElementType.INSTANCE

    override fun getWhitespaceTokens(): TokenSet = TokenSet.WHITE_SPACE

    override fun getCommentTokens(): TokenSet = MyLanguageTokenTypes.COMMENTS

    override fun getStringLiteralElements(): TokenSet = MyLanguageTokenTypes.STRINGS

    override fun createElement(node: ASTNode): PsiElement = MyLanguageTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = MyLanguageFile(viewProvider)
}
