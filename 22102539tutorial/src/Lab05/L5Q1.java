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
public class L5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          //1. Write a program to randomly generate N student scores (0-100). The program will
        //prompt the user to enter N students and store the score in an array. Then, the program
        //will display a list of score, the highest score, the lowest score and the average score.
        
        Scanner scn = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("Enter N student: ");
        int N = scn.nextInt();
        int[] store = new int[N];
        int max=0,min=101,sum=0;
        for (int i=0;i<N;i++){
            int score = ran.nextInt(101);
            store[i]=score;
            if(score>max)max=score;
            else if (score<min)min=score;}
        for (int j=0;j<N;j++){
            System.out.print(store[j]+" ");
            
            sum+=store[j];
        }
        double average=sum/N;
        System.out.println("");
        System.out.println("The lowest score:"+min);
        System.out.println("The highest score: "+max);
        System.out.println("The average score: "+average);
    }
    
}
