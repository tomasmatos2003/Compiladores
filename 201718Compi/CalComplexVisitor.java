// Generated from CalComplex.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalComplexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalComplexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalComplexParser#programm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramm(CalComplexParser.ProgrammContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalComplexParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(CalComplexParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalComplexParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(CalComplexParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalComplexParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(CalComplexParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpComplex}
	 * labeled alternative in {@link CalComplexParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpComplex(CalComplexParser.ExpComplexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpSubSum}
	 * labeled alternative in {@link CalComplexParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpSubSum(CalComplexParser.ExpSubSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpMultDiv}
	 * labeled alternative in {@link CalComplexParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMultDiv(CalComplexParser.ExpMultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpId}
	 * labeled alternative in {@link CalComplexParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpId(CalComplexParser.ExpIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpParent}
	 * labeled alternative in {@link CalComplexParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParent(CalComplexParser.ExpParentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalComplexParser#complex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex(CalComplexParser.ComplexContext ctx);
}