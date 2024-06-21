
package Lab2;

public class StorePairGeneric <T> {
    private T first, second;
        public StorePairGeneric(T first, T second) {
            this.first = first;
            this.second = second;
        }
        public T getFirst() {
            return first;
        }
        public T getSecond() {
            return second;
        }
        public void setPair(T first, T second) {
            this.first = first;
            this.second = second;
        }
        
        @Override
        public boolean equals(Object obj){
           if (this == obj) return true; // Check if both references point to the same object
             if (obj == null || getClass() != obj.getClass()) return false;
            StorePairGeneric<?> otherPair = (StorePairGeneric<?>) obj; // Cast the passed object to StorePairGeneric
            return this.first.equals(otherPair.first); // Compare the first values of both objects
            
        }
        

        
        public String toString() {
            return "first = " + first + " second = " + second;
        }
}
