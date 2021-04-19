package com.company;

public class student_ha1 extends person_ha1 {
    protected String status;

    public student_ha1(String name,String adress,String phoneNo,String emailAdress,String status){
        super(name,adress,phoneNo,emailAdress);                     //for calling the parent class constructor
        this.status = status;
    }
    public void display(){
        super.display();
        System.out.println("Status: "+status);
    }
}
