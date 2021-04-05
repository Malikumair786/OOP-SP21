package com.company;

public class Point {
    int x;
    int y;
    public Point(){
        x = 5;
        y = 6;
    }
    public Point(int a,int b){
        x = a;
        y = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int a) {
         x = a;
    }

    public int getY() {
        return y;
    }

    public void setY(int b) {
        y = b;
    }
    public Point add(Point pa,Point pb){
        Point p_new = new Point(x+pa.x+pb.x,y+pa.y+pb.y);
        return p_new;
    }
    public void display(){
        System.out.println(x);
        System.out.println(y);
    }
}
