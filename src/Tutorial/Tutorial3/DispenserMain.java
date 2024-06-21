/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tutorial3;

/**
 *
 * @author YiCi Kek
 */
public class DispenserMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Dispenser candiesDispenser = new Dispenser("Candies", 10);
        Dispenser chipsDispenser = new Dispenser("Chips", 10);
        Dispenser gumDispenser = new Dispenser("Gum", 10);
        Dispenser cookiesDispenser = new Dispenser("Cookies", 10);

        // Create cash register
        CashRegister cashRegister = new CashRegister();

        // Create candy machine
        CandyMachine candyMachine = new CandyMachine(candiesDispenser, chipsDispenser, gumDispenser, cookiesDispenser, cashRegister);

        // Display available products
        candyMachine.displayProducts();

        // Simulate a transaction
        int selectedProduct = 1; // Assuming the customer selects candies
        double itemCost = candyMachine.selectProduct(selectedProduct);

        // Process the transaction
        double amountPaid = 2.00; // Assuming the customer paid $2.00
        candyMachine.processTransaction(amountPaid, itemCost);
    }
    
}
