// Generated from CalComplex.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalComplexParser}.
 */
public interface CalComplexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalComplexParser#programm}.
	 * @param ctx the parse tree
	 */
	void enterProgramm(CalComplexParser.ProgrammContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalComplexParser#programm}.
	 * @param ctx the parse tree
	 */
	void exitProgramm(CalComplexParser.ProgrammContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalComplexParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CalComplexParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalComplexParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CalComplexParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalComplexParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(CalComplexParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalComplexParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(CalComplexParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalComplexParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CalComplexParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalComplexParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CalComplexParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpComplex}
	 * labeled alternative in {@link CalComplexParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpComplex(CalComplexParser.ExpComplexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpComplex}
	 * labeled alternative in {@link CalComplexParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpComplex(CalComplexParser.ExpComplexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpSubSum}
	 * labeled alternative in {@link CalComplexParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpSubSum(CalComplexParser.ExpSubSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpSubSum}
	 * labeled alternative in {@link CalComplexParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpSubSum(CalComplexParser.ExpSubSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpMultDiv}
	 * labeled alternative in {@link CalComplexParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpMultDiv(CalComplexParser.ExpMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpMultDiv}
	 * labeled alternative in {@link CalComplexParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpMultDiv(CalComplexParser.ExpMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpId}
	 * labeled alternative in {@link CalComplexParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpId(CalComplexParser.ExpIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpId}
	 * labeled alternative in {@link CalComplexParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpId(CalComplexParser.ExpIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpParent}
	 * labeled alternative in {@link CalComplexParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpParent(CalComplexParser.ExpParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpParent}
	 * labeled alternative in {@link CalComplexParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpParent(CalComplexParser.ExpParentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalComplexParser#complex}.
	 * @param ctx the parse tree
	 */
	void enterComplex(CalComplexParser.ComplexContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalComplexParser#complex}.
	 * @param ctx the parse tree
	 */
	void exitComplex(CalComplexParser.ComplexContext ctx);
}