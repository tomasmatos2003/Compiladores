// Generated from Vector.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VectorParser}.
 */
public interface VectorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VectorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(VectorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link VectorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(VectorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link VectorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(VectorParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link VectorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(VectorParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShowExp}
	 * labeled alternative in {@link VectorParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShowExp(VectorParser.ShowExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShowExp}
	 * labeled alternative in {@link VectorParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShowExp(VectorParser.ShowExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link VectorParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignExp(VectorParser.AssignExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link VectorParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignExp(VectorParser.AssignExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIdExp(VectorParser.IdExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIdExp(VectorParser.IdExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProdExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterProdExp(VectorParser.ProdExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProdExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitProdExp(VectorParser.ProdExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vectorExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVectorExp(VectorParser.VectorExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vectorExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVectorExp(VectorParser.VectorExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDoubleExp(VectorParser.DoubleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDoubleExp(VectorParser.DoubleExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParentExp(VectorParser.ParentExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParentExp(VectorParser.ParentExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumSubEx}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSumSubEx(VectorParser.SumSubExContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumSubEx}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSumSubEx(VectorParser.SumSubExContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNumberExp(VectorParser.NumberExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNumberExp(VectorParser.NumberExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignalExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSignalExp(VectorParser.SignalExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignalExp}
	 * labeled alternative in {@link VectorParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSignalExp(VectorParser.SignalExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link VectorParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(VectorParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VectorParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(VectorParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VectorParser#vals}.
	 * @param ctx the parse tree
	 */
	void enterVals(VectorParser.ValsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VectorParser#vals}.
	 * @param ctx the parse tree
	 */
	void exitVals(VectorParser.ValsContext ctx);
}