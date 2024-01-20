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
public class Tutorial04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*       1. Write statements for each of the following
            a. Find the largest integer n so that n3
            is less than 2000.
            b. Display the square number of the first twelve integers starting from 1.
            c. Display a 4-by-5 matrix using random number within 0 to 100.
            d. Compute the sum of numbers from 1 to a given number.
            e. Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal
            places.*/

        // Question 1a.
//        int n;
//        int n3 = 2000;
//        
//        for ( n=0; (n*n*n) < n3 ; n++ ){
//            System.out.print(n+" ");
//
//        }
//        System.out.println(" ");
//        int n1= n-1;
//        System.out.println("The largest integer n is: "+ n1+"\n");
//        
//        //Question 1b
//        
//        int s ;
//        int snum = 12;
//        int s2 ;
//        for (s=1; s<=12;s++){
//            s2= s*s;
//            System.out.println("The square number of "+s+" is "+s2);
//        }
//        
//        //Question1c
//        Random ran = new Random();
//        
//        int columni,rowi;
//        for(columni=0; columni<5;columni++){
//            int column = ran.nextInt(101);
//            for (rowi=0; rowi<4; rowi++){
//                int row = ran.nextInt(101);
//                System.out.print(row+"\t");
//            }
//            System.out.println(column);
//        }
//        //Question1d
//        int comp = 1;
//        int sumcomp=0;
//        int compi;
//        for(compi=0;compi<9;compi++){
//            System.out.print(comp+" + ");
//           
//            sumcomp = comp+sumcomp;
//            comp++;
//            
//        }sumcomp = comp+sumcomp;   
//        System.out.print(comp+"="+sumcomp);
//        System.out.println(" ");
//        
//        //Question1e
//        int plus = 1;
//        int minus = 25;
//        int series ;
//        int math, summath = 0;
//        for( series=0;series<24;series++){
//            System.out.print(plus+"/"+minus+" + ");
//            math = (plus/minus);
//            summath = math +summath;
//            plus++;
//            minus--;
//            
//        } 
//            math = (plus/minus);
//            summath = math +summath;
//            System.out.print(plus+"/"+minus+"="+summath);
//            
            /*2. Correct the error for the following statements.
                a.
                    for (x = 10; x > 0; x++)
                    sum += x;
                b.
                    do
                     x += 2;
                     y += x;
                     System.out.println(x + " and " + y);
                    while (x < 100)
                c.
                    for ( x==1, y==20; x < y, x++, y-=2);
                     System.out.println(x & " " & y);
                d.
                    i =1;
                    while(i<10) {
                     if (i==10)
                     System.out.println("Program End");
                    }
                    */
            //Question2a
//            int sum =0;
//            int x;
//            for (x = 0; x < 10; x++){
//                    sum += x;
//                    System.out.print(x+"+");}
//                    sum += x;
//                    System.out.print(x+"="+sum+"");
            //Question2b
//            int x=0;
//            int y=0;
//            do{
//                x += 2;
//                y += x;
//                System.out.println(x + " and " + y);}
//            while (x < 100);
//            
            // Question2c
//            int x;
//            int y;
//            for ( x=1, y=20; x < y; x++, y-=2);{
//              
//                     System.out.println(x + " " + y);}
//            
            //Question2d
//            int i;
//            i =1;
//            while(i<=10) {
//                if (i==10){
//                System.out.println("Program End");}
//             i++;  }


            /*3. Write the statements that display the first ten values of the Fibonacci sequence. Given
            the formula f1 = 1, f2 =1, fn = fn-1 + fn-2.*/
//            int n = 10; // The number of Fibonacci numbers to display
//            int[] fibonacci = new int[n];
//
//            fibonacci[0] = 1;
//            fibonacci[1] = 1;
//
//            System.out.println("The first " + n + " Fibonacci numbers:");
//            System.out.print(fibonacci[0] + " " + fibonacci[1] + " ");
//
//            for (int i = 2; i < n; i++) {
//                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
//                System.out.print(fibonacci[i] + " ");
//            }
//
//            System.out.println();





            /*4. Write the statements that display the string in reverse order. (use String.length() to get
            the length of the string)*/
//            String sen = "Write the statements that display the string in reverse order. ";
//            int i4;
//            int numsen = sen.length();
//            int numsenr= numsen;
//            for (i4=0;i4< numsen;i4++){
//                char reverse = sen.charAt(numsenr-1);
//                System.out.print(reverse);
//                numsenr -=1;}
    }
    
    
}
