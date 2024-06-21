
package Lab2;

public class minmaxMain {
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};

        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
    
    public static <T extends Comparable<T>> String minmax(T[] array){
        T min = null;
        T max = null;
        for(int i =0; i<array.length;i++){
            min = array[i];
            max = array[i];
            for(int j =0; j<array.length;j++){
                if(array[j].compareTo(min)<0){
                   min=array[j];
                   
                }
                if(array[j].compareTo(max)>0){
                   max=array[j];
                    
                }
            }
        }
        return "Min = "+ min+" Max = "+ max;
    }
}
