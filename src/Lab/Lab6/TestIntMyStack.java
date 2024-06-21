package Lab6;
import java.util.Scanner;
import java.util.Random;

public class TestIntMyStack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int num = scn.nextInt();
        
        GenericStack <Integer> stack = new GenericStack<>();
        stack.push(num);
        System.out.println("The size of the stack: "+ stack.getSize());
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        GenericStack <Integer> S = new GenericStack<>();
        Random ran = new Random();
        for(int i =0;i<5;i++){
            int num1 = ran.nextInt(10);
            S.push(num1);
        }
        System.out.println(S);
        int sum =0;
        GenericStack < Integer> tempS = new GenericStack<>();
        while (!S.isEmpty()){
            int element = S.pop();
            sum+=element;
            tempS.push(element);

        }
        System.out.println(sum);
        while(!tempS.isEmpty()){
            S.push(tempS.pop());
        }
        System.out.println(S);


    }
}

