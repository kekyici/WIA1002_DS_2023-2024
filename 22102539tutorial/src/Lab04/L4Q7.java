/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab04;
import java.util.Scanner;
/**
 *
 * @author YiCi Kek
 */
public class L4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double P = scn.nextInt();
        System.out.print("Enter interest in %: ");
        double ints = scn.nextInt();
        System.out.print("Enter total number of month(s): ");
        double mon = scn.nextInt();
        double Mpayment1 =(1+(ints/(12*100)));
        double npower = Math.pow(Mpayment1, -mon);
        double M =(P*(ints/(12*100)))/(1-npower);
        double tLn =0;
        
       
        System.out.println("Month \t Monthly Payment \t Principal \t Interest \t Unpaid Balance \t Total Interest");
        for(int i=1;i<=mon;i++){
            System.out.print(i+"\t     ");
            System.out.printf("%.2f",M);
            System.out.print("\t\t  ");
            double Cnp = -(1+mon-i);
            double Cnpower = Math.pow(Mpayment1, Cnp);
            double Cn = M*Cnpower;
            System.out.printf("%.2f",Cn);
            System.out.print("\t  ");
            
            double Ln = M-Cn;
            System.out.printf("%.2f",Ln);
            System.out.print("\t\t     ");
            
            double Rn = (Ln/(ints/(12*100)))-Cn;
            System.out.printf("%.2f",Rn);
            System.out.print("\t\t     ");
            
            
            tLn = Ln + tLn;
            System.out.printf("%.2f",tLn);
            System.out.println("");
        }
    }
    
}
