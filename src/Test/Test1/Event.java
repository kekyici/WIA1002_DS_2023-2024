/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test1;

/**
 *
 * @author YiCi Kek
 */
public abstract class Event {
    protected String eventId;
    protected String eventName;
    protected String eventDate;
    
    public Event(String eventId, String eventName, String eventDate) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    protected abstract void displayEventDetails();
}
    
