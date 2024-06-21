
package Tutorial2;

public class Container <T> {
    private T t;
    public void setT(T t){
        this.t=t;
    }
     public T retrieve() {
        return t;
    }
    
}
