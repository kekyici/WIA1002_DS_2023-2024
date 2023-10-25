/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author YiCi Kek
 */
public class Tutorial02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Question 1 
        String p1 = "Faculty of ";
        String p2 = "Computer Science ";
        String p3 = "and Information Technology ";
        
        System.out.println(p1 + p2 + p3);

        System.out.println("Faculty of \n Computer Science \n and Information Technology ");
        
        //Question 2 
        String SDN = "Software-define networking";
        System.out.println(SDN);
        
        //Quesiton 3 
        System.out.println("Java Programming");
 
        System.out.println ("Introduction to Java");

        System.out.println("\t is the horizontal tab character");

        System.out.println("Java is case sensitive!");
        
        //Question 4 a
        int matricnumber;
        
        double pi ;
        
        boolean M = false;
        System.out.println(M);
        
        long P = 880000000;
        System.out.println(P);
        
        char letter = 'U';
        System.out.println(letter);
        
        final String PRO = "Java";
        System.out.println(PRO);
        
        //Question 5 
        final double AMOUNT = 32.5;
        double AMOUNT1 = AMOUNT + 10;
        System.out.println("The amount is "+ AMOUNT1);
        
        String chapter = "Summary";
        System.out.println(chapter);
        
        int num = 0;
        num++;
        int num1 = num;
        
        int num2 = 3000;
        System.out.printf("%d\n", num2);
        
        String contact;
        Scanner keyboard = new Scanner (System.in);
        System.out.print("Please input contact:");
        contact = keyboard.nextLine();
        System.out.println("Contact: " + contact);
        
        
        //Question 6
        Scanner num123 = new Scanner (System.in);
        System.out.print("Please input the diameter:");
        double diameter = num123.nextDouble();
        double pi1 = Math.PI;
        double circumference = pi1*diameter;
        System.out.printf("%4.3f\n", circumference);
        
        
        Scanner num1234 = new Scanner (System.in);
        System.out.print("Please input the inches:");
        double inches = num1234.nextDouble();
        double cm = 2.54;
        double converts = (inches*cm)/100;
        
        System.out.printf("%4.2f\n", converts);
        
        num1234.close();
        num123.close();
        keyboard.close();

    }
    
}
