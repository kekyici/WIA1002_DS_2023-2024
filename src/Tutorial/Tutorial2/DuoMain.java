
package Tutorial2;

public class DuoMain {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Duo<Integer, String> duo = new Duo<>(10,"Java");
        System.out.println("Type A : "+duo.getA());
        System.out.println("Type B : "+ duo.getB());
        System.out.println("");
        
        Duo<String,Integer> sideShape = new Duo<>(" Height",50);
        System.out.println("Side Shape : "+sideShape.getA());
        System.out.println("Length : "+sideShape.getB());
        System.out.println("");
        
        Duo<Double, Double> point = new Duo<>(7.0,9.0);
        System.out.println("Coordinate-X : "+point.getA());
        System.out.println("Corrdinate-Y : "+point.getB());
        System.out.println("");
        
        
        
    }
    
}
