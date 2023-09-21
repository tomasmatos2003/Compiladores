
import java.util.*;

public class Guiao1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("first number: ");
        if (sc.hasNext()){
            double first = sc.nextDouble();
            System.out.print("operation: ");
            char operation = sc.next().charAt(0);
            System.out.print("second number: ");
            double second = sc.nextDouble();
            

            double result;

            if (operation == '+') {
                result = first + second;
            } else if (operation == '-') {
                result = first - second;
            } else if (operation == '*') {
                result = first * second;
            } else if (operation == '/') {
                result = first / second;
            } else {
                result = 0;
                System.out.println("Invalid operation");
            }
            
            System.out.println("RESULT: " + result);
            sc.close();

        }else{
            System.out.println("No input");
        }
    }
}