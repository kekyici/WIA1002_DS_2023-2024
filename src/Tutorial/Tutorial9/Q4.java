
package Tutorial9;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner (System.in);
        System.out.print ("Enter Number : ");
        int num = scn.nextInt();
        System.out.println("The recursive method: ");
        for(int i =num;i>=2;i--){
            System.out.print(i+"+");
        }
        System.out.print("1"+"=");
        System.out.println(recursiveCase(num));
        
        
    }
    
    public static int recursiveCase(int num){
        if(num ==0)
            return 0;
        return num + recursiveCase(num-1);
    }
}
