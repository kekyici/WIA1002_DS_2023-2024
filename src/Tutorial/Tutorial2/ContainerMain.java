
package Tutorial2;

public class ContainerMain {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Container <Integer> con1 = new Container<>();
        Container <String> con2 = new Container<>();
        
        con1.setT(50);
        con2.setT("java");
        
        System.out.println("Retrieve value 1: "+con1.retrieve());
        System.out.println("Retrive String 2: "+ con2.retrieve());
    }
    
}
