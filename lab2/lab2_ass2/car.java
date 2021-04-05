package com.company;

public class car {
    public double speed;
    public double distance;
    public int AC;
    public int gear;
    public void display_time(){
        System.out.println("You can reach the destination in " + ((distance*1000)/speed)/60+" minutes");
    }
    public void display_gear(){
        System.out.println("The car is in "+gear+" gear");
    }
    public void display_AC(){
        System.out.println("Speed of AC is "+ AC);
    }


}
