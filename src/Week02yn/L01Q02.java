/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02yn;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class L01Q02 {
     public static void main (String []args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        System.out.println("Please enter your name");
        name = keyboard.next();
        
        int number1;
        System.out.println("Please enter your matric number");
        number1= keyboard.nextInt();
        
        String address;
        System.out.println("Please enter your address" );
        address = keyboard.next();
        
        String email;
        System.out.println("Please enter your email");
        email = keyboard.next();
        
        int number2;
        System.out.println("Please enter your contact");
        number2 = keyboard.nextInt();
        
        String colour;
        System.out.println("Please enter your favourite colour");
        colour = keyboard.next();
        
        System.out.println("My Profile" + "\nFull name: " + name + "\nMatric number: " + number1 + "\nAddress: " + address + "\nEmail: " + email + "\nContact: " + number2 + "\nFavourite colour: " + colour);
        
    }
}
