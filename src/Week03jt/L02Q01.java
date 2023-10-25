/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week03jt;

/**
 *
 * @author hp
*/
import java.util.Scanner;
public class L02Q01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double Fah;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter value in Fahrenheit");
        Fah=keyboard.nextInt();
        double Celcius;
        Celcius=(Fah-32)%1.8;
        System.out.print("Celcius=");
        System.out.printf("%4.2f",Celcius);
        
                
    }
    
}
