package com.company;

public class lab6_ac3_runner {
    public static void main(String[] args) {
        ABC a1 = new ABC();
        a1.i = 23;
        a1.s = "My name";
        a1.DisplayStatic();         //by using reference
        a1.nonStatic();             //It is only acces by using the reference variable
        ABC.DisplayStatic();        //also access this method by using the class name bcz of static method
//        ABC.nonStatic();            //give an error bcz we cannot access the non static method without reference.

    }
}
