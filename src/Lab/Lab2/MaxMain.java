
package Lab2;

public class MaxMain {

    public static void main(String[] args) {
        // TODO code application logic here
        CompareMax max = new CompareMax();
        
        System.out.println("Maximum of 3, 4, 5 is: " + max.maximum(3, 4, 5));
        System.out.println("Maximum of 6.7, 8.9, 7.6 is: " + max.maximum(6.7, 8.9, 7.6));
        System.out.println("Maximum of 'apple', 'banana', 'orange' is: " + max.maximum("apple", "banana", "orange"));
   
        
    }
    
}
