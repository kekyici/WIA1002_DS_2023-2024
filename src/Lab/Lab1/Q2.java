
package Lab1;
import java.io.*;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        // TODO code application logic here
        int numOfchar = 0;
        try{
            Scanner scn = new Scanner(new FileInputStream("text1.txt"));
            while(scn.hasNextLine()){
                String letter = scn.nextLine();
                String[] let = letter.split(",");
                for(int i=0;i<let.length;i++){
                    System.out.print(let[i]);
                    numOfchar++;
                }
                System.out.println("");
            }
            System.out.println("Number of character : "+numOfchar);
            
           scn.close();
        }catch(FileNotFoundException e){
            System.out.println("File not Found");
        }
        
        System.out.println("");
        int numberOfnum=0;
        try{
            Scanner scn = new Scanner(new FileInputStream ("text2.txt"));
            while(scn.hasNextLine()){
                String num = scn.nextLine();
                String[] number = num.split(",");
                 for(String n: number){
                     System.out.print(n+" ");
                     numberOfnum++;
                }   
                 System.out.println("");
            }
            System.out.println("\nNumber of number : "+ numberOfnum);
            scn.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        System.out.println("");
        
        int numberOffloat=0;
        try{
            Scanner scn = new Scanner(new FileInputStream ("text3.txt"));
            while(scn.hasNextLine()){
                String num = scn.nextLine();
                String[] number = num.split("; ");
                 for(String n: number){
                     System.out.print(n+" ");
                     numberOffloat++;
                }   
                 System.out.println("");
            }
            System.out.println("\nNumber of number: "+numberOffloat);
            scn.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        
        System.out.println("");
        
        int numberOfalpha=0;
        try{
            Scanner scn = new Scanner(new FileInputStream ("text4.txt"));
            while(scn.hasNextLine()){
                String line = scn.nextLine();
                extractAlphabets(line);
                   
                 System.out.println("");
            }
            
            scn.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
        public static void extractAlphabets(String line) {
        StringBuilder alphabets = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isLetter(c)) {
                alphabets.append(c);
            } else {
                if (alphabets.length() > 0) {
                    System.out.println(alphabets.toString());
                    alphabets = new StringBuilder();
                }
            }
        }
        if (alphabets.length() > 0) {
            System.out.print(alphabets.toString());
        }
    
    }
        
    
}

