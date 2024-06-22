
package Tutorial.Tutorial10;


public class BinarySearch {

    public static void main(String[] args) {
         int[] list = {-3, 1, 2, 4, 9, 23};
         System.out.println(binarySearch(list, 2));
    }
    
    public static int binarySearch(int[] list , int num){
        int low = 0;
        int high = list.length;
        
        while(high>=low){
            int mid = (high+low)/2;
            if(num<list[mid]){
                high = mid-1;
            }else if(num==list[mid]){
                return mid;
            }else{
                low = mid+1;
            }
            
        }
        return -1;
    }
    
}
