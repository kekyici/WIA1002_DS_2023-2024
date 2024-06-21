/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license4
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab02;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author YiCi Kek
 */
public class L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Question 1
        int tempFah = 86;
        double convert1= ((tempFah-32)*5.0)/9.0;
        System.out.printf("The temperature in Celsius : %4.2f\n", convert1);
        System.out.println("");

        //Question 2
        Scanner number1 = new Scanner(System.in);
        System.out.print("Please enter price of the car: ");
        int P = number1.nextInt();

        System.out.print("Please enter Down payment: ");
        int D = number1.nextInt();

        System.out.print("Please enter Interest Rate in %: ");
        int R = number1.nextInt();
        
        System.out.print("Please enter Loan duration in year: ");
        int Y = number1.nextInt();
        
        
        double M = (P-D)*(1+R*Y/100)/(Y*12);
        
        System.out.printf("The monthly payment for car loan is %4.2f", M );
        System.out.println("\n");
        
        //Question 3
        Random rnumber = new Random();
        int num1,num2,num3;
        num1 = rnumber.nextInt(40)+10;
        num2 = rnumber.nextInt(40)+10;
        num3 = rnumber.nextInt(40)+10;
        System.out.println("Random Number1: " + num1 +"\n"
                        + "Random Number2: "+ num2 +"\n"
                        + "Random Number3: " + num3 );
        int total = num1+num2+num3;
        System.out.println("The sum of the numbers : " +total);
        
        double average = total/3;
        System.out.printf("The average of the numbers : %4.2f" , average);
        System.out.println("\n");
        
        //Question 4
        int seconds = 123456;
        int hours = (seconds/3600);
        int minute = (seconds%3600)/60;
        int seconds1 = ((seconds%3600)%60);
        System.out.println(seconds + " seconds is " +hours+" hours, "+minute+" minutes and "+seconds1+" seconds\n");  
        
        //Question 5
        int random1 = rnumber.nextInt(10000);
        System.out.println("The random number is "+random1);
        
         int number = random1;
         int digitSum = 0;

         while (number > 0) {
            int digit = number % 10;
            digitSum += digit;
            number /= 10;
         }
            
        System.out.println("Sum of all the digit: " + digitSum);
        System.out.println("");
        
        //Question 6
        System.out.print("Enter the amount of water in gram: ");
        int M1 = number1.nextInt();
        double M2 = M1/1000.00;
        
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double intemp = number1.nextDouble();
        double cintemp= ((intemp-32)*5.00)/9.00;
        
        System.out.print("Enter the final Temperature in Fahrenheit: ");
        double ftemp = number1.nextDouble();
        double cftemp = ((ftemp-32)*5.00)/9.00;
        
        double Q = M2*(cftemp - cintemp)*4184;
        System.out.printf("The energy needed is %e", Q);
        System.out.println("\n");
        
        
        
        
        
         
        
        
        
        
       
    }
    }
    

