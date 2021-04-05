package com.company;

public class Complex {
    public double real;
    public double imag;
    public Complex(){
        real = 0;
        imag = 0;
    }
    public Complex(double r,double im){
        real = r;
        imag = im;
    }
    public Complex add(Complex b){
        Complex c_new = new Complex(real+ b.real,imag+b.imag);
        return c_new;
    }
    public void show(){
        System.out.println(real+imag);
    }
}
