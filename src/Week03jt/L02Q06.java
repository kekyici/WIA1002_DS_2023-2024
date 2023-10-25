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
public class L02Q06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Please enter the amount of water in gram:");
        int K=keyboard.nextInt();
        double M =K%1000;
        System.out.print("Please enter the initial temperature in Farenheit:");
        double itemp=keyboard.nextDouble();
        System.out.print("Please enter the final temperature in Farenheit:");
        double ftemp=keyboard.nextDouble();
        double Q=M*(ftemp-itemp)*4184;
        System.out.printf("%e",Q);
        
        
        
        
        
        
        
    }
    
    
}
