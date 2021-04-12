package com.company;

public class lab7_ac2_runner {
    public static void main(String[] args) {
        Date b = new Date(1,12,1990);
        Date h = new Date(6,5,2016);
        employee e1 = new employee("AAA","BBBB",b,h);
        e1.display();
    }
}
