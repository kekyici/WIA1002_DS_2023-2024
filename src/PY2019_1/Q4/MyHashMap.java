/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PY2019_1.Q4;

/**
 *
 * @author YiCi Kek
 */
public class MyHashMap <K,V>{
    int size;
    Entry[] table;
    
    public MyHashMap(){
        this(15);
    }
    public MyHashMap(int initialcapacity){
        this.table = new Entry[initialcapacity];
    }
    public Entry get(K key){
        for(int i=0;i<size;i++){
            if(table[i].key.equals(key)){
                return table[i];
            }
        }
        return null;
    
    }
    
    public void put(String key, String value){
        boolean found = false;
        for(int i=0;i<size;i++){
            if(table[i].key.compareTo(key)==0){
                table[i].value=value;
                found = true;
            }
        }
        if(found==false){
           table[size++] = new Entry(key,value);
        }
    }
}
