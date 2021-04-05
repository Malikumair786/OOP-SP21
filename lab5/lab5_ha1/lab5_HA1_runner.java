package com.company;

public class lab5_HA1_runner {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance(3,11);
        Distance d3 = d1.add(d2);
        d3.display();
    }
}
