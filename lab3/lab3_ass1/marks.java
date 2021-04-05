package com.company;

public class marks {
    public double oop_marks,dsa_marks,ise_marks;
    public double sum;
    public marks(){
        oop_marks = 0;
        dsa_marks = 0;
        ise_marks = 0;
    }
    public marks(int x,int y,int z){
        oop_marks = x;
        dsa_marks = y;
        ise_marks = z;
    }
    public double display(){
        sum = oop_marks+dsa_marks+ise_marks;
        return sum;
    }
}
