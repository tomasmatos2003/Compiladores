@SuppressWarnings("CheckReturnValue")
public class Execute extends printGramBaseVisitor<Integer> {

   @Override public Integer visitProgram(printGramParser.ProgramContext ctx) {
      Integer res = null;
      System.out.println("Começou a execução");
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitPrintExpr(printGramParser.PrintExprContext ctx) {
      Integer res = null;
      System.out.println("entrou no printExpr");

      // return visitChildren(ctx);
      return visit(ctx.expr());
      //return res;
   }

   @Override public Integer visitAssign(printGramParser.AssignContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitExprAddSub(printGramParser.ExprAddSubContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }


   @Override public Integer visitExprNegatePosi(printGramParser.ExprNegatePosiContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitExprParent(printGramParser.ExprParentContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitExprInteger(printGramParser.ExprIntegerContext ctx) {
      Integer res = null;
      System.out.println("entrou no exprInteger");
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitExprMultDiv(printGramParser.ExprMultDivContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }
   @Override public Integer visitExprPower(printGramParser.ExprPowerContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitExprRead(printGramParser.ExprReadContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }
   @Override public Integer visitExprReduce(printGramParser.ExprReduceContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }
}
