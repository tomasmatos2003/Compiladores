import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")
public class Execute extends CalComplexBaseVisitor<Complex> {
   HashMap<String, Complex> vars = new HashMap<>();
   @Override public Complex visitStat(CalComplexParser.StatContext ctx) {
      Complex res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Complex visitOutput(CalComplexParser.OutputContext ctx) {
      Complex res = visit(ctx.exp());
      if (res != null){
         System.out.println(res);
      }
      return res;
   }

   @Override public Complex visitAssign(CalComplexParser.AssignContext ctx) {
      Complex res = visit(ctx.exp());
      String var = ctx.ID().getText();
      
      vars.put(var, res);
      return res;
   }

   @Override public Complex visitExpId(CalComplexParser.ExpIdContext ctx) {
      Complex res = null;
      if (vars.containsKey(ctx.ID().getText())){
         return vars.get(ctx.ID().getText());
      }
      return res;
   }

   @Override public Complex visitExpComplex(CalComplexParser.ExpComplexContext ctx) {
      Complex res = new Complex("0");
      if (ctx.complex().getText().contains("+") || ctx.complex().getText().contains("-")){

         boolean hasIVal = false;
         
         for (int i = 0; i < ctx.complex().getText().length() ; i++){
            if (ctx.complex().getText().charAt(i) == 'i') {
               if (ctx.complex().getText().charAt(i-1) == '+' || ctx.complex().getText().charAt(i-1) == '-')
               hasIVal = true;
               break;
            }
         }

         if (hasIVal == false){
            res.setImaginary(ctx.complex().Number(1).getText());
            res.setReal(ctx.complex().Number(0).getText());
            res.setOp(ctx.complex().op.getText());
         }else {
            
            res.setImaginary("1");
            res.setReal(ctx.complex().Number(0).getText());
            res.setOp(ctx.complex().op.getText());
          
         }

         
      }  else if (ctx.getText().contains("i")){
         if (ctx.complex().getText().equals("i")){
            res.setImaginary("1");
            res.setReal("0");
         } else {
            res.setImaginary(ctx.complex().getText());
            res.setReal("0");
         }
         
      } else {
         res.setReal(ctx.complex().Number(0).getText());
         res.setImaginary("0");
      }  
      // return visitChildren(ctx);
      return res;
   }

   @Override public Complex visitComplex(CalComplexParser.ComplexContext ctx) {
      Complex res = null;
      return visitChildren(ctx);
      //return res;
   }
}
