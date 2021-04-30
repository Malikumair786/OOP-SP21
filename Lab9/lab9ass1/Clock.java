package com.company;
import java.util.Calendar;
public class Clock {
    Calendar cal = Calendar.getInstance();          // we use the static calender class for displaying
    public void Display(){
        System.out.println("Current time is: "+cal.get(Calendar.HOUR)+" : "+cal.get(Calendar.MINUTE)+" : "
                +cal.get(Calendar.SECOND));
    }
}
