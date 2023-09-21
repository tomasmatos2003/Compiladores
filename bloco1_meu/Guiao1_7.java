
import java.util.Scanner;

public class Guiao1_7 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        
        while(sc.hasNext()){
            if(sc.hasNextDouble()){

                double num = sc.nextDouble();      
                System.out.println(num);
            }else{

                String operacao = sc.next();
                System.out.println(operacao);
            }
        }

        sc.close();
    }
}