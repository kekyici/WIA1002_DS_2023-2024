
package Lab2;

public class MinMaxTwoDArray {
     public static void main(String[] args) {
         Integer[][] numbers = new Integer [2][3];
        for (int j = 0; j < 3; j++) {
                numbers[0][j] = j + 1;
                numbers[1][j] = j + 4;
            }
         System.out.println("The minimum numbers:"+ min(numbers));
         System.out.println("The minimum numbers:"+ max(numbers));
     }
     
     public static <E extends Comparable<E>> E min(E[][] list){
         E min=null;
         min=list[0][0];
         for(int i =0;i<list.length;i++){ 
            for(int j =0;j<list[i].length;j++){
                if(list[i][j].compareTo(min)<0){
                    min=list[i][j];
                }
            }
        }
         return min;
     }
     
     public static <E extends Comparable<E>> E max(E[][] list){
         E max = null;
          max=list[0][0];
          for(int i =0;i<list.length;i++){ 
            for(int j =0;j<list[i].length;j++){
                if(list[i][j].compareTo(max)>0){
                    max=list[i][j];
                }
            }
        }
         return max;
         
     
     }

}
