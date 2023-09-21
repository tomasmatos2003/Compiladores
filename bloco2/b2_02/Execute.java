@SuppressWarnings("CheckReturnValue")
public class Execute extends SuffixCalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      Double res = null;
      res = visit(ctx.expr());
      // return visitChildren(ctx);
      if (res != null) {
         System.out.println("Res: "+res);
      }
      return res;
   }

   @Override public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      // Double res = null;
      // return visitChildren(ctx);
      //return res;
      return Double.parseDouble(ctx.Number().getText());
   }

   @Override public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      // Double res = null;
      // return visitChildren(ctx);
      //return res;
      Double result = null;
      Double e1 = visit(ctx.expr(0));
      Double e2 = visit(ctx.expr(1));
      String op = ctx.op.getText();
      switch (op){
         case "*":
            result = e1 * e2;
            break;   
         case "/":
            if (e2 == 0) System.out.println("Erro: Não se pode dividir por zero");
            else result = e1 / e2;
            break;
         case "+":
            result = e1 + e2;
            break;
         case "-":
            result = e1 - e2;
            break;
      }
      return result;
   }
}
