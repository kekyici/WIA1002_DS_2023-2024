/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test1;

/**
 *
 * @author YiCi Kek
 */
class Concert extends Event {
    protected String bandName ;

    public Concert(String eventId, String eventName, String eventDate, String bandName) {
        super(eventId, eventName, eventDate);
        this.bandName= bandName;
    }

    @Override
    protected void displayEventDetails() {
       System.out.println("Concert - ID: " + eventId + ", Name: " + eventName + ", Date: " + eventDate + ", Band: " + bandName);
        

        
    }
    
}
