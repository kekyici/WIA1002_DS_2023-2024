/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tutorial9;
import java.util.Scanner;

/**
 *
 * @author YiCi Kek
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter a string: ");
        String input = scn.nextLine();
        int length = input.length()-1;
        
        System.out.println(reverse(input,length));
        
        
    }
    
    public static String reverse(String input, int numL){
        if (numL<0)
            return "";
        else{
            char inputChar = input.charAt(numL);
            String str = ""+ inputChar;
            return str + reverse(input,numL -1);
                }
    }
    
}
