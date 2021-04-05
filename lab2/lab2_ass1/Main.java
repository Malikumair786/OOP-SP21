package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length and width of rectangle: ");
        ractangle r1 = new ractangle();
        r1.length = input.nextDouble();
        r1.width = input.nextDouble();
        r1.display_area();
        r1.display_perimeter();

    }
}
