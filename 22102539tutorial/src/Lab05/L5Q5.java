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
public class L5Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //5. Write a program that generates 20 random integers within the range from 0 to 100.
        //Sort the array in descending order. Then, accepts an integer input from the user. Then,
        //search the array using this number. Compare the performance of linear search and
        //binary search. 
        Random ran = new Random();
        System.out.println("A list of 20 random integer within 0 to 100: ");
        int [] numlinear = new int[20];
        int print;
        for ( int i=0;i<20;i++){
            int num = ran.nextInt(101);
            numlinear[i]=num;
            System.out.print(num+" ");}
        System.out.println("");
        int[] numlinear1 = numlinear;
        int[] integer= numlinear;
        System.out.println("Array in descending order: ");
        for( int des =1; des<integer.length;des++){
            for(int j=0;j<integer.length-1;j++){
                if(integer[j]<integer[j+1]){
                    int hold = integer[j+1];
                    integer [j+1]=integer[j];
                    integer [j] = hold;}}}
        
       for ( print =0; print<20;print++){
           System.out.print(integer[print]+" ");}
        
        Scanner scn = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter a number to search: ");
        int search = scn.nextInt();
        int result = binarysearch(integer,search);
        int linear = linearsearch(numlinear1, search);
        
        if (result==-1){
            System.out.println(search+" not found");
            System.out.println("Binary Search:--");
        }else{
            System.out.println(search+" found");
            System.out.println("Binary Search: "+result+" loop(s)");} 
       
        if (linear==-1){
            System.out.println(search+" not found");
            System.out.println("Linear Search:--");
        }else{
            System.out.println(search+" found");
            System.out.println("linear Search: "+linear+" loop(s)");} 
    }
    public static int linearsearch(int[]numlinear1, int search){
        int loop1=0;
        for(int l=0;l<20;l++){
            if (numlinear1[l]==search){
                return loop1;}
            loop1++;
       } return -1;
    }
    public static int binarysearch(int[]integer,int search){
      
        int low =0, high=integer.length;
        int loop =0;
        
        while(low<=high){
            int medium = (low+high)/2;
            if(integer[medium]==search){
                return loop ;}
            else if (integer[medium]<search){
                high = medium-1;
                loop++;}
            else {
                low = medium+1;
                loop++;}
        }return -1;
        }
}
