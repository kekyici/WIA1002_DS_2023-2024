/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test1;

/**
 *
 * @author YiCi Kek
 */
 class Workshop extends Event{
     protected String topic;
     protected String instructor;

    public Workshop(String eventId, String eventName, String eventDate, String topic, String instructor) {
        super(eventId, eventName, eventDate);
        this.instructor= instructor;
        this.topic= topic;
    }

    @Override
    protected void displayEventDetails() {
        System.out.println("Workshop - ID: " + eventId + ", Name: " + eventName + ", Date: " + eventDate + ", Topic: " + topic + ", Instructor: " + instructor);

    }
    
}
