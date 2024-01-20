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
public class L4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Write a program that accepts an integer n from user and then sum the following
        series.
        1 + (1+2) + (1+2+3) + … + (1+2+3+…+n)*/
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter and Integer: ");
        int num2 = scn.nextInt();
        
        int sum = 0;
        int i,j ;
        for ( i=1 ; i<=num2 ; i++){
            
            if(i==1){
                System.out.print("1+");
                sum=1+sum;}
            else if (i==num2){
                System.out.print("(");
                for (j=1; j<i ; j++ ){
                    System.out.print(j+"+");
                    sum=j+sum;}
                sum=j+sum;
                System.out.print(j+")");
                System.out.print("="+sum);
                }
            else if (i>1){
                System.out.print("(");
                for (j=1; j<i ; j++ ){
                    System.out.print(j+"+");
                    sum+=j;}
                sum=j+sum;
                System.out.print(j+")");
                System.out.print("+");
                }
            
        }   
        
    }

    
    
}
