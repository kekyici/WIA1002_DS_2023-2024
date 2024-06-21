/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test1;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author YiCi Kek
 */
public class EventManagementSystem  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i =0;
        EventManager  eventManager = new EventManager();
        ArrayList<String> split= new ArrayList<>();
        try{
        Scanner in = new Scanner(new FileInputStream("events.txt"));
            
            while(in.hasNextLine()&& i<3){
               String line = in.nextLine();
               String[] parts = line.split(",");
               if (parts.length >= 5) {
                    String eventType = parts[0];
                    String eventId = parts[1];
                    String eventName = parts[2];
                    String eventDate = parts[3];
                    String extraInfo = parts[4];
                    switch (eventType) {
                        case "Concert":
                            eventManager.addEvent(new Concert(eventId, eventName, eventDate, extraInfo));
                            break;
                        case "Workshop":
                            String topic = parts[4];
                            String instructor = parts[5];
                            eventManager.addEvent(new Workshop(eventId, eventName, eventDate, topic, instructor));
                            break;
                        case "SportsGame":
                            eventManager.addEvent(new SportsGame(eventId, eventName, eventDate, extraInfo));
                            break;
                        default:
                            System.out.println("Invalid event type: " + eventType);
                    }
                } 
            
            }in.close();
            
        }catch(FileNotFoundException e){
        System.out.println("File was not found");
        }
        eventManager.displayEventDetails();
       
    }
    
}
