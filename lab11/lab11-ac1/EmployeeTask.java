package com.company;

public class EmployeeTask implements RegisterForExam {
    private String name;
    private int salary;
    private String date;
    EmployeeTask(){
        name = null;
        date = null;
        salary = 0;
    }
    EmployeeTask(String name,int salary,String date){
        this.name = name;
        this.salary = salary;
        this.date = date;
    }

    @Override
    public void Register() {
        System.out.println("Name: "+name+"\nsalary: "+salary+"\nEmployee register on date: "+date);
    }
}
