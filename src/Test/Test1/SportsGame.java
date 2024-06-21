/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test1;

/**
 *
 * @author YiCi Kek
 */
 class SportsGame extends Event{
     
     protected String gameType;

    public SportsGame(String eventId, String eventName, String eventDate, String gameType) {
        super(eventId, eventName, eventDate);
        this.gameType=gameType;
    }

    @Override
    protected void displayEventDetails() {
        System.out.println("Sports Game - ID: " + eventId + ", Name: " + eventName + ", Date: " + eventDate + ", Type: " + gameType);

    }
    
}
