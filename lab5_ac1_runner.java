package com.company;

public class lab5_ac1_runner {
    public static void main(String[] args) {
        ObjectPass p = new ObjectPass();
        p.value = 12;
        System.out.println("Before increment: "+p.value);
        ObjectPass.increment(p);
        System.out.println("After increment: "+p.value);
    }
}
