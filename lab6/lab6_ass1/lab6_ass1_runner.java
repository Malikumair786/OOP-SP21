package com.company;
import java.util.Scanner;
public class lab6_ass1_runner {
    public static void main(String[] args) {
        double a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for sum, 2 for multiply, 3 for devide, 4 for modulud, 5 for" +
                "finding sin, 6 for finding cos, 7 for finding tan");
        int n = input.nextInt();
//all of the method that we call is by class name and not with the reference variable bcz all the method is static
        switch (n){
            case 1 ->{
                System.out.println("Enter the first number: ");
                a = input.nextInt();
                System.out.println("Enter the second number: ");
                b = input.nextInt();
                Calculator.Sum(a,b);                //call by class name because the method that we call is static
            }
            case 2 ->{
                System.out.println("Enter the first number: ");
                a = input.nextInt();
                System.out.println("Enter the second number: ");
                b = input.nextInt();
                Calculator.multiply(a,b);       //call by class name because the method that we call is static
            }
            case 3 ->{
                System.out.println("Enter the numerator: ");
                a = input.nextInt();
                System.out.println("Enter the denominator: ");
                b = input.nextInt();
                Calculator.devide(a,b);         //call by class name because the method that we call is static
            }
            case 4 ->{
                System.out.println("Enter the numerator: ");
                a = input.nextInt();
                System.out.println("Enter the denominator: ");
                b = input.nextInt();
                Calculator.modulus(a,b);            //call by class name because the method that we call is static
            }
            case 5 ->{
                System.out.println("Enter the number: ");
                a = input.nextInt();
                Calculator.sin(a);              //call by class name because the method that we call is static
            }
            case 6 ->{
                System.out.println("Enter the number: ");
                a = input.nextInt();
                Calculator.cos(a);              //call by class name because the method that we call is static
            }
            case 7 ->{
                System.out.println("Enter the number: ");
                a = input.nextInt();
                Calculator.tan(a);              //call by class name because the method that we call is static
            }
        }
    }
}