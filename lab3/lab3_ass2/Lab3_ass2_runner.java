package com.company;
import java.util.Scanner;
public class Lab3_ass2_runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        time t = new time();
        System.out.println("Enter hour :");
        t.hr = input.nextInt();
        System.out.println("Enter minutes :");
        t.minutes = input.nextInt();
        System.out.println("Enter seconds :");
        t.seconds = input.nextInt();
        if (t.seconds >= 60){
            t.seconds = t.seconds - 60;
            t.minutes = t.minutes + 1;
        }
        if (t.minutes >=60){
            t.minutes = t.minutes - 60;
            t.hr = t.hr + 1;
        }
        t.time(t.hr,t.minutes,t.seconds);
        t.display();
    }

}
