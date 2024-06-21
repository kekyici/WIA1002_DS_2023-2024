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
public class L4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        8. Write a program that generates the first n prime number. n is an random integer
//        within 0 to 100
          Random ran = new Random();
          
            
            int i,j;
            int num = ran.nextInt(101)+4;
            System.out.println("Random number:"+num);
            for (j=1;j<num;j++){
                if (j==1||j==2)
                    System.out.print(j+" ");
                else{
                    boolean isPrime = true;
                    for (i = 2; i < j; i++) {
                        if (j % i == 0) {

                            isPrime = false;
                            break;
                        }}

                    if (isPrime==true) {
                        System.out.print(i+" ");}
                    else{
                        continue;}
                }
                
        }
    }
}

            
          
          
//          boolean isPrime =false;
//          int i,mod=0;
//          int num = ran.nextInt(101);
//          while(isPrime==false){
//            for(i=2;i<num;i++){
//                 mod = num%i;
//                if (mod==0){
//                    System.out.println(mod);
//                    System.out.println(num+" is not a Prime number");
//                    isPrime = false;
//                    break;}
//                else if ( num%2==0||num%3==0||num%5==0||num%7==0||num%11==0){
//                    System.out.println(num+" is not a Prime number");
//                    isPrime = false;}
//                else{    
//                    isPrime = true;}}
//            i=2;
//            num = ran.nextInt(101);}
//
//                if(isPrime==true){
//                    System.out.println(mod);
//                    System.out.println(num+" is a Prime Number");}
               
                
                
                
                
            
          
            
            
         
            
            
           
          
    
    

