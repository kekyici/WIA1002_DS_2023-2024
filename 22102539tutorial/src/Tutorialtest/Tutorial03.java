/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tutorialtest;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author YiCi Kek
 */
public class Tutorial03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        //Question 1a
        System.out.println("3x8=24 not 27 \n");
        
        //Question 1b
        Scanner text = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int num = text.nextInt();
        if (num%2==0){
            System.out.println("This integer is an even number\n");
        }else{
            System.out.println("This integer is an odd number\n");
        }
        
       //Question 1c
        char ch = 'A';
         
        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter.\n");
        } else {
            System.out.println(ch + " is not an uppercase letter.\n");
        }
        
        //Question 1d2
        String s1d = "apple";
        String s2d = "banana";
        int result = s1d.compareToIgnoreCase(s2d);
        if(result<0){
            System.out.println(s1d+ " comes before "+s2d+"\n");
        }else{
            System.out.println(s2d+ " comes before "+s1d+"\n");
        }
        
        //Question 1e
        System.out.print("Enter a number: ");
        int number = text.nextInt();
        switch(number){
            case 0:
                System.out.println("Sunday\n");
                break;
                
            case 1:
                System.out.println("Monday\n");
                break;
                
            case 2:
                System.out.println("Tuesday\n");
                break;
                
            case 3:
                System.out.println("Wednesday\n");
                break;
                
            case 4:
                System.out.println("Thursday\n");
                break;
                
            case 5:
                System.out.println("Friday\n");
                break;
                
            case 6:
                System.out.println("Saturday\n");
                break;
                
            default:
                System.out.println("This program accepts the number from 0 to 6\n");
        }
        
        //Question 2a
        int num1 = 1;
        int num2 = 1;
        if (num1==num2){
            System.out.println("Number 1 is equal to number 2.\n");
        }   
        //Question 2b
        int x = 5 ;
        int y = 4 ;
        int z = 3 ;
        if (x > y && y>z){
            System.out.println("x is the largest number.\n");
        }
        
        //Question 2c
        String s1,s2;
        s1= "Hello World";
        s2 = "Hellow World";
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("They are equal strings.\n");
        }else{
            System.out.println("They are not equal strings.\n");
        }
        
        //Question 2d
        int x2 = 3;
        int y2 = 0;
        if(x2>0||y2>0){
            System.out.println("Either x or y is positive.\n");
        }
        
        //Question 3
//        a = error
//        b = error
//        c = $$$$$
//        d = error
        
        //Question 4
        Random number1 = new Random();
        int rnum1 = number1.nextInt(11);
        int rnum2 = number1.nextInt(11);
        int rnum3 = number1.nextInt(11);
        System.out.println(rnum1+" "+rnum2+" "+rnum3);
        
        if (rnum1>= rnum2 && rnum1>=rnum3){
            System.out.println(rnum1+" is the biggest number.\n");
        }else if(rnum2>=rnum1 && rnum2>=rnum3){
            System.out.println(rnum2+" is the biggest number. \n");
        }else if(rnum3>=rnum1 && rnum3>=rnum2){
            System.out.println(rnum3+" is the biggest number. \n");
        }
        else{
            System.out.println("3 of them are equal\n");
        }
       
        //Question 5
        int year = 2024; 

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        
        
      }  
        
    }
    

