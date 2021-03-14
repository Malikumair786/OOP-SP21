package com.company;

public class lab4_ac2_runner {
    public static void main(String[] args) {
        rectangle rect1 = new rectangle();
        rect1.setLength(5);
        rect1.setWidth(10);
        System.out.println("Area of rectangle is "+rect1.area());
        System.out.println("Width of rectangle is "+rect1.getWidth());
    }
}
