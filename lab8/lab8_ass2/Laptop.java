package com.company;

public class Laptop extends Computer{
    private double length,width,height,weight;

    Laptop(){
        length = 15;
        width = 15;
        height = 15;
        weight = 1.5;
    }
    Laptop(int wordsize,int memorysize,int storagesize,int speed,double length,double width,double height,double weight){
        super(wordsize,memorysize,storagesize,speed);
        this.weight  = weight;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getLength() { return length; }

    public void setLength(double length) { this.length = length; }

    public double getWidth() { return width; }

    public void setWidth(double width) { this.width = width; }

    public double getHeight() { return height; }

    public void setHeight(double height) { this.height = height; }

    public double getWeight() { return weight; }

    public void setWeight(double weight) { this.weight = weight; }

    @Override
    public String toString() {
        return super.toString()+
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight;
    }
}