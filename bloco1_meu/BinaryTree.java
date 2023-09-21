import java.util.Scanner;

public class BinaryTree {

    private BinaryTree left;
    private BinaryTree right;
    private double value;

    private String text;
    private static Scanner sc = new Scanner(System.in);
    
    public static BinaryTree createPrefix(){
        
        BinaryTree tree = new BinaryTree();

        if (sc.hasNextDouble()){
           
            tree.text = sc.next();
            tree.value = Double.parseDouble(tree.text);
            return tree;
            
        }else{
            tree.text = sc.next();

            tree.left = createPrefix();
            tree.right = createPrefix();
        }

        return tree;
    }


    public void printPrefix(){
        
        System.out.printf("%s = %.2f", text, value);
        if (left != null){
            left.printPrefix();
        }
        if (right != null){
            right.printPrefix();
        }
        
    }

    public boolean isOperator(){
        if (text.equals("+") || text.equals("-") || text.equals("*") || text.equals("/")){
            return true;
        }
        return false;
    }
    
    public void Calculate(){
        if (left.isOperator()){
            left.Calculate();
        } 

        if (right.isOperator()){
            right.Calculate();
        }

        if (left != null && right != null){
            if (text.equals("+")){

                value = left.value + right.value;
                text = String.format("(%s + %s)",left.text ,right.text);
                left = null;
                right = null;
            
            } else if (text.equals("-")){

                value = left.value - right.value;
                text = String.format("(%s - %s)",left.text ,right.text);
                left = null;
                right = null;

            } else if (text.equals("*")){

                value = left.value * right.value;
                text = String.format("(%s * %s)",left.text ,right.text);
                left = null;
                right = null;

            } else if (text.equals("/")){
                
                value = left.value / right.value;
                text = String.format("(%s / %s)",left.text ,right.text);
                left = null;
                right = null;

            }
        }

    }

    public static void main(String[] args) {
        BinaryTree tree = createPrefix();
        tree.Calculate();
        System.out.println();
        tree.printPrefix();
        System.out.println();

        
    }
}
