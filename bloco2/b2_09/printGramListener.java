// Generated from printGram.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link printGramParser}.
 */
public interface printGramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link printGramParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(printGramParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link printGramParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(printGramParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintExpr}
	 * labeled alternative in {@link printGramParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(printGramParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintExpr}
	 * labeled alternative in {@link printGramParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(printGramParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link printGramParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(printGramParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link printGramParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(printGramParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(printGramParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(printGramParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNegatePosi}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNegatePosi(printGramParser.ExprNegatePosiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNegatePosi}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNegatePosi(printGramParser.ExprNegatePosiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRead(printGramParser.ExprReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRead(printGramParser.ExprReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(printGramParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(printGramParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(printGramParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(printGramParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(printGramParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(printGramParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPower}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPower(printGramParser.ExprPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPower}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPower(printGramParser.ExprPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReduce(printGramParser.ExprReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReduce(printGramParser.ExprReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(printGramParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(printGramParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFraction(printGramParser.ExprFractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link printGramParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFraction(printGramParser.ExprFractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link printGramParser#fraction}.
	 * @param ctx the parse tree
	 */
	void enterFraction(printGramParser.FractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link printGramParser#fraction}.
	 * @param ctx the parse tree
	 */
	void exitFraction(printGramParser.FractionContext ctx);
}