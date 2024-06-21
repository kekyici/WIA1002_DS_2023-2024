/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test3;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author YiCi Kek
 */
public class EntranceGateStack {
   
  private Stack<Integer> gateStack;
  private int capacity;

  public EntranceGateStack(int capacity){
        this.capacity = capacity;
        gateStack = new Stack<>();
  }

    public void assignGate(int gateNumber){
        if(isStackFull()){
            System.out.println("All gates are occupied");
        }
        gateStack.push(gateNumber);
        System.out.println("Gate "+gateNumber+" assigned");
    }

    public void releaseGate(){
        try{
            int releasedGate = gateStack.pop();
            System.out.println("Gate "+releasedGate+" released");
        }catch (EmptyStackException e){
            System.out.println("No gates are assigned");
        }
    }

    public int checkTopGate(){
        try{
            return gateStack.peek();
        }
        catch(EmptyStackException e){
            return -1;
        }
    }

    public boolean isStackEmpty(){
        return gateStack.isEmpty();
    }

    public boolean isStackFull(){
        return gateStack.size() == capacity;
    }

}
