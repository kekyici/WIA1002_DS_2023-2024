/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Tutorialtest;
import java.util.Random;

/**
 *
 * @author YiCi Kek
 */
public class Tutorial01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
       //exercise 1a
       int mark = 130;
       if(0 <= mark && mark <= 100){
           System.out.println("num is valid");
       
       }else{
           System.out.println("num is invalid");
       }
       //exercise1b
       int gender = 1;
       int day = 2;
       int age = 33;
       if (gender == 1 && day == 2 && age >= 50){
           System.out.println("discount");
       }else {
           System.out.println("No discount");
       }
       
       //exercise 2
       String exer1 = "um";
       String exer2 = "UM";
       
       if (exer1.equalsIgnoreCase(exer2)){
           System.out.println("They are equal strings");
       }else{
           System.out.println("They are not equal strings");
       }
        
        
        // exercise 3a
        Random num = new Random();
        int number;
        number = num.nextInt(101);
        
        if (number >= 50){
            System.out.println( number+ " is greater than 50");
            
        }else {
            System.out.println(number +"is less than 50");
        }
        
       
        //exercise 3b
        Random dice = new Random();
        int ndice1, ndice2;
        ndice1 = dice.nextInt(6)+1;
        ndice2 = dice.nextInt(6)+1;

        System.out.println("Player1 dice number: "+ ndice1);
        System.out.println("Player2 dice number: "+ ndice2);

        if(ndice1 > ndice2){
        System.out.println("Congratulation Player 1 won the games");
        
        } else if (ndice2 > ndice1){
        System.out.println("Congratulation Player 2 wont the game");
        
        } else {
            System.out.println("It's a tie");
        }
        
        // exercise 
        int xyz = 1;
        switch( xyz ){
            case 1:
                System.out.println("Draw Pie Chart");
                break;
            case 2:
                System.out.println("Draw Line Chart");
                break;
            case 3 :
                System.out.println("Draw Bar Chart");
                break;
            default:
                System.out.println("Invalid Choice");
                
            
        }
        
        
     
        
        

        
    }
}
