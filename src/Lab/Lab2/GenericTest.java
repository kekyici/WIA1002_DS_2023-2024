
package Lab2;

public class GenericTest {
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyGeneric <String> strObj = new MyGeneric <>("Java");
        MyGeneric <Integer> intObj = new MyGeneric <>(50);
        
        System.out.println("The String : "+strObj.getE());
        System.out.println("The Integer : "+ intObj.getE());
        
       
    }
    
}
