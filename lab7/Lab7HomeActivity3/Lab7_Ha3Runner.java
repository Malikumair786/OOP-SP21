package com.company;

public class Lab7_Ha3Runner {
    public static void main(String[] args) {
        Point p1 = new Point(2,4);
        Line l1 = new Line(4,8,p1);
        System.out.println("The length of the line is: "+l1.Calculate());

        Point p2 = new Point(3,6);
        Line l2 = new Line(8,16,p2);
        System.out.println("The length of the line is "+l2.Calculate());

    }
}
