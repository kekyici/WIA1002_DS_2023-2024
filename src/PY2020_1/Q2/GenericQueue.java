/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PY2020_1.Q2;

/**
 *
 * @author YiCi Kek
 */
public class GenericQueue<E> {
    Node<E> head,tail;
    private int max ;
    int size;
    
    public static class Node<E>{
        E element;
        Node<E> next;
        
        public Node(E element){
            this.element = element;
            this.next = next;
        }
    }
    
    public GenericQueue(){
        this(20);
    }
    public GenericQueue(int max){
        this.max=max;
        this.head=null;
        this.tail=null;
        this.size=0;
        
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==max;
    }
    public E peek(){
        return isEmpty() ? null: head.element;
    }
    public void enqueue(E e){
       Node<E> newNode = new Node<E>(e);

        if (tail == null) {
             head = tail = newNode; 
        }
        else {
            tail.next = newNode; 
            tail = tail.next;
        }
        size++;
        System.out.println("Enqueue: "+e);
        
    }
    public void enqueueMany(String e){
        String[] splitE = e.split(",");
        for(String str : splitE){
            enqueue((E)str);
        }
        
    }
    public void dequeue(){
        if (!isEmpty()){
            E element = head.element;
            head=head.next;
            System.out.println("Dequeue: "+ element);
            size--;
        }else{
           System.out.println("Dequeue: "+ null);
        }
    }
    public void dequeueAll(){
        if(!isEmpty()){
            System.out.println("\nThere are "+size+"  items in the queue. Removing them all...");
            while(head!=null){
                dequeue();
            }
        }
    }
    public void changeOrder(int num){
        Node<E> previous = head;
        
        for(int i=0;i<num-2;i++){
           previous=previous.next;
        }
        tail.next=head;
        head= previous.next;
        previous.next=null;
        tail=previous;
        System.out.println("\nChange queue order...");
       
    }
    public void display(){
        System.out.println("");
        if(isEmpty()){
            System.out.println("Nothing to display");
        }else{
            System.out.println("\nThere are "+ size+" items in the queue. Displaying...");
            for(Node<E> current=head;current!=null;current=current.next){
                System.out.print(current.element+" | ");
            }
            System.out.println("");
        }
    }
    
}
