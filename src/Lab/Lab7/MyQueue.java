package Lab7;
import java.util.LinkedList;

public class MyQueue <E>{
    LinkedList<E> list = new LinkedList<>();
    public MyQueue(E[] e){

    }
    public MyQueue(){

    }
    public void enqueue(E e){
        list.addLast(e);
    }
    public E dequeue(){
        return list.removeFirst();
    }
    public E getElement(int i){
        return list.get(i);
    }
    public E peek(){
        return list.getFirst();
    }
    public int getSize(){
        return list.size();
    }
    public boolean contains(E e){
        return list.contains(e);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    @Override
    public String toString(){
        return "Queue: " + list.toString();
    }
}
