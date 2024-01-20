/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab04;
import java.util.Scanner;
/**
 *
 * @author YiCi Kek
 */
public class L4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*1. Write a program that accepts an integer from user. Then, display its entire factors in
        increasing order.
        Enter an Integer: 24
        The factor are: 1,2,3,4,6,8,12,24*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num1 = scan.nextInt();
        System.out.print("The factor are: ");
        int i ;
        int order;
        int fac = 1;
        for ( i=0 ; i< num1-1;i++){
            order = num1%fac;
            if(order==0){
                System.out.print(fac+",");}
        fac++;}
        System.out.print(fac);
    }
    
}
