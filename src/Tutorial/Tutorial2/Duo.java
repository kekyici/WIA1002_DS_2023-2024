
package Tutorial2;

public class Duo <A,B>{
    A typeA;
    B typeB;
    
    public Duo(A typeA, B typeB){
        
        this.typeA=typeA;
        this.typeB=typeB;
        
    }
    
    public A getA(){
        return typeA;
    }
    
    public B getB(){
        return typeB;
    }
    
}
