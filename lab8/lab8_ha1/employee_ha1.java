package com.company;

public class employee_ha1 extends person_ha1{
    protected String office;
    protected int salary;
    protected Date dateHired;

    public employee_ha1(String name,String adress,String phoneNo,String emailAdress,String office,int salary,Date dateHired){
        super(name,adress,phoneNo,emailAdress);         //for calling the parent class constructor
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    public void display(){
        super.display();
        System.out.print("office name: "+office+"\t\tsalary: "+salary+"\t\tdate Hired: "+dateHired.display()+"\t\t");
    }
}
