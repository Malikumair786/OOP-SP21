package com.company;

public class Distance {
    private double feet;
    private double inches;
    public Distance(){
        feet   = 12;
        inches = 9;
    }
    public Distance(double feet,double inches){
        this.feet = feet;
        this.inches = inches;
    }

    public double getFeet() {
        return feet;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }
    public Distance add(Distance a){
        Distance d_new = new Distance(feet+a.feet,inches+a.inches);
        return d_new;
    }
    public void display(){
        if (inches>=12){
            feet+=1;
            inches = inches-12;
        }
        System.out.println("feet: "+feet+"\ninches: "+inches);
    }
}
