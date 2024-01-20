/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab04;
import java.util.Random;
/**
 *
 * @author YiCi Kek
 */
public class L4Q6 {

    /**
     * @param args the command line argument
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        6. Write a program that generates a non-negative random integer. Display the number of
//        digits in the integer.

        Random ran = new Random();
        int num = ran.nextInt()+1; 
        System.out.println("Number of the Integer:"+num);
        
        
    }
    
}
