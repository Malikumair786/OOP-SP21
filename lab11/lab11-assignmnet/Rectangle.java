package com.company;

public class Rectangle implements Shape{
    private double length;
    private double width;

    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double Area() {
        double area = length*width;
        return  area;
    }

}
