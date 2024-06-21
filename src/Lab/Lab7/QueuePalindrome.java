package Lab7;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class QueuePalindrome {
    public static void main(String[] args) {

        System.out.println("Please input a words (maximum 15 character):");
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();

        
        if(input.length()>15){
            System.out.println(" The input more than 15 character");
        }else{
            if(checkPalindrom(input)){
                System.out.println("The String is Palindrom");
            }else{
                System.out.println(" The String is not Palindrom");
            }
        }

    }

    public static boolean checkPalindrom(String input){
        boolean check = true;
        MyQueue <Character> q = new MyQueue<>();
        String ipLowerC = input.toLowerCase();
        int length = ipLowerC.length();
        for(int i =0;i<length/2;i++){
            q.enqueue(ipLowerC.charAt(i));
        }
        System.out.println(q);
        for(int j= length-1 ;j>length/2;j--){
            if (q.isEmpty() || ipLowerC.charAt(j) != q.dequeue()) {
                check = false;
            }
        }
        return check;
    }
}
