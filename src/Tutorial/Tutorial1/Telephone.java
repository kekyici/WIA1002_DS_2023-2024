/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial1;

/**
 *
 * @author YiCi Kek
 */
public class Telephone {
    protected String areaCode;
    protected String number;
    static String numberOfTelephoneObject;
    
    public Telephone( String areaCode, String number){
        setAreaCode(areaCode);
        setNumber(number);
    }
    
    public void setAreaCode (String areaCode){
        this.areaCode=areaCode;
    }
    
     public void setNumber (String number){
        this.number = number;
    }
     
    public String getAreaCode(){
        return areaCode;
    }
    
    public String getNumber(){
        return number;
    }
    
    public String makeFullNumber(){
        return areaCode + "-" + number;
    }
    
    
    
}
