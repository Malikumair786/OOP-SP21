package com.company;

public class lab7_ha1Runner {
    public static void main(String[] args) {
        Address a1 = new Address(2,"NE-856","Rawalpindi","123456789");
        Person p = new Person("Umair","Saeed",a1);
        System.out.print("The record of the person is: ");
        p.Display();
    }
}
