import java.util.*;
import java.io.*;

public class outputDimana {
    public static void main(String[] args) {
        System.out.println("NMEC created"); 
        System.out.println("Grade created"); 
        int N = 4 ;
        ArrayList<Integer> nmecs  = new ArrayList<Integer>();
        ArrayList<String> names  = new ArrayList<String>();
        ArrayList<Double> grades  = new ArrayList<Double>();
        int i ;
        for (i = 1; i <= N; i++) {
            System.out.println("NMEC: ");
            nmecs.add(Integer.parseInt((new java.util.Scanner(System.in).nextLine()))*1);
            System.out.println("Name: ");
            names.add(new java.util.Scanner(System.in).nextLine());
            System.out.println("Grade: ");
            grades.add(Double.parseDouble((new java.util.Scanner(System.in).nextLine()))*1);
        }
        System.out.println(String.format("%10s%30s%10s","NMEC:", "Name", "Grade:")); 
        for (i = 1; i <= nmecs.size(); i++) {
            System.out.println(String.format("%10s%30s%10s",nmecs.get(i-1), names.get(i-1), grades.get(i-1))); 
        }
    }
}