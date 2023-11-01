/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TutorialAns;
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

        Random number1 = new Random();
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
        
        //Question 1d
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
        switch (number) {
            case 0 -> System.out.println("Sunday\n");
            case 1 -> System.out.println("Monday\n");
            case 2 -> System.out.println("Tuesday\n");
            case 3 -> System.out.println("Wednesday\n");
            case 4 -> System.out.println("Thursday\n");
            case 5 -> System.out.println("Friday\n");
            case 6 -> System.out.println("Saturday\n");
            default -> System.out.println("This program accepts the number from 0 to 6\n");
        }
        
        //Question 2a
        int num1 = number1.nextInt(10);
        int num2 = number1.nextInt(10);
        if (num1==num2){
            System.out.println("Number 1 is equal to number 2.\n");
        } else{
            System.out.println("Number 1 is not equal to number 2.\n");
        }

        //Question 2b
        int x = number1.nextInt(10);
        int y = number1.nextInt(10) ;
        int z = number1.nextInt(10);
        if (x > y && y>z){
            System.out.println("x is the largest number.\n");
        }else {
            System.out.println("x is not the largest number. \n");
        }
        
        //Question 2c
        String s1,s2;
        System.out.print("Please input a word: ");
        s1= text.nextLine();
        System.out.print("Please input a word: ");
        s2 = text.nextLine();
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("They are equal strings.\n");
        }else{
            System.out.println("They are not equal strings.\n");
        }
        
        //Question 2d
        int x2 = number1.nextInt(10);
        int y2 = number1.nextInt(10);
        if(x2>0||y2>0){
            System.out.println("Either x or y is positive.\n");
        }else {
            System.out.println("Both are not positive. \n");
        }
        
        //Question 3
//        a = error
//        b = error
//        c = $$$$$
//        d = error
        
        //Question 4

        int enum1 = number1.nextInt(11);
        int rnum2 = number1.nextInt(11);
        int rnum3 = number1.nextInt(11);
        System.out.println(enum1+" "+rnum2+" "+rnum3);
        
        if (enum1>= rnum2 && enum1>=rnum3){
            System.out.println(enum1+" is the biggest number.\n");
        }else if(rnum2>=enum1 && rnum2>=rnum3){
            System.out.println(rnum2+" is the biggest number. \n");
        }else if(rnum3>=enum1 && rnum3>=rnum2){
            System.out.println(rnum3+" is the biggest number. \n");
        }
        else{
            System.out.println("3 of them are equal\n");
        }
       
        //Question 5
        System.out.println("Please input a year: ");
        int year = text.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        
        
      }  
        
    }
    

