/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial3;

/**
 *
 * @author YiCi Kek
 */
public class CashRegister {
     private double totalSales;

    public CashRegister() {
        totalSales = 0.0;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void processPayment(double amount) {
        totalSales += amount;
    }

    public double calculateChange(double amountPaid, double itemCost) {
        return amountPaid - itemCost;
    }

    public void recordSale(double itemCost) {
        totalSales += itemCost;
    }
}
