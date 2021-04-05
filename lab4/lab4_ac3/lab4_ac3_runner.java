package com.company;

public class lab4_ac3_runner {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(10);
        p1.sety(20);
        p1.display();

        Point p2 = new Point(10,11);
        p2.movepoint(2,3);
        p2.display();
    }
}