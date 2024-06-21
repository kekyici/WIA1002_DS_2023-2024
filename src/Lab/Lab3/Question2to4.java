
package Lab3;

public class Question2to4 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayBag<String> bag1 = new ArrayBag<>();
        bag1.add("a");
        bag1.add("b");
        bag1.add("c");

        ArrayBag<String> bag2 = new ArrayBag<>();
        bag2.add("b");
        bag2.add("b");
        bag2.add("d");
        bag2.add("e");

        BagInterface<String> everything = bag1.union(bag2);

       displayBag(everything);
       
       BagInterface<String> commonItems = bag1.intersection(bag2);
       
       displayBag(commonItems);
       
       BagInterface leftOver1 = bag1.difference(bag2);
       
       displayBag(leftOver1);
       
       BagInterface leftOver2 = bag2.difference(bag1);
       
       displayBag(leftOver2);
       
       
        
    }
    private static void displayBag(BagInterface<String> aBag){
            System.out.println("The bag contains " + aBag.getCurrentSize() +
                               " string(s), as follows:");		
            Object[] bagArray = aBag.toArray();
            for (int index = 0; index < bagArray.length; index++)
            {
                    System.out.print(bagArray[index] + " ");
            } // end for

            System.out.println();
    }
    
    private static void testAdd(BagInterface<String> aBag, String[] content){
        System.out.println("Adding");
        for(int i =0;i<content.length;i++){
            aBag.add(content[i]);
            System.out.println(content[i]+" ");
        }
        displayBag(aBag);
    
    }
}
