package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        car c1 = new car();
        System.out.println("Enter the speed of the car in m/s: ");
        c1.speed = input.nextDouble();
        System.out.println("Enter the distance you want to travel in kilometer: ");
        c1.distance = input.nextDouble();
        System.out.println("Enter the speed of the AC: ");
        c1.AC = input.nextInt();
        System.out.println("Enter the gear of the car (1 to 4): ");
        c1.gear = input.nextInt();
        c1.display_time();
        c1.display_AC();
        c1.display_gear();
    }
}
