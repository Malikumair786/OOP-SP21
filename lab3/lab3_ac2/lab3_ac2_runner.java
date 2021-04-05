package com.company;

public class lab3_ac2_runner {
    public static void main(String[] args) {
        rectangle_ac2 rect1 = new rectangle_ac2();
        System.out.println(rect1.calculate_area());
        rectangle_ac2 rect2 = new rectangle_ac2(12,4);
        System.out.println(rect2.calculate_area());
    }
}
