/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab05;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author YiCi Kek
 */
public class L5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Write a program that randomly generate the seven day work hours (1-8 hours) for N
        //employee. Then, display the work hours in seven days and the total hours for each
        //employee.
        //   
        Random ran = new Random();
        Scanner scn = new Scanner(System.in);
          System.out.println("Enter N employee: ");
        int N = scn.nextInt();
        int hours = N;
        int days = 7;
        int[][] Ahours = new int[days][N];
        
        for(int i=0;i<N;i++){
            for (int j=0;j<7;j++){
                int num = ran.nextInt(9)+1;
                Ahours[j][i]=num;}
               }
        System.out.println("N\tmon\ttue\twed\tthu\tfri\tsat\tsun");
        for(int i=0;i<N;i++){
            int num1=i+1;
            System.out.print( num1+"\t");
            for (int j=0;j<7;j++){
                System.out.print(Ahours[j][i]+"\t"); }
            System.out.println("");   }
            
    }
    
}
