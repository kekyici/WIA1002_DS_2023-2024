
package Lab3;

public class ArrayBagDemo {


    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayBag<String> Bag1= new ArrayBag<>();
        ArrayBag<String> Bag2 = new ArrayBag<>();
        
        String[] contentsOfBag1={"A","A","B","A","C","A"};
        String[] contentsOfBag2={"A","B","A","C","B","C","D","another String"};
        
        testAdd(Bag1, contentsOfBag1);
        testAdd(Bag2, contentsOfBag2);
        
        BagInterface<String> Bag3 = Bag1.union(Bag2);
        displayBag(Bag3);
        
        BagInterface<String> Bag4 = Bag1.intersection(Bag2);
        displayBag(Bag4) ;
        
        BagInterface<String> Bag5 = Bag1.difference(Bag2);
        displayBag(Bag5);
        
        
        
        
    
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
            System.out.println("");
    }
     private static void testAdd(BagInterface<String> aBag, String[] content){
        System.out.println("Adding");
        for(int i =0;i<content.length;i++){
            aBag.add(content[i]);
            System.out.print(content[i]+" ");
        }
        displayBag(aBag);
        
    
    }
    
}
