package com.company;

public class staff extends employee_ha1{
    protected String title;
    public staff(String name,String adress,String phoneNo,String emailAdress,String office,int salary, Date datehired,String title){
        super(name,adress,phoneNo,emailAdress,office,salary,datehired);         //for calling the parent class constructor
        this.title = title;
    }
    public void display(){
        super.display();            //for calling the parent class method
        System.out.print("Title: "+title);
    }
}
