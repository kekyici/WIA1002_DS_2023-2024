/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PY2020_1.Q2;

/**
 *
 * @author YiCi Kek
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         GenericQueue<String> q = new GenericQueue<String>(10);
        q.enqueue("Dom T");
        q.enqueue("Rafa N");
        q.enqueueMany("Roger F,Danill M,Novak D,Alex Z,Stef T,Karen K");
        q.display();
        q.dequeue();
        q.enqueue("Matt B");
        q.enqueue("Kei N");
        q.display();
        q.dequeueAll();
        q.display();
        System.out.println("---------------------------------------");

        GenericQueue<Integer> q2 = new GenericQueue<Integer>(10);
        q2.enqueue(10);
        q2.enqueue(20);
        q2.enqueueMany("30,40,50,60,70,80,90");
        q2.display();
        q2.changeOrder(5);
        q2.display();
    }
    
}
