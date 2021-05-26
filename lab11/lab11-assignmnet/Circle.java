package com.company;

public class Circle implements Shape{
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double Area() {
        return ((Math.PI)*(Math.pow(radius,2)));
    }
}
