
package Lab3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayBag<T> implements BagInterface<T> {
   
    private T[] bag ;
    private boolean initialized = false;
    private static final int DEFAULT_CAPACITY =25;
    private int numberOfEntries;
    
    public ArrayBag(){
        this(DEFAULT_CAPACITY);
    }
    
    public ArrayBag(int desiredCapacity){
        if(desiredCapacity<=1000){
         @SuppressWarnings("unchecked")
         T[] tempBag = (T[])new Object[desiredCapacity]; // Unchecked cast
         bag = tempBag;
         numberOfEntries = 0;
         initialized = true;
      }
      else
         throw new IllegalStateException("Attempt to create a bag " +
                                         "whose capacity exceeds " +
                                         "allowed maximum.");
    }
    
    public int getCurrentSize(){
        return numberOfEntries;
    }
    public boolean isFull(){
        return numberOfEntries>= bag.length;
    }
    public boolean isEmpty(){
        return numberOfEntries == 0;
    }
    public boolean add(T newEntry){
        checkInitialization();
        boolean result = true;
        if(isFull()){
            result = false;
        }else{
            bag[numberOfEntries]= newEntry;
            numberOfEntries++;
        }
        return result;
    }
    public T remove(){
        checkInitialization();
        T result = removeEntry(numberOfEntries-1);
        return result;
        
    }
    public boolean remove(T anEntry){
        checkInitialization();
        int index = getIndexOf(anEntry);
        T result = removeEntry(index);
        return anEntry.equals(result);
        
    }
    
    private T removeEntry(int givenIndex){
        T result = null;
        if(!isEmpty() && (givenIndex>=0)){
            result = bag[givenIndex];
            int lastIndex = numberOfEntries -1;
            bag[givenIndex]=bag[lastIndex];
            bag[lastIndex]=null;
            numberOfEntries--;
        }
        return result;
    }
    
    private int getIndexOf(T anEntry){
        int where=-1;
        boolean found = false;
        int index=0;
        while(!found && (index<numberOfEntries)){
            if(anEntry.equals(bag[index])){
                found =true;
                where = index;
            }
            index++;
        }
        return where;
    }
    public void clear(){
        while (!isEmpty())
            remove();
	
    }
    public int getFrequencyOf(T anEntry){
        checkInitialization();
        int counter = 0;
        for (int index = 0; index < numberOfEntries; index++){
           if (anEntry.equals(bag[index])){
              counter++;
           } 
        }
        return counter;
    }
    
    public boolean contains(T anEntry){
        checkInitialization();
        return getIndexOf(anEntry) >-1; // or >= 0
    }
    
    public T[] toArray(){
        checkInitialization();
         // The cast is safe because the new array contains null entries.
        @SuppressWarnings("unchecked")
        T[] result = (T[])new Object[numberOfEntries]; // Unchecked cast

        for (int index = 0; index < numberOfEntries; index++) {
             result[index] = bag[index];
         } 
         return result;
    }
    
    @Override
    public BagInterface<T> union(BagInterface<T> anotherBag) {
        // Create a new bag with capacity equal to the sum of the sizes of both bags
        ArrayBag<T> unionBag = new ArrayBag<>(numberOfEntries + anotherBag.getCurrentSize());
        
        // Add elements from this bag to the union bag
        for (int i = 0; i < numberOfEntries; i++) {
            unionBag.add(bag[i]);
        }
        T[] bagArray = anotherBag.toArray();
        // Add elements from anotherBag to the union bag
        for (int i = 0; i < anotherBag.getCurrentSize(); i++) {
            unionBag.add(bagArray[i]);
        }

        return unionBag;
    }
    
    @Override
    public BagInterface<T> intersection(BagInterface<T> anotherBag){
       ArrayBag<T> commonItemsBag = new ArrayBag<>();

        // Get the arrays of items from both bags
        T[] bagArray1 = toArray();
        T[] bagArray2 = anotherBag.toArray();

        // Calculate frequencies for items in bagArray1
        Map<T, Integer> frequencies1 = new HashMap<>();
        for (T item : bagArray1) {
            frequencies1.put(item, frequencies1.getOrDefault(item, 0) + 1);
        }

        // Iterate over items in bagArray2 to find common items
        for (T item : bagArray2) {
            if (frequencies1.containsKey(item)) {
                // Add the common item to the commonItemsBag
                commonItemsBag.add(item);
                // Reduce frequency in frequencies1
                frequencies1.put(item, frequencies1.get(item) - 1);
                // Remove the item from frequencies1 if its frequency becomes 0
                if (frequencies1.get(item) == 0) {
                    frequencies1.remove(item);
                }
            }
        }

        return commonItemsBag;
    }
    
    public BagInterface<T> difference(BagInterface<T> anotherBag){
       ArrayBag<T> differenceBag = new ArrayBag<>();

        // Get arrays of items from both bags
        T[] bagArray1 = toArray();
        T[] bagArray2 = anotherBag.toArray();

        // Copy contents of bagArray1 to the difference bag initially
        differenceBag.bag = Arrays.copyOf(bagArray1, numberOfEntries);
        differenceBag.numberOfEntries = numberOfEntries;

        // Iterate over items in bagArray2
        for (T item : bagArray2) {
            // If the item is present in the difference bag, remove one occurrence of it
            if (differenceBag.contains(item)) {
                differenceBag.remove(item);
            }
        }

        return differenceBag;
    
    }
    private void checkInitialization(){
      if (!initialized)
         throw new SecurityException("ArrayBag object is not initialized properly.");
   } // end checkInitialization
}
