package com.company;

public class Point {
    private int x;
    private int y;
    public Point(){
        x = 0;
        y = 0;
    }
    public Point(int a,int b){
        x = a;
        y = b;
    }
    public void setX(int a){
        x = a;
    }
    public void sety(int b){
        y = b;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void display(){
        System.out.println("X coordinate is: "+x+"\ny coordinate is: "+y);
    }
    public void movepoint(int a,int b){
        x = x+a;
        y = y+b;
        System.out.println("X coordinate after moving: "+x +"\ny coordinate after moving: "+y);
    }
}
