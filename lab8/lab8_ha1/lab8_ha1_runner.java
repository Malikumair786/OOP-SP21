package com.company;
public class lab8_ha1_runner {
    public static void main(String[] args) {
        //parent
        System.out.println("Person information is: ");
        person_ha1 p = new person_ha1("Umair","Rawalpindi","0333-5631160", "mu5631160");
        p.display();
        //child
        System.out.println("\nStudent Information is: ");
        student_ha1 s = new student_ha1("Ali","Islamabad","0309-5099693", "mn8167909","Male");
        s.display();
//      child
        System.out.println("\nEmployee information is: ");
        Date date = new Date(12,4,2021);
        employee_ha1 emp = new employee_ha1("Ali","Islamabad","0309-5099693", "mn8167909","ELite",50000,date);
        emp.display();
//      grand child
        System.out.println("\nFaculty information is: ");
        faculty fac = new faculty("Ali","Islamabad","0309-5099693", "mn8167909","Elite",500000,date,8,17);
        fac.display();
//      Grand child
        System.out.println("\nStaff information is: ");
        staff sta = new staff("Ali","Islamabad","0309-5099693", "mn8167909","xyz",60000,date,"new Staff");
        sta.display();
    }
}