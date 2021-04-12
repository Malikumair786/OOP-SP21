package com.company;

public class Point {
    private double x_cord;
    private double y_cord;

    public Point(){
        x_cord = 1;
        y_cord = 1;
    }
    public Point(double x_cord,double y_cord){
        this.y_cord = y_cord;
        this.x_cord = x_cord;
    }

    public double getX_cord() { return x_cord; }

    public void setX_cord(int x_cord) { this.x_cord = x_cord; }

    public double getY_cord() { return y_cord; }

    public void setY_cord(int y_cord) { this.y_cord = y_cord; }

    public void Display(){
        System.out.println("X cordinate: "+x_cord+"Y coordinate: "+y_cord);
    }
}
