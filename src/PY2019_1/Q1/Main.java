/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PY2019_1.Q1;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        GenericStack<String> stack1 = new GenericStack<String>(5);
        stack1.push("one");
        stack1.display();
        stack1.pushMany("two,three four,five,six seven");
        stack1.display();
        stack1.pop();
        stack1.pop();
        stack1.display();
        System.out.println("-------------------------");
        
        GenericStack<Integer> stack2 = new GenericStack<Integer>(5);
        stack2.push(1);
        stack2.push(2);
        stack2.pushMany("3 4,5,6 7");
        stack2.display();
        stack2.popAll();
        stack2.display();
    }
    
}
