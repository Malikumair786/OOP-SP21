package com.company;

import java.util.Scanner;

public class Student extends Person implements Association{
    private int rollNo;
    private int semester;

    Student(String name,String id){
        super(name,id);                                 //person class
    }

    @Override
    public void associate() {                                   //interface
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the rollNo: ");
        this.rollNo = input.nextInt();

        System.out.print("Enter the Semester of the student: ");
        this.semester = input.nextInt();

    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", rollNo=" + rollNo +
                ", semester=" + semester +
                '}';
    }
}
