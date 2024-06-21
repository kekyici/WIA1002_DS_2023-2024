
package Lab2;

public class FindMax <E> {
    
    public static void main(String[] args) {
        
        Integer[] intArray = {1,2,3};
        String[] strArray = {"red", "blue", "orange"};
        Double[] radius = {3.0,2.9,5.9};
        
        System.out.println("Integer max: "+max(intArray));
        System.out.println("String max: "+ max(strArray));
        System.out.println("Circle radius max: "+ max(radius));
    }
    public static <E extends Comparable<E>> E max(E[] list){
        E max =null;
        
        for(int i =0;i<list.length;i++){ 
            max=list[i];
            for(int j =0;j<list.length;j++){
                if(list[j].compareTo(max)>0){
                    max=list[j];
                }
            }
        }

        return max;
    }
}
