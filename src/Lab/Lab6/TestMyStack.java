package Lab6;

public class TestMyStack {
    public static void main(String[] args) {
        GenericStack <String> Stack = new GenericStack<>();
        Stack.push("a");
        System.out.println("(1) " + Stack);
        Stack.push("b");
        System.out.println("(1) " + Stack);
        Stack.push("c");
        System.out.println("(1) " + Stack);
        
        boolean search1 = Stack.search("b");
        boolean search2 = Stack.search("k");
        System.out.println("Element 'b' :"+ search1);
        System.out.println("Element 'k' :" + search2);
        
        GenericStack <Integer> Stack2 = new GenericStack<>();
        Stack2.push(1);
        Stack2.push(2);
        Stack2.push(3);
        System.out.println(Stack);
        System.out.println("Element 6 if found: "+ Stack2.search(6));
    }
}
