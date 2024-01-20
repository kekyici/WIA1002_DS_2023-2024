/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tutorialtest;
import java.util.Random;
/**
 *
 * @author YiCi Kek
 */
public class Tutorial05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        //Question 1
        //Write statements for each of the following
        //a. Declare an array that used to store 12 floating point numbers.
//        float[] floatingnumbers = new float[12];
        //b. Initialize an array that use to store the value of A to E.
//        String[] value = {"A","B","C","D","E"};
        //C. Declare an array that used to store 100 students name
//        String[] name = new String[100];
        //d. Declare an array for a table with 6 rows 2 columns that used to store integer value
//        int[] [] value1= new int[6][2];
        //e.Initialize an array with the following value;
//        int[][] value2= {{6,9},{2,5},{4,6}};
//        for(int i=0;i<value2.length;i++){
//            for (int j = 0; j<value2[i].length; j++) {
//                System.out.print(value2[i][j]+" ");
//            }
//            System.out.println("");
//        }
        //After initialize the array, modify the value of the above array to
//        value2[1][1] =4;
//        value2[2][0] =3;
//        value2[2][1] =7;
//        for(int i=0;i<value2.length;i++){
//            for (int j = 0; j<value2[i].length; j++) {
//                System.out.print(value2[i][j]+" ");
//            }
//            System.out.println("");
//        }
        //2. Correct the error for the following statements
        //a. 
            //String[] code = {'AAA', 'AAB', 'AAC', 'AAD'};
        //b.
            //int[] num = new num[10];
            //for(int k=0; k<=num.length(); k++)
            // sum+=num;
        //c.
            // int [][]t = new int[3][];
            // t[1][2] = 5;
        //d.
            //int i=4;
            //int []score = new int[5];
            //score [1] = 78;
            //score[++i] = 100;
//            //a.
//             String[] code = {"AAA", "AAB", "AAC", "AAD"};
//            //b. 
//             int sum1=0;
//             int [] num2 = new int[10];
//             for(int k=0;k<=num2.length;k++){
//              num2[k]+=sum1;}
//            //c.
//             int[][] t = new int[3][];
//             t[1]=new int[5];
//             t[2]=new int[5];
//            //d.
//            int i = 4;
//            int[] score = new int[6]; // Increase the array size to accommodate the incremented index
//
//            score[1] = 78;
//            if (++i < score.length) {
//                score[i] = 100; // Check if the incremented index is within the array bounds
//            } else {
//                // Handle the case where the index is out of bounds
//                System.out.println("Index out of bounds!");
//            }
//             
            //question3
//            int[] marks = new int[5];
//            int i = 0, j = 1;
//            marks[i] = 12;
//            1marks[j] = marks[i] + 19;
//            0marks[j-1] = marks[j] * marks [j];
//            3marks[j*3] = marks[i+1];
//            2marks[++j] = marks[i]%5;
//            marks[2*j] = marks[j-1];
//             
    //         
    //          int [i] mark = {12};
   //           int [j] mark = {961,31,1,31,31}
                
         //question4
         //Write the statements that display the number of occurrence of the word "the" (case sensitive) in a string array name sentence. 
//         String sentence ="the goat the cow the bird the unicorn. ";
//         String[] occ = sentence.split(" ");
//         String the = "the";
//         int count=0;
//         for(int i=0;i<occ.length;i++){
//            if(occ[i].equalsIgnoreCase(the)){
//                count++;
//             
//         }}
//         System.out.println("The occurence of tghe word is: "+count);
        
        //Question5
//        String sentence5 ="the goat the cow the bird the unicorn";
//        String [] reverse = sentence5.split(" ");
//        System.out.println(reverse.length);
//        for(int i5=reverse.length-1;i5>=0;i5--){
//            System.out.print(reverse[i5]+" ");}

        //Question6
//        Write the statements that generate 1 random integer within 0 – 255. Convert the
//number to binary and store the bit into an 8 bit array. Then, display the binary
//number.
            Random ran = new Random();
            int decimal = ran.nextInt(256);
            int oridecimal = decimal;
            System.out.println(decimal);
            int[]binary ;
            int i=0;
            while(oridecimal >0){
                oridecimal = oridecimal/2;
                i++;
                            
            }binary = new int[i];
            
            for(int k=0;k<binary.length;k++){
                int modules = decimal%2;
                decimal = decimal/2;
                binary[k]=modules;
            }
            for (int j=binary.length-1;j>=0;j--){
                System.out.print(binary[j]);
                }
                
    }
    
}
