
package Tutorial.Tutorial10;

public class InsertionSort {

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
    
    public static void insertionSort(int [] list){
        for(int i=1;i<list.length;i++){
            int k;
            int currentMin = list[i];
            
            for(k=i-1;k<=0&&list[k]>currentMin;k--){
                list[k+1]=list[k];
            }
            list[k+1]= currentMin;
        }
    }
    
}
