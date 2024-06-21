
package Lab2;

public class CompareMax <T> {
    
    public CompareMax(){
    
    }

      public static <T extends Comparable<T>> T maximum (T t1, T t2, T t3){
      T max = t1;
          if(t2.compareTo(max)>0){
              max=t2;
          } 
          
          if(t3.compareTo(max)>0){
             max =t3;
          }
           
          return max;
      
      }
}
