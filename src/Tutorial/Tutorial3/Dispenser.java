/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial3;

/**
 *
 * @author YiCi Kek
 */
public class Dispenser {
    
    private String itemName;
    private int itemCount;
    
    public Dispenser(String itemName, int itemCount){
        this.itemName= itemName;
        this.itemCount= itemCount;
    }
    
    public String getItemName(){
        return itemName;
    }
    
    public int getItemCount(){
        return itemCount;
    }
    
    public boolean dispenseItem() {
        if (itemCount > 0) {
            itemCount--;
            return true; // Item dispensed successfully
        } else {
            return false; // No items left to dispense
        }
    }

}
