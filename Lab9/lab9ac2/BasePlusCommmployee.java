package com.company;

public class BasePlusCommmployee extends commissionEmployee{
    private double salary;
    BasePlusCommmployee(){
        salary = 48000;
    }
    BasePlusCommmployee(String firstName,String lastName,String SSN,double grossSale,double commissionRate,double salary){
        super(firstName,lastName,SSN,grossSale,commissionRate);
        this.salary = salary;
    }
    public double earning(){
        return super.earning()+salary;
    }
    public void display(){
        super.display();
        System.out.println(", Salary: "+salary);
    }

}
