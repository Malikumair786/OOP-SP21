package com.company;

public class Calculator {
    static double a;
    static double b;
    public static void Sum(double a,double b){
        Calculator.a = a;
        Calculator.b = b;
        System.out.println("The sum of the number is "+(a+b));
    }

    public static void multiply(double a,double b){
        Calculator.a = a;
        Calculator.b = b;
        System.out.println("The multiply of the number is "+(a*b));

    }

    public static void devide(double a,double b){
        Calculator.a = a;
        Calculator.b = b;
        System.out.println("The devide of the number is "+(a/b));
    }

    public static void modulus(double a,double b){
        Calculator.a = a;
        Calculator.b = b;
        System.out.println("The modulus of the number is "+(a%b));
    }

    public static void sin(double a){
        Calculator.a = a;
        System.out.println("The sin of "+a+" is "+Math.sin(a));
    }

    public static void cos(double a){
        Calculator.a = a;
        System.out.println("The cos of "+a+" is "+Math.cos(a));
    }

    public static void tan(double a){
        Calculator.a = a;
        System.out.println("The tan of "+a+" is "+Math.tan(a));
    }
}