// Generated from /Users/nicolasschmidt/repositories/shakelang/idea-shake-plugin/src/main/kotlin/com/shakelang/ideashakeplugin/ShakeParser.g4 by ANTLR 4.13.1
package com.shakelang.ideashakeplugin.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShakeParser}.
 */
public interface ShakeParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterShakeIdentifier(ShakeParser.ShakeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitShakeIdentifier(ShakeParser.ShakeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeModifier}.
	 * @param ctx the parse tree
	 */
	void enterShakeModifier(ShakeParser.ShakeModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeModifier}.
	 * @param ctx the parse tree
	 */
	void exitShakeModifier(ShakeParser.ShakeModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeModifierList}.
	 * @param ctx the parse tree
	 */
	void enterShakeModifierList(ShakeParser.ShakeModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeModifierList}.
	 * @param ctx the parse tree
	 */
	void exitShakeModifierList(ShakeParser.ShakeModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeNamespace}.
	 * @param ctx the parse tree
	 */
	void enterShakeNamespace(ShakeParser.ShakeNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeNamespace}.
	 * @param ctx the parse tree
	 */
	void exitShakeNamespace(ShakeParser.ShakeNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeType}.
	 * @param ctx the parse tree
	 */
	void enterShakeType(ShakeParser.ShakeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeType}.
	 * @param ctx the parse tree
	 */
	void exitShakeType(ShakeParser.ShakeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#genericDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericDeclaration(ShakeParser.GenericDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#genericDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericDeclaration(ShakeParser.GenericDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#genericsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericsDeclaration(ShakeParser.GenericsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#genericsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericsDeclaration(ShakeParser.GenericsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#funArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunArgs(ShakeParser.FunArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#funArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunArgs(ShakeParser.FunArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#funArgDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunArgDeclaration(ShakeParser.FunArgDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#funArgDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunArgDeclaration(ShakeParser.FunArgDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeBlock}.
	 * @param ctx the parse tree
	 */
	void enterShakeBlock(ShakeParser.ShakeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeBlock}.
	 * @param ctx the parse tree
	 */
	void exitShakeBlock(ShakeParser.ShakeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeBlockChild}.
	 * @param ctx the parse tree
	 */
	void enterShakeBlockChild(ShakeParser.ShakeBlockChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeBlockChild}.
	 * @param ctx the parse tree
	 */
	void exitShakeBlockChild(ShakeParser.ShakeBlockChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeArgument}.
	 * @param ctx the parse tree
	 */
	void enterShakeArgument(ShakeParser.ShakeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeArgument}.
	 * @param ctx the parse tree
	 */
	void exitShakeArgument(ShakeParser.ShakeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeArguments}.
	 * @param ctx the parse tree
	 */
	void enterShakeArguments(ShakeParser.ShakeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeArguments}.
	 * @param ctx the parse tree
	 */
	void exitShakeArguments(ShakeParser.ShakeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeTypeArgument}.
	 * @param ctx the parse tree
	 */
	void enterShakeTypeArgument(ShakeParser.ShakeTypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeTypeArgument}.
	 * @param ctx the parse tree
	 */
	void exitShakeTypeArgument(ShakeParser.ShakeTypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterShakeTypeArguments(ShakeParser.ShakeTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitShakeTypeArguments(ShakeParser.ShakeTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeFile}.
	 * @param ctx the parse tree
	 */
	void enterShakeFile(ShakeParser.ShakeFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeFile}.
	 * @param ctx the parse tree
	 */
	void exitShakeFile(ShakeParser.ShakeFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeFileChild}.
	 * @param ctx the parse tree
	 */
	void enterShakeFileChild(ShakeParser.ShakeFileChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeFileChild}.
	 * @param ctx the parse tree
	 */
	void exitShakeFileChild(ShakeParser.ShakeFileChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakePackageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterShakePackageDeclaration(ShakeParser.ShakePackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakePackageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitShakePackageDeclaration(ShakeParser.ShakePackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterShakeImportDeclaration(ShakeParser.ShakeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitShakeImportDeclaration(ShakeParser.ShakeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeFunDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterShakeFunDeclaration(ShakeParser.ShakeFunDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeFunDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitShakeFunDeclaration(ShakeParser.ShakeFunDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterShakeFieldDeclaration(ShakeParser.ShakeFieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitShakeFieldDeclaration(ShakeParser.ShakeFieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterShakeConstructorDeclaration(ShakeParser.ShakeConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitShakeConstructorDeclaration(ShakeParser.ShakeConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeClassChild}.
	 * @param ctx the parse tree
	 */
	void enterShakeClassChild(ShakeParser.ShakeClassChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeClassChild}.
	 * @param ctx the parse tree
	 */
	void exitShakeClassChild(ShakeParser.ShakeClassChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeClassContents}.
	 * @param ctx the parse tree
	 */
	void enterShakeClassContents(ShakeParser.ShakeClassContentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeClassContents}.
	 * @param ctx the parse tree
	 */
	void exitShakeClassContents(ShakeParser.ShakeClassContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#superClassList}.
	 * @param ctx the parse tree
	 */
	void enterSuperClassList(ShakeParser.SuperClassListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#superClassList}.
	 * @param ctx the parse tree
	 */
	void exitSuperClassList(ShakeParser.SuperClassListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterShakeClassDeclaration(ShakeParser.ShakeClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitShakeClassDeclaration(ShakeParser.ShakeClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeStatement}.
	 * @param ctx the parse tree
	 */
	void enterShakeStatement(ShakeParser.ShakeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeStatement}.
	 * @param ctx the parse tree
	 */
	void exitShakeStatement(ShakeParser.ShakeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterShakeVarDeclaration(ShakeParser.ShakeVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitShakeVarDeclaration(ShakeParser.ShakeVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeWhile}.
	 * @param ctx the parse tree
	 */
	void enterShakeWhile(ShakeParser.ShakeWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeWhile}.
	 * @param ctx the parse tree
	 */
	void exitShakeWhile(ShakeParser.ShakeWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeDoWhile}.
	 * @param ctx the parse tree
	 */
	void enterShakeDoWhile(ShakeParser.ShakeDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeDoWhile}.
	 * @param ctx the parse tree
	 */
	void exitShakeDoWhile(ShakeParser.ShakeDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeFor}.
	 * @param ctx the parse tree
	 */
	void enterShakeFor(ShakeParser.ShakeForContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeFor}.
	 * @param ctx the parse tree
	 */
	void exitShakeFor(ShakeParser.ShakeForContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeIf}.
	 * @param ctx the parse tree
	 */
	void enterShakeIf(ShakeParser.ShakeIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeIf}.
	 * @param ctx the parse tree
	 */
	void exitShakeIf(ShakeParser.ShakeIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeValue}.
	 * @param ctx the parse tree
	 */
	void enterShakeValue(ShakeParser.ShakeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeValue}.
	 * @param ctx the parse tree
	 */
	void exitShakeValue(ShakeParser.ShakeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeAssignment}.
	 * @param ctx the parse tree
	 */
	void enterShakeAssignment(ShakeParser.ShakeAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeAssignment}.
	 * @param ctx the parse tree
	 */
	void exitShakeAssignment(ShakeParser.ShakeAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeLogicalOr}.
	 * @param ctx the parse tree
	 */
	void enterShakeLogicalOr(ShakeParser.ShakeLogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeLogicalOr}.
	 * @param ctx the parse tree
	 */
	void exitShakeLogicalOr(ShakeParser.ShakeLogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeLogicalXor}.
	 * @param ctx the parse tree
	 */
	void enterShakeLogicalXor(ShakeParser.ShakeLogicalXorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeLogicalXor}.
	 * @param ctx the parse tree
	 */
	void exitShakeLogicalXor(ShakeParser.ShakeLogicalXorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeLogicalAnd}.
	 * @param ctx the parse tree
	 */
	void enterShakeLogicalAnd(ShakeParser.ShakeLogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeLogicalAnd}.
	 * @param ctx the parse tree
	 */
	void exitShakeLogicalAnd(ShakeParser.ShakeLogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterShakeBitwiseOr(ShakeParser.ShakeBitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitShakeBitwiseOr(ShakeParser.ShakeBitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeBitwiseXor}.
	 * @param ctx the parse tree
	 */
	void enterShakeBitwiseXor(ShakeParser.ShakeBitwiseXorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeBitwiseXor}.
	 * @param ctx the parse tree
	 */
	void exitShakeBitwiseXor(ShakeParser.ShakeBitwiseXorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeBitwiseAnd}.
	 * @param ctx the parse tree
	 */
	void enterShakeBitwiseAnd(ShakeParser.ShakeBitwiseAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeBitwiseAnd}.
	 * @param ctx the parse tree
	 */
	void exitShakeBitwiseAnd(ShakeParser.ShakeBitwiseAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeEquality}.
	 * @param ctx the parse tree
	 */
	void enterShakeEquality(ShakeParser.ShakeEqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeEquality}.
	 * @param ctx the parse tree
	 */
	void exitShakeEquality(ShakeParser.ShakeEqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeRelation}.
	 * @param ctx the parse tree
	 */
	void enterShakeRelation(ShakeParser.ShakeRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeRelation}.
	 * @param ctx the parse tree
	 */
	void exitShakeRelation(ShakeParser.ShakeRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeShift}.
	 * @param ctx the parse tree
	 */
	void enterShakeShift(ShakeParser.ShakeShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeShift}.
	 * @param ctx the parse tree
	 */
	void exitShakeShift(ShakeParser.ShakeShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeAddition}.
	 * @param ctx the parse tree
	 */
	void enterShakeAddition(ShakeParser.ShakeAdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeAddition}.
	 * @param ctx the parse tree
	 */
	void exitShakeAddition(ShakeParser.ShakeAdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeMultiplication}.
	 * @param ctx the parse tree
	 */
	void enterShakeMultiplication(ShakeParser.ShakeMultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeMultiplication}.
	 * @param ctx the parse tree
	 */
	void exitShakeMultiplication(ShakeParser.ShakeMultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakePower}.
	 * @param ctx the parse tree
	 */
	void enterShakePower(ShakeParser.ShakePowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakePower}.
	 * @param ctx the parse tree
	 */
	void exitShakePower(ShakeParser.ShakePowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeCast}.
	 * @param ctx the parse tree
	 */
	void enterShakeCast(ShakeParser.ShakeCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeCast}.
	 * @param ctx the parse tree
	 */
	void exitShakeCast(ShakeParser.ShakeCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeAccess}.
	 * @param ctx the parse tree
	 */
	void enterShakeAccess(ShakeParser.ShakeAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeAccess}.
	 * @param ctx the parse tree
	 */
	void exitShakeAccess(ShakeParser.ShakeAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeMandory}.
	 * @param ctx the parse tree
	 */
	void enterShakeMandory(ShakeParser.ShakeMandoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeMandory}.
	 * @param ctx the parse tree
	 */
	void exitShakeMandory(ShakeParser.ShakeMandoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeSign}.
	 * @param ctx the parse tree
	 */
	void enterShakeSign(ShakeParser.ShakeSignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeSign}.
	 * @param ctx the parse tree
	 */
	void exitShakeSign(ShakeParser.ShakeSignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakePriority}.
	 * @param ctx the parse tree
	 */
	void enterShakePriority(ShakeParser.ShakePriorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakePriority}.
	 * @param ctx the parse tree
	 */
	void exitShakePriority(ShakeParser.ShakePriorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShakeParser#shakeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterShakeLiteral(ShakeParser.ShakeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShakeParser#shakeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitShakeLiteral(ShakeParser.ShakeLiteralContext ctx);
}