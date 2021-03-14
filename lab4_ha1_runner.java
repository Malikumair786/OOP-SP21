package com.company;

public class lab4_ha1_runner {
    public static void main(String[] args) {
        marks m1 = new marks();
        m1.setMarks1(10);
        m1.setMarks2(20);
        m1.setMarks3(70);
        m1.display();

        marks m2 = new marks(12,13,67);
        m2.display();

    }
}
