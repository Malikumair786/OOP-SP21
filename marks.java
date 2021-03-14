package com.company;

public class marks {
    private int marks1;
    private int marks2;
    private int marks3;
    public marks(){
        marks1 = 0;
        marks2 = 0;
        marks3 = 0;
    }
    public marks(int a,int b,int c){
        marks1 = a;
        marks2 = b;
        marks3 = c;
    }
    public void setMarks1(int a){
        marks1 = a;
    }
    public int getMarks1(){
        return marks1;
    }

    public void setMarks2(int b){
        marks2 = b;
    }
    public int getMarks2(){
        return marks2;
    }

    public void setMarks3(int a){
        marks3 = a;
    }
    public int getMarks3(){
        return marks3;
    }
    public void display(){
        System.out.println("The average marks is "+(marks1+marks2+marks3)/3);
    }
}
