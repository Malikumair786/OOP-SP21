package com.company;
import java.util.Scanner;
public class lab3_ass1_runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        marks m1 = new marks();
        System.out.println("Enter your marks in oop: ");
        int oop = input.nextInt();
        System.out.println("Enter your marks in dsa: ");
        int dsa = input.nextInt();
        System.out.println("Enter your marks in oop: ");
        int ise = input.nextInt();
//        m1.marks(oop,dsa,ise);
        System.out.println("The sum of marks is "+m1.display());
        marks m2 = new marks(8,9,10);
        System.out.println(m2.display());

    }
}
