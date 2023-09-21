import java.util.*;
import java.io.File;
import java.io.FileNotFoundException; 


public class Guiao1_5 {
    public static void main(String[] args) throws FileNotFoundException {

        //read the file number.txt
        File myObj = new File("/home/tomas/Desktop/Compiladores/bloco1_meu/numbers.txt");
        Scanner myReader = new Scanner(myObj);
        
        HashMap<String, Integer> dict = new HashMap<String, Integer>();

        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] linha = data.split(" - ");
            dict.put(linha[1], Integer.parseInt(linha[0]));
        }
        myReader.close();

        Scanner sc = new Scanner(System.in);
        int total = 0;
        int antes = 0;
        while(sc.hasNext()){
            String word = sc.next();

            if (word.equals("million") || word.equals("hundred") || word.equals("thousand")){
                
                total += antes * dict.get(word);
                    
            }else{

                antes = dict.get(word);
           
            }
            System.out.println(total);
            
            
        }
        
        sc.close();
    }

}
