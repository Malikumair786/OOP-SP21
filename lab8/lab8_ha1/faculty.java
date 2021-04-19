package com.company;

public class faculty extends employee_ha1 {
    protected int officeHours;
    protected int rank;
    public faculty(String name,String adress,String phoneNo,String emailAdress,String office,int salary,Date dateHired,int officeHours,int rank){
        super(name,adress,phoneNo,emailAdress,office,salary,dateHired);     //for calling the parent class constructor
        this.officeHours = officeHours;
        this.rank = rank;
    }
    public void display(){
        super.display();        //for calling the parent class method
        System.out.print("Office hours: "+officeHours+"\t\tRank: "+rank);
    }

}
