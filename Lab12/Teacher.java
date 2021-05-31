package com.company;

import java.util.Scanner;

public class Teacher extends Person implements Association{
    private String designation;
    private String department;

    public Teacher(String name,String id){              //Constructor
        super(name,id);                                 //Person class
    }

    @Override
    public void associate() {                               //interface
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Designation: ");
        this.designation = input.nextLine();

        System.out.print("Enter the Department ");
        this.department = input.nextLine();
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", designation='" + designation + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
