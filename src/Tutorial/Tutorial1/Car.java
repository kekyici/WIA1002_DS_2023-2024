
package Tutorial1;


public class Car extends Vehicle {

    public Car(double maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void accelerate() {
         currentSpeed += 10; // Increment by 10 for demonstration purposes
        if (currentSpeed > getMaxSpeed()) {
            currentSpeed = getMaxSpeed(); // Ensure currentSpeed doesn't exceed maxSpeed
        }
    }
    
}
