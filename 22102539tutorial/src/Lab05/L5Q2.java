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
public class L5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //2. Write a program that generates 10 non-duplicate random integers within the range from 0 to 20.
        Random ran = new Random();
        int size =10;
        int[] duplicate = new int[size];
        for (int i=0;i<size;i++){
            int num = ran.nextInt(21);
            duplicate[i]=num;
            for(int j=0;j<i;){
               if(duplicate[j]==num){
                    num=ran.nextInt(21);
                    duplicate[i]=num;
                    j=0;
                    }
               else{j++;} 
            }}
   
        for (int k=0;k<size;k++){
             System.out.print(duplicate[k]+" ");
            
    }
    
    }}
