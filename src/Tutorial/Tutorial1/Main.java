
package Tutorial1;

public class Main {

    public static void main(String[] args) {
       
  
        // Instantiate 5 Telephone objects
        Telephone[] telephones = new Telephone[5];
        telephones[0] = new Telephone("03", "79676300");
        telephones[1] = new Telephone("03", "79676301");
        telephones[2] = new Telephone("03", "79676302");
        telephones[3] = new Telephone("03", "79676303");
        telephones[4] = new Telephone("03", "79676304");

        // Iterate through the array to print the full number
        for (Telephone telephone : telephones) {
            System.out.println(telephone.makeFullNumber());
        }
        
        
        Vehicle car = new Car(200); // Create an instance of Car with maxSpeed 200
        car.pedalToTheMetal(); // Accelerate the car until maxSpeed is reached
        System.out.println("Current speed: " + car.getCurrentSpeed());
        
        BankAccount account = new BankAccount(1000); // Create a BankAccount with initial balance 1000
        System.out.println("Initial balance: " + account.deposit(500)); // Deposit 500, new balance is returned
        System.out.println("Withdraw 700: " + account.withdraw(700)); // Withdraw 700, returns true
        System.out.println("Withdraw 1000: " + account.withdraw(1000)); // Withdraw 1000, returns false
        System.out.println("Current balance: " + account.deposit(200)); // Deposit 200, new balance is returned
    
    }
    
}
