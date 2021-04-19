package com.company;

public class tape extends Publication{
    private double playingTime;                 //paying time is in minutes

    public tape(String title,int price,double playingTime){
        super(title,price);
        this.playingTime = playingTime;
    }

    public double getPlayingTime() { return playingTime; }

    public void setPlayingTime(double playingTime) { this.playingTime = playingTime; }

//    @Override
//    public String toString() {                  //we can use the display function if we want but
//        return super.toString()+                //the requirement in the question is to use display function
//                ", playingTime=" + playingTime;
//    }

    public void Display(){
        super.Display();
        System.out.println("\t\tPlaying time: "+playingTime);
    }
}
