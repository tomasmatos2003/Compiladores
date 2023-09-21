// Generated from DimensionalLanguage.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DimensionalLanguageParser}.
 */
public interface DimensionalLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DimensionalLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DimensionalLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensionalLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DimensionalLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimensionalLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DimensionalLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensionalLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DimensionalLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimensionalLanguageParser#dimensionDef}.
	 * @param ctx the parse tree
	 */
	void enterDimensionDef(DimensionalLanguageParser.DimensionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensionalLanguageParser#dimensionDef}.
	 * @param ctx the parse tree
	 */
	void exitDimensionDef(DimensionalLanguageParser.DimensionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimensionalLanguageParser#unitDef}.
	 * @param ctx the parse tree
	 */
	void enterUnitDef(DimensionalLanguageParser.UnitDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensionalLanguageParser#unitDef}.
	 * @param ctx the parse tree
	 */
	void exitUnitDef(DimensionalLanguageParser.UnitDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimensionalLanguageParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(DimensionalLanguageParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensionalLanguageParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(DimensionalLanguageParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimensionalLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DimensionalLanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensionalLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DimensionalLanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimensionalLanguageParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(DimensionalLanguageParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensionalLanguageParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(DimensionalLanguageParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimensionalLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DimensionalLanguageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensionalLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DimensionalLanguageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimensionalLanguageParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(DimensionalLanguageParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensionalLanguageParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(DimensionalLanguageParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimensionalLanguageParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(DimensionalLanguageParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensionalLanguageParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(DimensionalLanguageParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimensionalLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DimensionalLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensionalLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DimensionalLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimensionalLanguageParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(DimensionalLanguageParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensionalLanguageParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(DimensionalLanguageParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimensionalLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DimensionalLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensionalLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DimensionalLanguageParser.TypeContext ctx);
}