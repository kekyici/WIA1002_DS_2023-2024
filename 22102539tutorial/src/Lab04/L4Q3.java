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
public class L4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int score=1;
        int min=10000, max=0,i=0;
        double sum =0, avscore=0, xp2=0,sumofxp2=0, sumx2 = 0, ssum=0;
        while (score>=0){
            System.out.print("Enter a score [negative score to quit]:");
            score = scn.nextInt();
            if(score<min && score>0){
                min=score;
                sum = score + sum;
                xp2= score*score;
                sumofxp2=xp2+sumofxp2;
                i++;}
            
            else if ( score > max){
                max = score;
                sum = score + sum;
                xp2= score*score;
                sumofxp2=xp2+sumofxp2;
                i++;}
            }
        
        avscore = sum/i;
        sumx2 = (sum*sum)/i;
        ssum = (sumofxp2-sumx2)/(i-1);
        System.out.println(ssum);
        System.out.println("Minimum Score: "+min);
        System.out.println("Maximum Score: "+max);
        System.out.println("Average Score: "+avscore);
        System.out.printf("Starndard Deviation: %.2f",Math.sqrt(ssum));

    }
    
}
