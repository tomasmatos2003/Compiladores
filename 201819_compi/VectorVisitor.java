// Generated from Vector.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VectorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VectorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VectorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(VectorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link VectorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(VectorParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShowExp}
	 * labeled alternative in {@link VectorParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowExp(VectorParser.ShowExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link VectorParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExp(VectorParser.AssignExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExp(VectorParser.IdExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProdExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProdExp(VectorParser.ProdExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vectorExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVectorExp(VectorParser.VectorExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleExp(VectorParser.DoubleExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentExp(VectorParser.ParentExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumSubEx}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumSubEx(VectorParser.SumSubExContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExp(VectorParser.NumberExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignalExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalExp(VectorParser.SignalExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link VectorParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(VectorParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VectorParser#vals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVals(VectorParser.ValsContext ctx);
}