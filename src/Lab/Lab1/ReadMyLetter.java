

package Lab1;
import java.io.*;
import java.util.Scanner;

public class ReadMyLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner scn = new Scanner(new FileInputStream("Kek_22102539.txt"));
            while(scn.hasNextLine()){
                String letter = scn.nextLine();
                System.out.println(letter);
            
            }
            
            
            scn.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        
        
        try{
            PrintWriter out = new PrintWriter(new FileOutputStream("Kek_22102539.txt",true));
            out.println("Thursday, 18 June 2021.\n" +
                       "It’s me again. Finally, it’s the end of the term and the DS class has finished! I think I did\n" +
                       "XXX (your performance) in this course. ……….\n");
            out.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
    }
    
}
