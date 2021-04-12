package com.company;

public class lab7_ac1_runner {
    public static void main(String[] args) {
        StudentRecord s = new StudentRecord("MBA");
        employeeRecord e = new employeeRecord(111,500000);
        Manager m1 = new Manager("Finance Manager",5000,e,s);
        m1.display();

    }
}
