
package PY2019_1.Q2;

public class GenericQueue<E> {
    Node<E> head, tail;
    int max ;
    int size;
    
    public class Node<E>{
        E element;
        Node<E> next;
        
        public Node(E element){
            this.element = element;
            
        
        }
    }
    
    public GenericQueue(){
        this(25);
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
        return size>=max;
    }
    public E peek(){
        return isEmpty()?null:head.element;
    }
    public void enqueue(E e){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        else{
            Node<E> newNode = new Node(e);
            if(tail==null)
                tail=head=newNode;
            else{
                tail.next=newNode;
                tail=tail.next;
            }
            size++;
            System.out.println("Enqueue: "+e);
        }
    }
    public void enqueueMany(String str){
        String[] list = str.split(",");
        for(String e : list){
            enqueue((E)e);
        }
    }
    public void dequeue(){
        if(!isEmpty()){
            E element = head.element;
            head = head.next;
            System.out.println("Dequeue: "+element);
            size--;
        }else{
            System.out.println("There is no item");
        }
    }
    public void dequeueAll(){
        if(!isEmpty()){
            System.out.println("\nThere are "+ size +" items in the queue. Removing them all ....");
            while(head!=null){
                dequeue();
            }
        }
    }
    
    public void display(){
        if(isEmpty())
            System.out.println( "\nNothing to display");
        else{
            Node<E> current ;
            System.out.println("\nThere are "+ size + " items in the queue. Displaying...");
            for(current=head;current!=null;current=current.next)
                System.out.println(current.element);
        }
        System.out.println("");
    }
}
