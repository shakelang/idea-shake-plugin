// Generated from /Users/nicolasschmidt/repositories/shakelang/idea-shake-plugin/src/main/kotlin/com/shakelang/ideashakeplugin/ShakeParser.g4 by ANTLR 4.13.1
package com.shakelang.ideashakeplugin.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShakeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShakeParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeIdentifier(ShakeParser.ShakeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeModifier(ShakeParser.ShakeModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeModifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeModifierList(ShakeParser.ShakeModifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeNamespace(ShakeParser.ShakeNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeType(ShakeParser.ShakeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#genericDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericDeclaration(ShakeParser.GenericDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#genericsDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericsDeclaration(ShakeParser.GenericsDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#funArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunArgs(ShakeParser.FunArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#funArgDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunArgDeclaration(ShakeParser.FunArgDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeBlock(ShakeParser.ShakeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeBlockChild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeBlockChild(ShakeParser.ShakeBlockChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeArgument(ShakeParser.ShakeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeArguments(ShakeParser.ShakeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeTypeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeTypeArgument(ShakeParser.ShakeTypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeTypeArguments(ShakeParser.ShakeTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeFile(ShakeParser.ShakeFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeFileChild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeFileChild(ShakeParser.ShakeFileChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakePackageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakePackageDeclaration(ShakeParser.ShakePackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeImportDeclaration(ShakeParser.ShakeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeFunDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeFunDeclaration(ShakeParser.ShakeFunDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeFieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeFieldDeclaration(ShakeParser.ShakeFieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeConstructorDeclaration(ShakeParser.ShakeConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeClassChild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeClassChild(ShakeParser.ShakeClassChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeClassContents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeClassContents(ShakeParser.ShakeClassContentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#superClassList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperClassList(ShakeParser.SuperClassListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeClassDeclaration(ShakeParser.ShakeClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeStatement(ShakeParser.ShakeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeVarDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeVarDeclaration(ShakeParser.ShakeVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeWhile(ShakeParser.ShakeWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeDoWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeDoWhile(ShakeParser.ShakeDoWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeFor(ShakeParser.ShakeForContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeIf(ShakeParser.ShakeIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeValue(ShakeParser.ShakeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeAssignment(ShakeParser.ShakeAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeLogicalOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeLogicalOr(ShakeParser.ShakeLogicalOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeLogicalXor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeLogicalXor(ShakeParser.ShakeLogicalXorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeLogicalAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeLogicalAnd(ShakeParser.ShakeLogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeBitwiseOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeBitwiseOr(ShakeParser.ShakeBitwiseOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeBitwiseXor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeBitwiseXor(ShakeParser.ShakeBitwiseXorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeBitwiseAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeBitwiseAnd(ShakeParser.ShakeBitwiseAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeEquality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeEquality(ShakeParser.ShakeEqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeRelation(ShakeParser.ShakeRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeShift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeShift(ShakeParser.ShakeShiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeAddition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeAddition(ShakeParser.ShakeAdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeMultiplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeMultiplication(ShakeParser.ShakeMultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakePower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakePower(ShakeParser.ShakePowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeCast(ShakeParser.ShakeCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeAccess(ShakeParser.ShakeAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeMandory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeMandory(ShakeParser.ShakeMandoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeSign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeSign(ShakeParser.ShakeSignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakePriority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakePriority(ShakeParser.ShakePriorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShakeParser#shakeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShakeLiteral(ShakeParser.ShakeLiteralContext ctx);
}