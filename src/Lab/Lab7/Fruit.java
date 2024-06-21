package Lab7;

public class Fruit {
    public static void main(String[] args) {
        MyQueue<String> queue1= new MyQueue<>();
        queue1.enqueue("Durian");
        queue1.enqueue("Blueberry");
        queue1.enqueue("Apple");
        queue1.enqueue("Orange");
        queue1.enqueue("Grapes");
        queue1.enqueue("Cherry");
        System.out.println(queue1);
        System.out.println(" The top item : "+ queue1.peek());
        queue1.dequeue();
        System.out.println(queue1);
        System.out.println(" Item in index position 2 : "+ queue1.getElement(2));
        System.out.println(" Consists Of Cherry : "+ queue1.contains("Cherry"));
        System.out.println(" Consists of Durian : "+ queue1.contains("Durian"));
        while(!queue1.isEmpty()){
            System.out.print(queue1.dequeue()+" ");
        }
    }
}
