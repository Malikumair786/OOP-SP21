package com.company;

public class fraction {
    private double a;
    private double b;
    public double getA() { return a;}
    public void setA(int a) { this.a = a; }
    public double getB() { return b; }
    public void setB(int b) { this.b = b; }
    fraction(){
        a = 1;
        b = 1;
    }
    fraction(int a,int b){
        this.a = a;
        this.b = b;
    }
    static boolean bool = false;

    public boolean equals(fraction b){
        if (this.a/this.b == b.a/b.b){
            bool = true;
        }
        return bool;
    }
    static void display() {
        if (bool){
            System.out.println("The fraction of both the functions are equal");
        }
        else {
            System.out.println("The fractions are not equal");
        }
    }
}