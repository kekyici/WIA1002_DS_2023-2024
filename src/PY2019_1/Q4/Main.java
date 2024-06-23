
package PY2019_1.Q4;

public class Main {


    public static void main(String[] args) {
        // TODO code application logic here
        MyHashMap myHashMap = new MyHashMap();
        
        myHashMap.put("BruceW", "011-8998990");
        myHashMap.put("DeanW", "017-2274000");
        myHashMap.put("TonyS", "019-4550800");
        myHashMap.put("LaraC", "014-6402009");
        
        Entry e1 = myHashMap.get("DeanW");
        System.out.println("Value: " + e1.getValue());
        Entry e2 = myHashMap.get("TonyS");
        System.out.println("Value: " + e2.getValue());
        
        myHashMap.put("BruceW", "011-5677900");
        Entry e3 = myHashMap.get("BruceW");
        System.out.println("Value: "+ e3.getValue());
        
        myHashMap.put("JeanG", "019-9001123");
        Entry e4 = myHashMap.get("JeanG");
        System.out.println("Value: "+ e4.getValue());
    }
    
}
