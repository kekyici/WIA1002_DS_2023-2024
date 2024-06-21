
package Lab4;

public class MyLinkedList<E> {
    
    private Node<E> head, tail;
    private int size =0;
    
    private static class Node<E>{
    
    E element;
    Node<E> next;
    
        public Node(E element){
            this.element=element;
        }
    }
    
    public MyLinkedList(){
        
    }
    
    

    public static void main(String[] args) {
        // TODO code application logic here
        MyLinkedList <Character> node= new MyLinkedList<Character>();
        node.addFirst('a');
        print(node);
        node.add('b');
        node.add('c');
        node.add('d');
        node.add('e');
        print(node);
        node.reverse();
        print(node);
        System.out.println("Number of element in the list: "+node.size);
        System.out.println("The first element: "+ node.getFirst());
        System.out.println("The last element: "+ node.getLast());
        System.out.println("Remove Third element: "+ node.remove(3));
        System.out.println("Retrieve the index location for second:"+ node.get(2));
        System.out.println("Retrieve the index location for third:"+ node.get(3)); 
        System.out.println("Check if the list has value 'c'");
       
        
        int found = node.indexOf('c');
        if (found<0){
            System.out.println("It does not have the character");
        }else{
            System.out.println("The value found in the list. The number of index is " + found);
        }
        print(node);
        
        System.out.println("The Item have replace to "+ node.set(0, 'j'));
        System.out.println("The Item have replace to "+ node.set(1, 'a'));
        System.out.println("The Item have replace to "+ node.set(2, 'v'));
        System.out.println("The Item have replace to "+ node.set(3, 'a'));
        print(node);
    }
    
     
   public void addFirst(E element) {
        Node<E> newNode = new Node<E>(element);
        newNode.next = head; // Link the new node to the existing list
        head = newNode; // Update the head to the new node
        if (tail == null) {
            tail = newNode; // If the list was empty, update the tail as well
        }
        size++;
    }
   
   public void addLast(E e){
       if(tail==null){
           head=tail =new Node<>(e);
       }else{
           tail.next= new Node<>(e);
           tail= tail.next;
       }
       size++;
   }
   
   public void add(E e){
       addLast(e);
   }
    
   public void add(int index, E e){
       if(index==0)addFirst(e);
       else if(index==size)addLast(e);
       else{
           Node<E> current = head;
           for(int i=1;i<index;i++){
               current=current.next;
           }
           Node<E> temp = current.next;
           current.next= new Node<>(e);
           (current.next).next = temp;
           size++;
       
       }
   }
   
   public E removeFirst(){
       if(size==0)return null;
       else{
           Node<E> temp = head;
           head=head.next;
           size--;
           if(head==null)tail=null;
           return temp.element;
       }
   }
   
   public E removeLast(){
       if(size==0)return null;
       else if( size ==1 ){
           Node <E> temp = head;
           head=tail=null;
           size=0;
           return temp.element;
       }
       else{
           Node<E> current = head;
           for(int i=0;i<size-2;i++)
               current = current.next;
           Node<E> temp = tail;
           tail=current;
           tail.next=null;
           size--;
           return temp.element;
           
       }
   }
   
   public E remove(int index){
        if (index < 0 || index >= size) return null;
        else if(index==0)return removeFirst();
        else if(index==size)return removeLast();
        else{
            Node<E> previous = head;
            for(int i=1;i<index;i++){
                previous=previous.next;
            }Node<E> current= previous.next;
            previous.next=current.next;
            size--;
            return current.element;
        }
   }   
    public boolean contains(E e) {
        Node<E> current = head; 
        if (current == null) {
            return false;
        }
        do{
            System.out.println(current.element);
            if (current.element.equals(e)) {
                return true; 
            }
            current = current.next;     
        } while (current != null);
        return false;
    }
    
    public E get(int index){
        if(index==0)return getFirst();
        else if(index==size)return getLast();
        else{
            Node<E> get = head;
            for(int i=1;i<index;i++){
                get=get.next;
            }Node<E> current= get.next;
            return current.element;}
    }
   
    public E getFirst() {
        if (size == 0) {
          return null;
        }
        else {
          return head.element;
        }
    }


   public E getLast() {
        if (size == 0) {
          return null;
        }
        else {
          return tail.element;
        }
    }
   
   public int indexOf(E e){
        int where =-1;
        boolean found = false;
        int index=0;
        Node<E> current = head;
        while(found!=true && current!=null){
           if(e.equals(current.element)){
                where = index;
                found = true;}
           current = current.next;
           index++;
        }
        return where;
   }
   
   public int lastIndexOf(E e){
        if (head == null) 
            return -1;
        if ((head.element).equals(e))
            return 0;
        

        return -1; 
   }
   
   public E set (int index, E e){
       Node<E> current=head;
       for(int i=0;i<index;i++)
           current=current.next;
       current.element=e;
       
       return e;
   }
   
   public void clear(){
       size = 0;
       head = tail = null;
   }
   
   public static<E>void print(MyLinkedList <E> e){
       
       Node<E> current = e.head;
       while(current!=null){
           System.out.print(current.element+" -> ");
           current=current.next;
       
       }
       System.out.println("null");
   }
   
   public void reverse() {
        Node<E> prev = null;
        Node<E> current = head;
        while (current != null) {
            Node<E> nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
        size = size; // Update size after reversing
    }

}
