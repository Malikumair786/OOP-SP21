package com.company;

public class distance {
    public int feet,inches;
    public distance(){
        feet = 1;
        inches = 0;
    }
    public distance(int x,int y){
        feet = x;
        inches = y;
    }
    public void display(){
        int dis = feet+inches;
        System.out.println(feet+" feet and "+inches+" inches = "+(dis*0.0003048));
    }
}
