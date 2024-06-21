/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tutorial5;

/**
 *
 * @author YiCi Kek
 */
public class Question1 <E> {
    Node<E> head, tail;
    private int size =0;
    public class Node<E>{
        E element;
        Node<E> next;
        Node<E> prev;
        
        public Node( E element, Node next, Node prev){
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
        
        public Node(E element){
             this ( element, null, null);
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void addLast(E element){
        Node<E> tmp = new Node(element, null, tail);
        if(tail != null){tail.next = tmp;}
        tail= tmp;
        if(head==null){head = tmp;}
        size++;
        System.out.println("Adding: "+ element);
    }
    
    public void addFirst(E element){
        Node<E> tmp = new Node(element,head,null);
        if (head!= null){head.prev= tmp;}
        head=tmp;
        if(tail==null){tail=tmp;}
        size++;
        System.out.println("adding :"+element);
    }
    
   public E xyz(int index, E e) {
        if (index < 0 || index > size) { // Corrected index check
            return null;
        } else if (index == 0) { // Insert at the beginning
            addFirst(e);
            return null; // No previous element to return
        } else if (index == size) { // Insert at the end
            addLast(e);
            return null; // No previous element to return
        } else { // Insert in the middle
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node<E> newNode = new Node<>(e);
            newNode.next = current.next;
            current.next = newNode;
            size++;
            return current.element;
    }
}

    
}
