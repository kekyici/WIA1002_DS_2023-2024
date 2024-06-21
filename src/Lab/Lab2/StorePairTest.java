package Lab2;
public class StorePairTest {
    public static void main(String[] args) {
    
        StorePair a = new StorePair(6, 4);
        StorePair b = new StorePair(2, 2);
        StorePair c = new StorePair(6, 3);

        // Display initial values
        System.out.println("Initial values:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        // Compare a and b
        int compareResultAB = a.compareTo(b);
        System.out.println("\nComparing a and b: " + compareResultAB);

        // Compare a and c
        int compareResultAC = a.compareTo(c);
        System.out.println("Comparing a and c: " + compareResultAC);

        // Compare b and c
        int compareResultBC = b.compareTo(c);
        System.out.println("Comparing b and c: " + compareResultBC);
    
         boolean equalsResultAB = a.equals(b);
        System.out.println("\nComparing a and b using equals(): " + equalsResultAB);

        // Compare a and c using equals()
        boolean equalsResultAC = a.equals(c);
        System.out.println("Comparing a and c using equals(): " + equalsResultAC);

        // Compare b and c using equals()
        boolean equalsResultBC = b.equals(c);
        System.out.println("Comparing b and c using equals(): " + equalsResultBC);
    }
}
