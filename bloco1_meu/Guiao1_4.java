import java.util.*;
import java.io.File;
import java.io.FileNotFoundException; 

public class Guiao1_4 {

    public static void main(String[] args) throws FileNotFoundException {

        //read the file number.txt
        File myObj = new File("/home/tomas/Desktop/Compiladores/bloco1_meu/numbers.txt");
        Scanner myReader = new Scanner(myObj);
        
        Map<Integer, String> dict = new TreeMap<Integer, String>();

        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] linha = data.split(" - ");
            dict.put(Integer.parseInt(linha[0]), linha[1]);
        }
        myReader.close();

        Scanner sc = new Scanner(System.in);

        
        for (Map.Entry<Integer, String> entry : dict.entrySet()) {
            System.out.println(entry.getKey() + " - >" + entry.getValue());
        }
        
        
        

        while(sc.hasNext()){
            if (sc.hasNext()){
                String word = sc.next();

                if (dict.containsValue(word)){
                    // get the key of the value
                    for (Map.Entry<Integer, String> entry : dict.entrySet()) {
                        if (entry.getValue().equals(word)){
                            System.out.print(entry.getKey()+" ");
                        }
                    }

                }else{
                      
                    // boolean tala = false;                
                    // for (Map.Entry<Integer, String> entry : dict.entrySet()) {
                    //     if (word.contains(entry.getValue())){
                            
                    //         System.out.print(entry.getKey() + " ");
                    //         tala = true;
                    //     }  
                      
                    // }

                    // if (tala == false){
                    //     System.out.print(word + " ");  
                    // }

                    if (word.contains("-")){
                        String[] linha = word.split("-");
                        for (String s : linha){
                            if (dict.containsValue(s)){
                              
                                for (Map.Entry<Integer, String> entry : dict.entrySet()) {
                                    if (entry.getValue().equals(s)){
                                        System.out.print(entry.getKey()+" ");
                                    }else{
                                        System.out.print(s + " não existe ");
                                    }
                                }
                            }
                        }
                    }

                }
            }
               
        }
        
        sc.close();
    }
}