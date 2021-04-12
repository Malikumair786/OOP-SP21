package com.company;

public class Manager {
    private StudentRecord stu;
    private employeeRecord emp;
    private String title;
    private double dues;

    public Manager(String title,double dues,employeeRecord emp,StudentRecord stu){
        this.title = title;
        this.dues = dues;
        this.stu = stu;
        this.emp = emp;
    }
    public void display(){
        System.out.println("Title is: "+title);
        System.out.println("Dues are "+dues);

        System.out.println("Student record is as under: ");
        System.out.println("Degree is: "+stu.getDegree());

        System.out.println("Emloyee record is as under: ");
        System.out.println("Employee id is: "+emp.getEmp_id());
        System.out.println("Employee salary is: "+emp.getSalary());
    }
}
