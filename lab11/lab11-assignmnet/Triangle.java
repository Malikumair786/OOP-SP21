package com.company;

public class Triangle implements Shape{
    private double base;
    private double height;
    Triangle (double base,double height){
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double Area() {
        return ((base*height)/2);
    }

}
