/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tutorial3;

/**
 *
 * @author YiCi Kek
 */
public class CandyMachine {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
         private Dispenser candiesDispenser;
    private Dispenser chipsDispenser;
    private Dispenser gumDispenser;
    private Dispenser cookiesDispenser;
    private CashRegister cashRegister;

    public CandyMachine(Dispenser candiesDispenser, Dispenser chipsDispenser, Dispenser gumDispenser, Dispenser cookiesDispenser, CashRegister cashRegister) {
        this.candiesDispenser = candiesDispenser;
        this.chipsDispenser = chipsDispenser;
        this.gumDispenser = gumDispenser;
        this.cookiesDispenser = cookiesDispenser;
        this.cashRegister = cashRegister;
    }

    public void displayProducts() {
        System.out.println("Available Products:");
        System.out.println("1. Candies");
        System.out.println("2. Chips");
        System.out.println("3. Gum");
        System.out.println("4. Cookies");
    }

    public double selectProduct(int productNumber) {
        double cost = 0.0;
        switch (productNumber) {
            case 1:
                cost = candiesDispenser.getItemCount() > 0 ? 1.00 : 0.0;
                break;
            case 2:
                cost = chipsDispenser.getItemCount() > 0 ? 1.50 : 0.0;
                break;
            case 3:
                cost = gumDispenser.getItemCount() > 0 ? 0.75 : 0.0;
                break;
            case 4:
                cost = cookiesDispenser.getItemCount() > 0 ? 2.00 : 0.0;
                break;
        }
        return cost;
    }

    public void processTransaction(double amountPaid, double itemCost) {
        cashRegister.processPayment(amountPaid);
        cashRegister.recordSale(itemCost);
        double change = cashRegister.calculateChange(amountPaid, itemCost);
        if (change < 0) {
            System.out.println("Insufficient payment. Transaction cancelled.");
        } else {
            System.out.println("Transaction successful. Change: $" + change);
        }
    }
    
    
}
