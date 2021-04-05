package com.company;
import java.util.Scanner;
public class lab5_ass1_runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        fraction f1 = new fraction(4,2);
        System.out.println("Enter the value of first fraction");
        int a = input.nextInt(), b = input.nextInt();
        f1.setA(a);
        f1.setB(b);
        fraction f2 = new fraction();
        System.out.println("Enter the value of second fraction");
        a = input.nextInt();
        b = input.nextInt();
        f2.setA(a);
        f2.setB(b);
        boolean f3 = f1.equals(f2);
        fraction.display();
    }
}