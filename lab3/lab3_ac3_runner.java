package com.company;

public class lab3_ac3_runner {
    public static void main(String[] args) {
        point p1 = new point();
        p1.display();
        p1.movepoint(2,3);

        point p2 = new point(2,3);
        p2.display();
        p2.movepoint(2,3);
    }
}
