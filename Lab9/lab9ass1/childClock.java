package com.company;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class childClock extends Clock {
    DateFormat dateFormatAM_PM = new SimpleDateFormat("hh:mm:ss aa");       //now we use the DateFormat class
    DateFormat dateFormat24hr = new SimpleDateFormat("HH:mm:ss ");          //this HH is use for 24 hour format

    String dateString1 = dateFormatAM_PM.format(new Date());
    String dateString2 = dateFormat24hr.format(new Date());


    @Override
    public void Display() {
        System.out.println("Current time in AM/PM: " + dateString1);
        System.out.println("Current time in 24 hour format: "+dateString2);
    }
}