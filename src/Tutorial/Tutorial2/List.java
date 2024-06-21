
package Tutorial2;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {
       ArrayList<Integer >numOfCars = new ArrayList<>();
       numOfCars.add(5);
       numOfCars.add(2);
       numOfCars.add(3);
       
       ArrayList<Double>milesPerHours = new ArrayList<>();
       milesPerHours.add(120.0);
       milesPerHours.add(130.0);
       milesPerHours.add(360.0);
       
       display(numOfCars);
       display(milesPerHours);
       
    }
    
    public static void display(ArrayList<?> list){
        System.out.println(list.toString());
    }
    
}
