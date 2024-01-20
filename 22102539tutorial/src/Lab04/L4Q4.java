/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab04;
import java.util.Scanner;
/**
 *
 * @author YiCi Kek
 */
public class L4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*4. Write a program that ask user to enter the year and the first day of the year (0 for
        Sunday, 1 for Monday, … , 6 for Saturday). Display the calendar for May and
        August*/
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the year: ");
        int year = scn.nextInt();
        System.out.print("Enter the First day of the year: ");
        int fday = scn.nextInt();
//        System.out.print("Enter the Month of the year: ");
//        int m = scn.nextInt();
        
        int i = 0,j,k=0,m=1,day=0;
        int tday =0, mday = 0;
        
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Days in each month
        int[] daysInMonth = {0, 31, isLeapYear ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayMonth = {"Invalid","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
        
        for (m=0;m<5;m++){
            day = daysInMonth[m];
            tday = day+tday;}
            mday = tday%7;
        if (m==5){
            String month = dayMonth[m];
            System.out.println(month);
            System.out.println("Sun\tMon\tTue\tWed\tThur\tFri\tSat");
            int daysInCurrentMonth = daysInMonth[m];
            for(j=1;j<daysInCurrentMonth;){
                for (i = 0; i < 7 && j<=daysInCurrentMonth ;i++,j++) {
                    while (k<mday) {
                        System.out.print("\t");
                        k++;
                        i++;}
                    System.out.print(j + "\t");}
                    System.out.println("");
                }
            System.out.println("");
                }
        for (m=0;m<8;m++){
            day = daysInMonth[m];
            tday = day+tday;}
            mday = tday%7;
        if (m==8){
            String month = dayMonth[m];
            System.out.println(month);
            System.out.println("Sun\tMon\tTue\tWed\tThur\tFri\tSat");
            int daysInCurrentMonth = daysInMonth[m];
            for(j=1;j<daysInCurrentMonth;){
                for (i = 0; i < 7 && j<=daysInCurrentMonth ;i++,j++) {
                    while (k<mday) {
                        System.out.print("\t");
                        k++;
                        i++;}
                    System.out.print(j + "\t");}
                    System.out.println("");
                }
            System.out.println("");
                }

        }

//        
//        while ( m <= 12 ) {
//            String month = dayMonth[m];
//            System.out.println(month);
//            System.out.println("Sun\tMon\tTue\tWed\tThur\tFri\tSat");
//            int daysInCurrentMonth = daysInMonth[m];
//            for(j=1;j<daysInCurrentMonth;){
//                for (i = 0; i < 7 && j<=daysInCurrentMonth ;i++,j++) {
//                    while (day < fday && fday<7) {
//                        System.out.print("\t");
//                        day++;
//                        i++;}
//                    System.out.print(j + "\t");}
//                    System.out.println("");
//                }
//            System.out.println("");
//            
//            fday = i;
//            day=0 ;
//            m++;
            
            
            
            
//            System.out.print("Enter the Month of the year [Enter negetive to quit]: ");
//            m = scn.nextInt();
            
//        if (year%4==0){
//            
//            for(i=0;i<12;i++){
//            if (i==2){
//                for(j=1;j<29;){
//                        for(k=0;k<7;k++,j++){
//                           System.out.print(j+"\t");}
//                        System.out.println("");}}
//            else if (i==1){
//                for(j=1;j<31;){
//                    for(k=0;k<7;k++){
//                       System.out.print(j+"\t");}
//                    System.out.println("");}}
//                }}
//        else{
//            for(i=0;i<12;i++){
//            if (i==2){
//                for(j=1;j<28;){
//                        for(k=0;k<7;k++,j++){
//                           System.out.print(j+"\t");}
//                        System.out.println("");}}}}
    

   
    
}

