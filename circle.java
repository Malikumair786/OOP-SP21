package com.company;

public class circle {
    private int radius;
    public circle(){
        radius = 7;
    }
    public circle(int r){
        radius = r;
    }
    public void setRadius(int r){
        radius = r;
    }
    public int getradius(){
        return radius;
    }
    public void displayradius(){
        System.out.println("Radius: "+radius);
    }
    public void calculateCircumference(){
        double a = Math.PI*Math.pow(radius,2);
        System.out.println("circumference = "+a);
    }
}
