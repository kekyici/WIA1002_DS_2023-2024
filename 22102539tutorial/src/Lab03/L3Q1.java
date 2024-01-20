/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab03;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author YiCi Kek
 */
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner text = new Scanner(System.in);
        
//Question 1
        System.out.print("Enter first integer: ");
        int num1 = text.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = text.nextInt();
        text.nextLine();
        
        System.out.print("Enter the operand: ");
        String operator = text.nextLine();
        char operand = operator.charAt(0);
        
        switch (operand){
            case '+' :
                int result1 = num1+num2;
                System.out.println(num1+" "+ operator.charAt(0)+" "+num2 +" = "+result1);
                break;
            
            case '-':
                int result2 = num1-num2;
                System.out.println(num1+" "+ operator.charAt(0)+" "+num2 +" = "+result2);
                break;
                
            case '*':
                int result3 = num1*num2;
                System.out.println(num1+" "+ operator.charAt(0)+" "+num2 +" = "+result3);
                break;
                
            case '/':
                int result4 = num1/num2;
                System.out.println(num1+" "+ operator.charAt(0)+" "+num2 +" = "+result4);
                break;
                
            case '%':
                int result5 = num1%num2;
                System.out.println(num1+" "+ operator.charAt(0)+" "+num2 +" = "+result5);
                break;
            
            default:
                System.out.println("The operand does not exist.");
        }
        System.out.println(" ");
        
        //Question 2
        Random text1 = new Random();
        int num3 = text1.nextInt(6);
        switch (num3){
        
            case 0 :
                System.out.println("0 is zero. ");
                break;
                
            case 1:
                System.out.println("1 is one. ");
                break;
                
            case 2:
                System.out.println("2 is two.");
                break;
                
            case 3 :
                System.out.println("3 is three.");
                break;
                
            case 4 :
                System.out.println("4 is four. ");
                break;
                
            case 5 :
                System.out.println("5 is five.");
                break;
                
            case 6 :
                System.out.println("6 is six.");
                break;
        }
        System.out.println(" ");
///////////////////////////////////////////////////////////////////Question 3
        
        double savo = 100.00;
        if (savo <= 100){
            double commission1 = savo *0.05;
            System.out.printf( "The total commission is %4.2f ", commission1);
        }else if(savo > 100 && savo <= 500){
            double commission2 = savo * 0.075;
            System.out.printf( "The total commission is %4.2f", commission2);
        }else if( savo > 500 && savo <=1000){
             double commission3 = savo *0.10;
            System.out.printf( "The total commission is %4.2f", commission3);
        }else if( savo > 1000){
             double commission4 = savo *0.125;
            System.out.printf( "The total commission is %4.2f", commission4);
        }
            System.out.println("\n");
///////////////////////////////////////////////////////////////////Question 4
        int i;
        int player1;
        int player2;
        int dice1 = 0 ;
        int dice2 = 0 ;
        for(i=0;i<2;i++){
             player1 = text1.nextInt(6)+1;
             player2 = text1.nextInt(6)+1;

             System.out.println("Player1 dice number: "+player1);
             System.out.println("Player2 dice nubmer: "+player2);
             if (player1> dice1){
                 dice1 = player1;}
             else if (player2>dice2){
                 dice2 = player2;}
             }
        if (dice1 > dice2){
            System.out.println("Player 1 wins the game.");
        }else if (dice2>dice1){
            System.out.println("Player 2 wins the game.");
        }else if (dice1==dice2){
            System.out.println("Its is a tie");
        }
        System.out.println(" ");
        //Question 5
        System.out.print("Please input a: ");
        int a5 = text.nextInt();
        System.out.print("Please input b: ");
        int b5 = text.nextInt();
        System.out.print("Please input c: ");
        int c5 = text.nextInt();
        System.out.print("Please input d: ");
        int d5 = text.nextInt();
        System.out.print("Please input e: ");
        int e5 = text.nextInt();
        System.out.print("Please input f: ");
        int f5 = text.nextInt();
       
        int div = (a5*d5 - b5*c5);
        if (div == 0){
            System.out.println("The equeation has no solution");
        }else {
        int x5 = (e5*d5-b5*f5)/div;
        int y5 = (a5*f5-e5*c5)/div;
            System.out.println("x=("+e5+"*"+d5+"-"+b5+"*"+f5+")/("+a5+"*"+d5+"-"+ b5+"*"+ c5+")\n="+x5);
            System.out.println("y=("+a5+"*"+f5+"-"+e5+"*"+c5+")/("+a5+"*"+d5+"-"+ b5+"*"+ c5+")\n="+y5);
            
        }
        System.out.println(" ");
        
        //Question 6
        System.out.print("Please enter the radius: ");
        int rad = text.nextInt();
        System.out.print("Please enter the coordinate point x: ");
        int x6 = text.nextInt();
        System.out.print("Please enter the coordinate point y: ");
        int y6 = text.nextInt();
        
        int distance = (x6*x6)+(y6*y6);
        System.out.println("The point distance between the centered of circle is "+distance);
        
        if (distance<= rad){
            System.out.println("The point is inside the circle");
        }else if (distance>rad){
            System.out.println("The point is outside the circle");
        }
        
    }
    
}       