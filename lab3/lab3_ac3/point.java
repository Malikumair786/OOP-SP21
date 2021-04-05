package com.company;

public class point {
    private int x,y;
    public point(){
        x = 1;
        y = 2;
    }
    public point(int a,int b){
        x = a;
        y = b;
    }
    public void display(){
        System.out.println("x coordinate = "+x+"\ny coordinate = "+y);
    }
    public void setX(int a){
        x = a;
    }
    public void setY(int b){
        y = b;
    }
    public void movepoint(int a,int b){
        x = x+a;
        y = y+b;
        System.out.println("x coordinate after moving = "+x+"\ny coordinate after moving = "+y);
    }
}
