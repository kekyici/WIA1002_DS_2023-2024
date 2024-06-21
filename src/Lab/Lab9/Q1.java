/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab9;
import java.util.Scanner;
public class Q1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter a String: ");
        String str = scn.nextLine();
        int length = str.length()-1;
        int i =0;
        System.out.println(substitute(str,length,i));
        
        
    }
    public static String substitute(String str, int length,int i){
        if(length<i)
            return "";
        
        else{
            char strChar = str.charAt(i);
            if (strChar == 'a')
                strChar = 'i';
            return strChar + substitute(str,length,i+1);
        }
    }
}
