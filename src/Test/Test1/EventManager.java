/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YiCi Kek
 * @param <T>
 */
public class EventManager <T extends Event> {
    
    private List<T> events;

    public EventManager() {
        this.events = new ArrayList<>();
    }
    
    public void addEvent(T event) {
        events.add(event);
    }

    protected void displayEventDetails() {
        for (T event : events) {
            event.displayEventDetails();
            System.out.println();
        }
    }

}
