
package Tutorial2;

public class MyArray {
      public static void main(String[] args) {
          Integer[] numbers = {1,2,3,4,5};
          String[] names = {"Jane","Tom","Bob"};
          Character[] alpha = {'a','b','c'};
          
          System.out.print("Numbers: ");
          listAll(numbers);
          System.out.print("Name: ");
          listAll(names);
          System.out.print("Alphabet:");
          listAll(alpha);
      }
      static <E> void listAll(E[] list) {
        for (E item : list) {
            System.out.print(item+" ");
        }
          System.out.println("");
    }
}
