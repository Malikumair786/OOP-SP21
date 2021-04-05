package com.company;

public class time {
    int hr,minutes,seconds;
    void time (){
        hr = 0;
        minutes = 0;
        seconds = 0;
    }
    void time(int hr,int minutes,int seconds){
        this.hr = hr;
        this.seconds = seconds;
        this.minutes = minutes;
    }
    void display(){
        System.out.println("The time is: "+hr+" : "+minutes+" : "+seconds);
    }
}
