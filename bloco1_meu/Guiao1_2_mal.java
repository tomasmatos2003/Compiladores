import java.util.*;

public class Guiao1_2_mal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        double nr = 0;
        double nr2 = 0;
        int indicator = 0;
        String operation = " ";
        String var = " ";
        String var2 = " ";
      
        
        HashMap<String, Double> map_vars = new HashMap<String, Double>();

        int counter = 0;

        while (sc.hasNext()){
            double result = 0;
            if (sc.hasNextDouble()){
                
                if (indicator == 1){
                    
                    nr2 = sc.nextDouble();

                    if(var != " "){
                        for (String key : map_vars.keySet()) {   
                            if (var.equals(key)){
                                nr = map_vars.get(key);
                            }
                        }
                    }

                    if (operation.equals("+")) {
                        result = nr + nr2;
                        System.out.println("RESULT: " + result);

                    } else if (operation.equals("-")) {
                        result = nr - nr2;
                        System.out.println("RESULT: " + result);

                    } else if (operation.equals("*")) {
                        result = nr * nr2;
                        System.out.println("RESULT: " + result);

                    } else if (operation.equals("/")) {
                        result = nr / nr2;
                        System.out.println("RESULT: " + result);

                    } else if (operation.equals("=")){
                        map_vars.put(var, nr2);

                    } else {
                        nr = 0;
                        System.out.println("Invalid operation");
                    }

                    indicator = 0;
                    counter = 0;
                    operation = " ";
                }else{
                    nr = sc.nextDouble();
                    indicator = 1;
                }
                
            }else{
                if (indicator == 1){

                    if (counter == 0){
                        operation = sc.next();
                        counter = 1;
                        
                    }else{
                        var2 = sc.next();
                        for (String key : map_vars.keySet()) {   
                            if (var2.equals(key)){
                                nr2 = map_vars.get(key);
                            }
                        }

                        if (operation.equals("+")) {
                            result = nr + nr2;
                            System.out.println("RESULT: " + result);
    
                        } else if (operation.equals("-")) {
                            result = nr - nr2;
                            System.out.println("RESULT: " + result);
    
                        } else if (operation.equals("*")) {
                            result = nr * nr2;
                            System.out.println("RESULT: " + result);
    
                        } else if (operation.equals("/")) {
                            result = nr / nr2;
                            System.out.println("RESULT: " + result);
    
                        } else if (operation.equals("=")){
                            map_vars.put(var, nr2);
    
                        } else {
                            nr = 0;
                            System.out.println("Invalid operation 2");
                        }
                        counter = 0;
                        indicator = 0;
                        operation = " ";
                     
                    }
                    
                    

                }else{
                    var = sc.next();
                    indicator = 1;
                }
                
                
            }
        }
        sc.close();
    }
}