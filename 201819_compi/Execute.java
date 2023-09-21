import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")
public class Execute extends VectorBaseVisitor<VecEsc> {
   HashMap<String, VecEsc> vars = new HashMap<>();

   @Override public VecEsc visitStat(VectorParser.StatContext ctx) {
      VecEsc res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public VecEsc visitShowExp(VectorParser.ShowExpContext ctx) {
      VecEsc res = visit(ctx.exp());
      if (res != null){
         System.out.println(res);
      }
      return res;
   }

   @Override public VecEsc visitAssignExp(VectorParser.AssignExpContext ctx) {
      VecEsc res = visit(ctx.exp());
      String var = ctx.ID().getText();
      vars.put(var, res);
      return res;
   }

   @Override public VecEsc visitIdExp(VectorParser.IdExpContext ctx) {
      VecEsc res = null; 

      if (vars.containsKey(ctx.ID().getText())){
         return vars.get(ctx.ID().getText());
      }

      return res;
   }

   @Override public VecEsc visitProdExp(VectorParser.ProdExpContext ctx) {
      VecEsc res1 = visit(ctx.exp(0));
      VecEsc res2 = visit(ctx.exp(1));
      ArrayList<Integer> finalOp = new ArrayList<>();

      if (ctx.op.getText().equals("*")){
         if (res1.getVectors().size() > 0 && res2.getVectors().size() == 0){
            for (int i = 0; i < res1.getVectors().size(); i++) {
               finalOp.add(res1.getVectors().get(i) * (int)res2.getEscalarVar());
            }
            return new VecEsc(finalOp);
         } else if (res1.getVectors().size() == 0 && res2.getVectors().size() > 0) {
            for (int i = 0; i < res2.getVectors().size(); i++) {
               finalOp.add((res2.getVectors().get(i) * (int) res1.getEscalarVar()));
            }
            return new VecEsc(finalOp);
         } else {
            return new VecEsc(res1.getEscalarVar() * res2.getEscalarVar());
         }
      } else {
         return null;
      }
      
   }

   @Override public VecEsc visitVectorExp(VectorParser.VectorExpContext ctx) {
      VecEsc res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public VecEsc visitDoubleExp(VectorParser.DoubleExpContext ctx) {
      VecEsc res = new VecEsc(Double.parseDouble(ctx.DOUBLE().getText()));
      return res;
   }

   @Override public VecEsc visitParentExp(VectorParser.ParentExpContext ctx) {
      return visit(ctx.exp());
   }

   @Override public VecEsc visitSumSubEx(VectorParser.SumSubExContext ctx) {
      VecEsc res1 = visit(ctx.exp(0));
      VecEsc res2 = visit(ctx.exp(1));

      ArrayList<Integer> finalOp = new ArrayList<>();

      if (ctx.op.getText().equals("-")){
         if (res1.getVectors().size() > 0 && res1.getVectors().size() > 0){
            for (int i = 0; i < res1.getVectors().size(); i++) {
               finalOp.add(res1.getVectors().get(i) - res2.getVectors().get(i));
            }
            return new VecEsc(finalOp);
         } else {
            return new VecEsc(res1.getEscalarVar() - res2.getEscalarVar());
         }
         
         
      } else {
         if (res1.getVectors().size() > 0 && res1.getVectors().size() > 0){
            for (int i = 0; i < res1.getVectors().size(); i++) {
               finalOp.add(res1.getVectors().get(i) + res2.getVectors().get(i));
            }
            return new VecEsc(finalOp);
         } else {
            return new VecEsc(res1.getEscalarVar() + res2.getEscalarVar());
         }
         
      }
   }

   @Override public VecEsc visitNumberExp(VectorParser.NumberExpContext ctx) {
      VecEsc res = new VecEsc(Double.parseDouble(ctx.NUMBER().getText()));
      return res;
   }

   @Override public VecEsc visitSignalExp(VectorParser.SignalExpContext ctx) {
      VecEsc res = null;

      if (ctx.op.getText().equals("-")){
         res = visit(ctx.exp());
         res.ChangeSignaArray();
         if (res.getVectors().size() == 0){
            res.ChangeSignaDouble();
         }
         
         return res;
         
      } else {
         return visit(ctx.exp());
      }
   }

   @Override public VecEsc visitVector(VectorParser.VectorContext ctx) {
      VecEsc res = new VecEsc(ctx.getText());
      return res;
   }

   @Override public VecEsc visitVals(VectorParser.ValsContext ctx) {
      VecEsc res = null;
      return visitChildren(ctx);
      //return res;
   }
}
