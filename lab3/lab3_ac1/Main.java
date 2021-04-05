package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        rectangle rect1 = new rectangle();
        System.out.println("Enter the length and width of rectangle: ");
        rect1.length = input.nextInt();
        rect1.width = input.nextInt();
        System.out.println(rect1.calculateArea());
    }
}
