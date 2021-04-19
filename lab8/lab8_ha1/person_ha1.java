package com.company;

public class person_ha1 {
    protected String name;
    protected String adress;
    protected String phoneNo;
    protected String emailAdress;

    public person_ha1(String name,String adress,String phoneNo,String emailAdress){
        this.name = name;
        this.adress = adress;
        this.phoneNo = phoneNo;
        this.emailAdress = emailAdress;
    }

    public void display(){
        System.out.print("Name: "+name+"\t\tPhone No: "+phoneNo+"\t\tAdress: "+adress+"\t\temail Adress: "+emailAdress+"\t\t");
    }
}