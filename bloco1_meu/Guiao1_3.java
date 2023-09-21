import java.util.*;

public class Guiao1_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Stack<Double> stack = new Stack<Double>();
        while (sc.hasNext()){

            if (sc.hasNextDouble()){
                stack.push(sc.nextDouble());
            }else{
                char operation = sc.next().charAt(0);
                double first = stack.pop();
                double second = stack.pop();
                double result = 0;

                if (operation == '+') {
                    result = first + second;
                    stack.push(result);
                } else if (operation == '-') {
                    result = first - second;
                    stack.push(result);
                } else if (operation == '*') {
                    result = first * second;
                    stack.push(result);
                } else if (operation == '/') {
                    result = first / second;
                    stack.push(result);
                } else {
                    result = 0;
                    System.out.println("Invalid operation");
                }

                if (stack.size() == 1){
                    System.out.println("RESULT: " + stack.pop());
                }
            }
        }
        sc.close();
    }
}