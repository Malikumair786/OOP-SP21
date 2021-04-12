package com.company;

public class employeeRecord {
    private int emp_id;
    private int salary;

    public employeeRecord(int emp_id,int salary){
        this.salary = salary;
        this.emp_id = emp_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
