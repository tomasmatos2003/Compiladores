import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")


public class Interpreter extends CalculatorBaseVisitor<Integer> {
   //para guardar variaveis
   HashMap<String, Integer> variaveis = new HashMap<String, Integer>();

   //verifica se é um numero
   public static boolean isNumeric(String str) { 
      try {  
        Double.parseDouble(str);  
        return true;
      } catch(NumberFormatException e){  
        return false;  
      }  
    }
    //verifica se é um numero

   @Override public Integer visitProgram(CalculatorParser.ProgramContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
   }

   @Override public Integer visitStat(CalculatorParser.StatContext ctx) {
      Integer res = null;
      res = visit(ctx.expr());
 
      if (res != null) {
         System.out.println("Result: "+res);
      }
      return res;
   }

   @Override public Integer visitAssignment(CalculatorParser.AssignmentContext ctx) {
      Integer res = null;
    
      return null;
   }

   @Override public Integer visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      // System.out.println("ExprAddSub");
      Integer res = null;

      int e1 = 0;
      int e2 = 0;

      boolean e1Exist = false;
      boolean e2Exist = false;
      String op = ctx.op.getText();
 

      if (isNumeric(ctx.expr(0).getText()) ){//|| isNumeric(visit(ctx.expr(0)).toString())){
         e1 = visit(ctx.expr(0));
      }else{
         for (String key : variaveis.keySet()) {
            if (key.equals(ctx.expr(0).getText())) {
               e1Exist = true;
               e1 = variaveis.get(key);
            }
         }
            
         if (e1Exist == false) {
            System.out.println("Erro: Variavel não declarada -> " + ctx.expr(0).getText());
            return null;
         }
      }


      if (isNumeric(ctx.expr(1).getText())){//} || isNumeric(visit(ctx.expr(1)).toString())){
         e2 = visit(ctx.expr(1));
      }else{
         for (String key : variaveis.keySet()) {
            if (key.equals(ctx.expr(1).getText())) {
               e2Exist = true;
               e2 = variaveis.get(key);
            }
         }
         if (e2Exist == false) {
            System.out.println("Erro: Variavel não declarada -> " + ctx.expr(1).getText());
            return null;
         }
      }
   
      switch (op){
         case "+":
            res = e1 + e2;
            break;
         case "-":
            res = e1 - e2;
            break;
      }
      return res;
   }

   @Override public Integer visitExprPositive(CalculatorParser.ExprPositiveContext ctx) {
      Integer res = null;
      String expr = ctx.expr().getText();
      if (isNumeric(expr)){
      
         if (Integer.parseInt(expr) > 0){
            return Integer.parseInt(expr) * (-1);
         } else{
            return Integer.parseInt(expr);
         }
         
      }else {
         if (visit(ctx.expr()) > 0){
            return visit(ctx.expr()) * (-1);
         } else{
            return visit(ctx.expr());
         }
      }

   }

   @Override public Integer visitExprNegate(CalculatorParser.ExprNegateContext ctx) {
  
      Integer res = null;
      String expr = ctx.expr().getText();
      if (isNumeric(expr)){
         return Integer.parseInt(expr) * (-1);
      }else {
         return visit(ctx.expr()) * (-1);
      }
   }

   @Override public Integer visitExprParent(CalculatorParser.ExprParentContext ctx) {
      Integer res = null;

      return visit(ctx.expr());
   }

   @Override public Integer visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      Integer res = null;
      return Integer.parseInt(ctx.Integer().getText());  
   }

   @Override public Integer visitExprId(CalculatorParser.ExprIdContext ctx) {

      Integer res = null;
      
      for (String key : variaveis.keySet()) {
         if (key.equals(ctx.ID().getText())) {
            res = variaveis.get(key);
         }
      }
      if (res == null) {
         System.out.println("Erro: Variável não declarada");
      } else {
         System.out.println(ctx.ID().getText() + " -> " +variaveis.get(ctx.ID().getText()));
      }
      
      return null;
   }

   @Override public Integer visitExprAss(CalculatorParser.ExprAssContext ctx) {
 
      Integer res = null;
      String id = ctx.assignment().ID().getText();
      String expr = ctx.assignment().expr().getText();
      boolean exprIsVar = false;


      for (String key : variaveis.keySet()) {
         if (key.equals(expr)) {
            exprIsVar = true;
            break;
         }
      }


      if (isNumeric(expr)) {
     
         variaveis.put(id, Integer.parseInt(expr));
         return null;
      }else if (exprIsVar == true) {
         variaveis.put(id, variaveis.get(expr));
         return null;
      }else {
     
         variaveis.put(id, visit(ctx.assignment().expr()));
         // return visit(ctx.assignment().expr());
         return null;
      }
   
   }

   @Override public Integer visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {a
      
      Integer res = null;
      
      int e1 = 0;
      int e2 = 0;

      boolean e1Exist = false;
      boolean e2Exist = false;
      String op = ctx.op.getText();
      
      if (isNumeric(ctx.expr(0).getText())){// || isNumeric(visit(ctx.expr(0)).toString())){
         e1 = visit(ctx.expr(0));
      
      }else{
         for (String key : variaveis.keySet()) {
            if (key.equals(ctx.expr(0).getText())) {
               e1Exist = true;
               e1 = variaveis.get(key);
            }
         }

         if (e1Exist == false) {
            System.out.println("Erro: Variavel não declarada -> " + ctx.expr(0).getText());
            return null;
         }
      }

   
      if (isNumeric(ctx.expr(1).getText()) ){//|| isNumeric(visit(ctx.expr(1)).toString())){
         e2 = visit(ctx.expr(1));
      }else{
         for (String key : variaveis.keySet()) {
            if (key.equals(ctx.expr(1).getText())) {
               e2Exist = true;
               e2 = variaveis.get(key);
            }
         }
         if (e2Exist == false) {
            System.out.println("Erro: Variavel não declarada -> " + ctx.expr(1).getText());
            return null;
         }
      }

      
      switch (op){
         case "x":
            res = e1 * e2;
            break;   
         case "/":
            if (e2 == 0) System.out.println("Erro: Não se pode dividir por zero");
            else res = e1 / e2;
            break;
         case "%":
            res = e1 % e2;
            break;
        
      }
      return res; 
   }
}
