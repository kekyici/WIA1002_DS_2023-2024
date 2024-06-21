/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab05;
import java.util.Random;
/**
 *
 * @author YiCi Kek
 */
public class L5Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //4. Write a program that rotates 90 degrees clockwise a 3 by 3 matrix
        int [][] matrix = new int[3][3];
        for (int i =0;i<3;i++){
            for (int j=0;j<3;j++){
                Random ran = new Random();
                int num = ran.nextInt(10)+1;
                matrix[i][j]=num;
                }
        }
         for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix[i][j]+"\t"); }
            System.out.println("");   }
         System.out.println("");
            
        for(int i=0;i<3;i++){
           for (int j=2;j>=0;j--){
               System.out.print(matrix[j][i]+"\t"); }
           System.out.println("");   }
        

        
    }
    
}
