
package Lab2;

public class Circle <E extends Comparable<E>> {
    
    private E radius;
    
    public Circle(E e){
         this.radius = e;
    }

    // Getter for radius
    public E getRadius() {
        return radius;
    }

}
