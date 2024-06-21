/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PY2020_1.Q1;

@SuppressWarnings("unchecked")
public class GenericStack<E> {
    Node <E> head;
    Node <E> tail;
    int max=20;
     int size;
     
     public static class Node<E>{
         E element;
         Node<E>next;
         
         public Node(E element,Node<E> next){
             this.element= element;
             this.next = next;
         }
     }
     
     public GenericStack(){
          this(20);
          
     }
     
     public GenericStack(int max){
         this.max = max;
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
         return isEmpty()? null: head.element;
     }
     public void push(E e){
         if(isFull()){
             throw new IllegalStateException("The Stack is Full");
         }
         Node<E> newNode = new Node<E>(e, head);
           if (head == null) {
            tail = newNode;
        }
         head = newNode;
         size++;
         System.out.println("Push: " + e);
         
     }
     public void pushMany(String element){
         String[] array = element.split(",");
         for(String ary:array){
             push((E)ary);

         }
         
     }
     public E pop(){
         if(!isEmpty()){
             E element = head.element;
             head= head.next;
             size--;
             return element;
         }else
             return null;
     }
     public E popMiddle(){
         
         if(size%2==0){
             System.out.println("The stack size is even, no medium element to pop");
             return null;
         }else{
             int medIndex = size>>1;
             Node<E> previous = head;
             for(int i=0;i<medIndex;i++){
                 previous = previous.next;
             }
             Node<E> current = previous.next;
             previous.next=current.next;
             size--;
             return current.element;
         }
     }
     
     public E[] popAll(){
         if(isEmpty())
             return null;
        E[] element= (E[]) new Object[size];
        int i =0;
        while(!isEmpty()){
            element[i]=pop();
            System.out.println("Removing"+ element[i]);
            i++;
        }
        return element;
     }
     
     public void display(){
         if(isEmpty()){
             System.out.println("\nStack is empty");
             
         }else{
             System.out.println("\nThere are " +size+ "items in the stack. Displaying....");
             for(Node<E> current =head; current !=null;current=current.next){
                 System.out.println(current.element);
             }
             System.out.println("");
         }
     }
     
    
    
    
}
