/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test3;

import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * @author YiCi Kek
 */
public class RideWaitingQueue {
    private Queue<Integer> waitingQueue;
    private int capacity;

    public RideWaitingQueue(int capacity){
        this.capacity = capacity;
        waitingQueue = new LinkedList<>();
    }

    public void joinWaitingLine(int ticketNumber){
        if(isQueueFull()){
            System.out.println("Waiting line is at maximum capacity");
            return;
        }
        waitingQueue.offer(ticketNumber);
        System.out.println("Visitor with ticket number: "+ticketNumber+" joined the waiting line");
    }

    public void completeRide(){
        try{
            int completedTicket = waitingQueue.poll();
            System.out.println(completedTicket+" completed the ride");
        }
        catch(NullPointerException e){
            System.out.println("No visitors in the waiting line");
        }
    }

    public int viewTicketNumber(){
        try{
            return waitingQueue.peek();
        }
        catch(NullPointerException e){
            return -1;
        }
    }

    public boolean isQueueEmpty(){
        return waitingQueue.isEmpty();
    }

    public boolean isQueueFull(){
        return waitingQueue.size() == capacity;
    }
}
