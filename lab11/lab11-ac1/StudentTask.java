package com.company;

public class StudentTask implements RegisterForExam {
    private String name;
    private int age;
    private double gpa;
    StudentTask(){
        name = null;
        age = 0;
        gpa = 0;
    }
    StudentTask(String name,int age,double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public void Register() {
        System.out.println("Name: "+name+"\nAge: "+age+"\nGpa: "+gpa);
    }
}
