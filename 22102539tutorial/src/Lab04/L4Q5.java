/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab04;
import java.util.Random;
/**
 *
 * @author YiCi Kek
 */
public class L4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*5. Write a simple two players dice game. Each player will take turns to roll a dice. The
        first players that reach more than 100 points win the game. If the player rolls a 6, the
        player will score 6 points and has the chance to roll again.*/
        Random ran = new Random();
        
        int dice1 = ran.nextInt(7)+1;
        int dice2 = ran.nextInt(7)+1;
        int ply1, ply2;
        for (ply1=0, ply2=0; ply1<100 || ply2<100;){
            if (dice1==6){
                ply1 = ply1+dice1;
                dice1 = ran.nextInt(7)+1;}
            
            else if (dice2==6){
                ply2 = ply2+dice2;
                dice2 = ran.nextInt(7)+1; }
            
            ply1 = ply1+dice1;
            ply2 = ply2+dice2;
            dice1 = ran.nextInt(7)+1;
            dice2 = ran.nextInt(7)+1; }
        System.out.println("Player1:"+ply1);
        System.out.println("Player2:"+ply2);
        if(ply1>ply2)System.out.println("Congrate Player1.");
        else if (ply1<ply2)System.out.println("Congrate Player2.");
        else if (ply1==ply2)System.out.println("Both of you are tie");
    }
    
}
