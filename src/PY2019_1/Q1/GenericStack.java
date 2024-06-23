
package PY2019_1.Q1;

import java.awt.BorderLayout;

public class GenericStack<E>{
    Node<E> head, tail;
    int size;
    int max;
    
    public static class Node<E>{
        E element;
        Node<E> next;
        
        public Node(E element, Node<E> next){
            this.element= element;
            this.next=next;
        }
    }
    
    public GenericStack(){
        this(25);
        
    }
    public GenericStack(int max){
        this.max= max;
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
       return isEmpty()?null:head.element;
    }
    
    public void push(E element){
        if(isFull())
            throw new IllegalStateException("Stack is Full");
        
        Node<E> newNode = new Node(element,head);
        if(head==null)
            tail=newNode;
        head = newNode;
        size++;
        
        System.out.println("Push: "+element);
    }
    public void pushMany(String manyE){
        String [] list = manyE.split(",");
        for(String str:list){
            push((E)str);
        }
    }
    public E pop(){
        if(!isEmpty()){
            Node<E> prev = head;
            head=head.next;
            System.out.println("Pop the top of stack...");
            return prev.element;
        }else{
            return null;
        } 
       
    }
    public void popAll(){
        if(!isEmpty()){
            System.out.println("There are "+ size+" items in the stack. Removing all...");
            while(head!=null){
                Node<E> prev = head;
                head=head.next;
                System.out.println("Removing "+ prev.element+" ..");
            }
        }
    }
    
    public void display(){
        if(isEmpty())
            System.out.println("Stack is empty, nothing to display");
        else{
            Node<E> current ;
            System.out.println("\nThere are "+ size + " items in the stack. Displaying...");
            for(current=head;current!=null;current=current.next)
                System.out.println(current.element);
        }
        System.out.println("");
    }
}
