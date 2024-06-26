/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PY2020_1.Q1;

/**
 *
 * @author YiCi Kek
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           GenericStack<String> stack1 = new GenericStack<String>(7);
        stack1.push("apple");
        stack1.display();
        stack1.pushMany("brocooli,chicken sandwich,donut,french fries,juice,maruku");
        stack1.display();
        System.out.println("Pop the top of the stack: " + stack1.pop());
        System.out.println("Pop the top of the stack: " + stack1.pop());
        stack1.display();
        System.out.println("Pop middle of the stack: " + stack1.popMiddle());

        stack1.display();
        System.out.println("Pop middle of the stack: " + stack1.popMiddle());
        System.out.println("-----------------------------------------");
        GenericStack<Integer> stack2 = new GenericStack<Integer>(10);
        stack2.push(1);
        stack2.push(2);
        stack2.pushMany("3 4,5,6 7");
        stack2.display();
        stack2.popAll();
        stack2.display();
    }
    
}
