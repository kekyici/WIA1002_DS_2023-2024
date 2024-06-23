
package PY2019_1.Q3;

public class LinkedList {
    
    Node head,tail;
    int max;
    int size;
    
    public class Node{
        String element;
        int cHour;
        Node next;
        
        public Node(String element, int cHour){
            this.element=element;
            this.cHour=cHour;
        
        }
        public Node(String element,int cHour, Node next){
            this.element=element;
            this.cHour=cHour;
            this.next=next;
        }
        
    }
    
    public LinkedList(){
        this(25);
        
    }
    public LinkedList(int max){
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
    
    public void add(String e, int cHour){
        if(!isFull()){
            Node newNode = new Node(e,cHour,head);
            if(tail==null)
                tail=newNode;
            head = newNode;
            size++;
        }
    }
    
    public void addAfter(String key, String e,int cHour){
        if(!isFull()){
            Node track = head;
            while(track!=null){
                if(track.element.compareTo(key)==0){
                    Node newNode = new Node(e,cHour,track.next);
                    track.next=newNode;
                    System.out.println("Adding "+ e+" after "+ key);
                    size++;
                    break;
                }
               
                track=track.next;
            } 
            if(track==null)
                System.out.println("No Match found "+key);
        }
    }
    
    public void remove(String e, int cHour){
        if(isEmpty()){
            System.out.println("The List is empty");
        }
        else{
            Node track = head;
            while(track!=null){
                if(track.next.element.compareTo(e)==0){
                    Node current = track.next;
                    track.next=current.next;
                    size--;
                    System.out.println("\nRemoving "+current.element+"..");
                    break;
                }
                track=track.next;
            }
            if (track==null)
                System.out.println("Not Found");
        }
    }
    
    public void display(){
        Node current ;
        System.out.println("\nDisplaying the Linked List ---------------------------\n");
        for(current=head;current!=null;current=current.next){
            System.out.println(current.element+": "+current.cHour+" hours");
        }
    }
    
    public void totalCreditHours(){
        Node current ;
        int totalcHour =0;
        for(current=head;current!=null;current=current.next){
            totalcHour+=current.cHour;
        }
        System.out.println("\nTotal credit Hours: "+ totalcHour+"\n");
    }
    
}
