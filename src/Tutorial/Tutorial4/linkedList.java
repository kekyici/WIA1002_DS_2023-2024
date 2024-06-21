
package Tutorial4;

public class linkedList <E>{
   
    Node<E> head, tail;
    private int size = 0;

    private static class Node<E> {
    E element;
    Node<E> next;

        public Node(E element) {
          this.element = element;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        linkedList <Character> node= new linkedList<Character>();
        
 
        System.out.println("Question 1 b:");
        node.addFirst('a');
        print(node);
        node.add('z');
        print(node);

        System.out.println("\nQuestion 1 d:");
        node.addFirst('y');
        print(node);

        
        System.out.println("\nQuestion 1 e:");
        System.out.println("Whether the linked list is empty or not");
        
        System.out.println("\nQuestion 1 f:");
        System.out.println("1. Create a new node with the desired value.\n"
                         + "2. Check if the link List is empty or not.\n"
                         + "3. If it is empty, set both head and tail to the new node.\n"
                         + "4. If it is not empty, set the new node.\n"
                         + "5. Update the head reference to point to the new node.");
        
        System.out.println("\nAdd Last() - value of element c:");
        node.addLast('c');
        print(node);
        
        System.out.println("\nAdd(int index, E e)- 2,d: ");
        node.add(2,'d');
        print(node);
        
        System.out.println("\nremoveFirst(): ");
        System.out.println("The first character remove:"+ node.removeFirst());
        print(node);
        System.out.println("\nremoveLast(): ");
        System.out.println("The last character remove:"+ node.removeLast());
        print(node);
        System.out.println("\nremove(int index) – remove at index 1");
        System.out.println("The character remove: 1,"+node.remove(1));
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
   

    
     public static <E> void print(linkedList <E> list) {
        Node <E> current = list.head;
        while (current != null) {
            System.out.print(current.element + " -> ");
            current = current.next;
        }
        System.out.println("null");
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
  
}
