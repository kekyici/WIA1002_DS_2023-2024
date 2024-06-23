/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PY2019_1.Q4;

/**
 *
 * @author YiCi Kek
 */
public class Entry {
    final String key;
    String value;
    
    public Entry(String key, String value){
        this.key=key;
        this.value=value;
    }
    
    public String setValue(String value){
        String oldValue = this.key;
        this.value=value;
        return oldValue;
    }
    
    public String getKey(){
        return this.key;
    }
    
    public String getValue(){
        return this.value;
    }
}
