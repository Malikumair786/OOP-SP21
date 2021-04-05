package com.company;

public class circle {
    private double radius;
    public void circle(){
        radius = 1;
    }
    public void circle(int x){
        radius = x;
    }
    public void display(){
        System.out.println("The circumference of circle is "+2*Math.PI*radius);
    }
}