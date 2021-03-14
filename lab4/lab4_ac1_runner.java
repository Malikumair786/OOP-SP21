package com.company;

public class lab4_ac1_runner {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.setRadius(5);
        c1.displayradius();
        c1.calculateCircumference();
        int r = c1.getradius();
        circle c2 = new circle();
        c2.setRadius(5);
        c2.calculateCircumference();
    }

}
