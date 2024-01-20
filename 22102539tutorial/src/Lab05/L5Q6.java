/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab05;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author YiCi Kek
 */
public class L5Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //. Write a program that used to create Pascal Triangle in the square matrix. The program
        //will accept an integer from the users and use the integer to create the Pascal Triangle.
        Scanner scn = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int num = scn.nextInt();
        int[] array = new int[num];
        System.out.println("The pascal Triangle with "+num+" row(s)");
        for( int i =0; i<num;i++){
            int random = ran.nextInt(11)+1;
            array[i]=random;
            for (int j=0;j<num;j++){
                System.out.print(array[j]+"\t"); 
                }
            System.out.println("");}
        
        
    }
    
}
