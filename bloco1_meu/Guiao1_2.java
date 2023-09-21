import java.util.*;

public class Guiao1_2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
        HashMap<String, Double> map_vars = new HashMap<String, Double>();

        while (sc.hasNext()){
            double first;
            double second;
            String var1 = "None";
            String var2 = "None";

            if ( sc.hasNextDouble() ){
                first = sc.nextDouble();

            }else{
                first = 0;
                var1 = sc.next();
                
                for (String key : map_vars.keySet()) {

                    if (var1.equals(key)){
                        first = map_vars.get(key);
                        
                    }
                }     
            }

            char operation = sc.next().charAt(0);
            
            if ( sc.hasNextDouble() ){
                second = sc.nextDouble();

            }else{
                second = 0;
                var2 = sc.next();

                for (String key : map_vars.keySet()) {

                    if (var2.equals(key)){
                        second = map_vars.get(key);

                    }
                }
            }

            double result = 0;

            if (operation == '+') {
                result = first + second;
                System.out.println("RESULT: " + result);

            } else if (operation == '-') {
                result = first - second;
                System.out.println("RESULT: " + result);

            } else if (operation == '*') {
                result = first * second;
                System.out.println("RESULT: " + result);

            } else if (operation == '/') {
                result = first / second;
                System.out.println("RESULT: " + result);

            } else if (operation == '=') {
                
                if ( !var1.equals("None") && !var2.equals("None")){
                    result = 0;
                    String var3 = "None";
                    char operation2 = sc.next().charAt(0);

                    if ( sc.hasNextDouble() ){
                        second = sc.nextDouble();

                    }else{
                        second = 0;
                        var3 = sc.next(); 

                        for (String key : map_vars.keySet()) {

                            if (var3.equals(key)){
                                second = map_vars.get(key);

                            }
                        }
                    }

                    if (operation2 == '+') {

                        result = first + second;
                        System.out.println("RESULT: " + result);

                        if (var1.equals(var2)){
                            map_vars.put(var1,result);
                        }

                    } else if (operation2 == '-') {
                        result = first - second;
                        System.out.println("RESULT: " + result);

                        if (var1.equals(var2)){
                            map_vars.put(var1,result);
                        }

                    } else if (operation2 == '*') {
                        result = first * second;
                        System.out.println("RESULT: " + result);

                        if (var1.equals(var2)){
                            map_vars.put(var1,result);
                        }

                    } else if (operation2 == '/') {
                        result = first / second;
                        System.out.println("RESULT: " + result);

                        if (var1.equals(var2)){
                            map_vars.put(var1,result);
                        }
                    }

                }else{
                    map_vars.put(var1, second);
                }
                
            } else {

                System.out.println("Invalid operation");
            }
            
            
            
           
        }
        sc.close();
        
    }

}