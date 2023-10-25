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
public class L02Q05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random j=new Random();
        int num;
        int rem;
        int sum=0;
        final int NUM=10001;
        num=j.nextInt(NUM);
        System.out.println(num);
        while (num>0){
            rem=num%10;
            sum= sum+rem;
            num=num/10;
            
        }
        System.out.println(sum);
        
    }
    
}
