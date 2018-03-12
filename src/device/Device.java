/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package device;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author 92016648
 */
public class Device {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          GregorianCalendar gregorianCalendar = new GregorianCalendar();    // default GregorianCalendar using the current time in the default time zone .
        int dayOfTheYear =  gregorianCalendar.get(Calendar.DAY_OF_YEAR);  //variable set integer value of the day of the year
        int month = gregorianCalendar.get(Calendar.MONTH);                //variable set to hold the integer value of current month
        int currentYear = gregorianCalendar.get(Calendar.YEAR);                  //variable  hold the integer value of current year
        int dayOfMonth =  gregorianCalendar.get(Calendar.DAY_OF_MONTH);   //variable set to hold the integer value of day of the current month
        int hourOfDay = gregorianCalendar.get(Calendar.HOUR_OF_DAY);      //variable set to hold the integer value of the hour of the current date 
        int minute = gregorianCalendar.get(Calendar.MINUTE);              //variable set to hold the integer value of minute passed in an hour.
       
        
         DisplayMonth(month, currentYear, dayOfMonth);             //The methoad is used to dispaly current date 
         Message(hourOfDay);                                // The method  is used to display message if it is morning, noon or evening as per the current time
         Time(minute, hourOfDay);                           // The method displays current time and hour of the days; 
         RemainingDays(dayOfTheYear, currentYear);                 // The method displays the number of days remaining in the current year
     
    }

    private static void DisplayMonth(int month, int currentYear, int dayOfMonth) {
          switch (month){   
            
            case 0: 
                System.out.print ("January");       // if month is 0, display January
                break ;
                
            case 1: 
                System.out.print ("February");      // if month is 1, display February
                break;
                
            case 2: 
                System.out.print ("March");        // if month is 2, display March 
                break;
                
            case 3: 
                System.out.print ("April");         // if month is 3, display April
                break;
                
            case 4: 
                System.out.print ("May");           // if month is 4, display May
                break;
            case 5: 
                System.out.print ("June");          // if month is 5, display June
                break;
            case 6: 
                System.out.print ("July");          // if month is 6, display July
                break; 
            case 7:
                System.out.print ("August");        // if month is 7, display August
                break;
            case 8:  
                System.out.print ("September");     // if month is 8, display September
                    break;  
            case 9: 
                System.out.print ("October");       // if month is 9, display October
                break;
                
            case 10: 
                System.out.print ("November");      // if month is 10, display November
                break;
                
            case 11:  
                System.out.print ("December");      // if month is 11, display December
                break;         
        }
        
        System.out.print(" "+dayOfMonth + " " + currentYear +  "\n"); //  it will dasplay date 
        
      
    }

    private static void Message(int hourOfDay) {
           final int timeOfAFTERNOON = 12;  // set constant value for afternoon
        final int timeOfEVENING = 17;  // set constant value for evening
        
        if (hourOfDay < timeOfAFTERNOON){
            
            System.out.println("  \nGood Morning  \n");     // Display message if current time is morning
            
        }else if (hourOfDay < timeOfEVENING){
            
            System.out.println(" \nGood Afternoon \n ");    // Display message if current time is afternoon
            
        }else {
            
            System.out.println(" \nGood Evening \n");       // Display message if current time is evening
        }
       
    }

    private static void Time(int minute, int hourOfDay) {
         System.out.print("It's ");
                       
            if (minute != 0 ){
                System.out.print( " " + minute + " ");
                System.out.print((minute != 1)? "minutes" : minute);
                System.out.print (" past ");
            }
            
            System.out.print((hourOfDay > 12) ? (hourOfDay -12) : hourOfDay);
            System.out.print(" O' clock \n \n"); 
        
    }

    private static void RemainingDays(int dayOfTheYear, int currentYear) {
          GregorianCalendar gregorianCalendar1 = new GregorianCalendar(currentYear,11,31);    // create an instance of calendar based on the parameters .       
         int dayOfTheYear1 = gregorianCalendar1.get(Calendar.DAY_OF_YEAR);            // get the day of the year
            
         int remainingDays = dayOfTheYear1 - dayOfTheYear;             // calculate remaining days in the year
            
         System.out.println( remainingDays + " days remained in the current year \n"); // Display the result
       
    }
}
    

