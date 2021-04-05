package com.company;

public class lab6_ac1_runner {
    public static void main(String[] args) {
        staticPractice s1 = new staticPractice();
        s1.x = 45;
        s1.y = "My name is Umair";
        staticPractice s2 = new staticPractice();
        s2.x = 67;
        s2.y = "My name";
        System.out.println(s1.x);
        System.out.println(s2.x);
        System.out.println(staticPractice.x);
        System.out.println(s1.y);
        System.out.println(s2.y);
//        System.out.println(staticPractice.y);             giving an error bcz y in staticPractice is not static.
    }

}
