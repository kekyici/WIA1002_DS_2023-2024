/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test3;
      import java.util.Scanner;
/**
 *
 * @author YiCi Kek
 */
public class Main {



  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Choose functionality to test:");
    System.out.println("1. Entrance Gate Management");
    System.out.println("2. Ride Waiting Line Management\n");
    System.out.println("Choice: ");
    int choice = scanner.nextInt();

    if (choice == 1) {
        testEntranceGateStack();
    } else if (choice == 2) {
        testRideWaitingQueue();
    } else {
        System.out.println("Invalid choice.");
    }

    scanner.close();
    
  }

    private static void testEntranceGateStack() {
        System.out.println("Testing EntranceGateStack:");
        EntranceGateStack gateStack = new EntranceGateStack(3); 
        gateStack.assignGate(1);
        gateStack.assignGate(2);
        gateStack.assignGate(3);
        gateStack.assignGate(4); 
        gateStack.releaseGate();
        gateStack.releaseGate();
        gateStack.releaseGate();
        gateStack.releaseGate(); 
        System.out.println();
          // Check for empty/full conditions
            System.out.println("Is gate stack empty? " + gateStack.isStackEmpty());

    }

    private static void testRideWaitingQueue() {
        System.out.println("Testing RideWaitingQueue:");
        RideWaitingQueue waitingQueue = new RideWaitingQueue(5); 
        waitingQueue.joinWaitingLine(1);
        waitingQueue.joinWaitingLine(2);
        waitingQueue.joinWaitingLine(3);
        waitingQueue.joinWaitingLine(4);
        waitingQueue.joinWaitingLine(5);
        waitingQueue.joinWaitingLine(6); 
        waitingQueue.completeRide();
        waitingQueue.completeRide();
        waitingQueue.completeRide();
        waitingQueue.completeRide();
        waitingQueue.completeRide();
        waitingQueue.completeRide(); 
        System.out.println("Is queue full? " + waitingQueue.isQueueFull());
    }
}
    
    

