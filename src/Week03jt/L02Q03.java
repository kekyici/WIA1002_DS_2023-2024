/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week03jt;

/**
 *
 * @author hp
 */
import java.util.Random;
public class L02Q03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random t=new Random();
        final int MAX=50;
        final int MIN=10;
        int num1;
        num1=t.nextInt(MAX-MIN);
        System.out.println("num1="+num1);
        int num2;
        num2=t.nextInt(MAX-MIN);
        System.out.println("num2="+num2);
        int num3;
        num3=t.nextInt(MAX-MIN);
        System.out.println("num3="+num3);
        int sum=num1+num2+num3;
        System.out.println("sum="+sum);
        
        
        
    }
    
}
