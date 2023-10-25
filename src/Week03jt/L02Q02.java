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
public class L02Q02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard= new Scanner(System.in);
        double P,D,R,Y,M;
        System.out.print("Enter the price of car:");
        P=keyboard.nextDouble();
        System.out.print("Enter the Down Payment:");
        D=keyboard.nextDouble();
        System.out.print("Enter Interest Rate in %:");
        R=keyboard.nextDouble();
        System.out.print("Enter Load duration in year:");
        Y= keyboard.nextDouble();
        M=(P-D)*(1+R*Y/100)/(Y*12);
        System.out.println("Monthly Payment:"+M);
        
        
        
        
    }
    
}
