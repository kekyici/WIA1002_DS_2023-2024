
package Lab2;

public class StorePair implements Comparable<StorePair>{
    private int first, second;
    public StorePair(int first, int second) {
        this.first = first;
        this.second = second;
    }
    public int getFirst() {
        return first;
    }
    public int getSecond() {
         return second;
    }
    public void setPair(int first, int second) {
        this.first = first;
        this.second = second;
    }
    @Override
     public int compareTo(StorePair otherPair) {
        // Compare the first values of the two objects
        return Integer.compare(this.first, otherPair.getFirst());
    }
    
    public String toString() {
        return "first = " + first + " second = " + second;
    }
}

