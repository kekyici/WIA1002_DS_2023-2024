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
public class L02Q04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sec;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter value in seconds");
        sec=keyboard.nextInt();
        int s=sec%60;
        int h=sec/60;
        int m=h%60;
        h=h/60;
        System.out.println(sec+"seconds is"+ h +"hours,"+m+ "minutes and"+s+"seconds");
      
        
        
        
        
        
    }
    
}
