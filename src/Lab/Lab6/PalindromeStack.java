package Lab6;
import java.util.Scanner;
import java.util.Stack;


public class PalindromeStack {
    public static void main(String[] args) {
        System.out.println(" Please input a character(15 char maximum):");
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

        String inputLowerC = input.toLowerCase();
        if(inputLowerC.length()<=1){
            return check=true;
        }

        Stack<Character> S = new Stack<>();
        int length = inputLowerC.length();
        int checknum = 0 ;
       

        for(int i =0;i<length/2;i++){
            S.push(inputLowerC.charAt(i));
        }

        if(length%2==0){
            checknum=length/2;
        }else if(length%2==1){
            checknum=(length/2)+1;
        }

        for(int j= checknum ;j<length;j++){
            if (S.isEmpty() || inputLowerC.charAt(j) != S.pop()) {
                check = false;
            }
        }


        return check;
    }
}
