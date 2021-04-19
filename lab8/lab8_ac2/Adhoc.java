package com.company;

public class Adhoc extends employee{
    private int numberOfworkinfDays;
    private int wage;

    public Adhoc(String name,String phone,String adress,int allownce,int numberOfworkinfDays,int wage){
        super(name,phone,adress,allownce);
        this.numberOfworkinfDays = numberOfworkinfDays;
        this.wage = wage;
    }
    public void Display(){
        System.out.println("Name: "+name+"\nPhone: "+phone+"\nadress: "+adress+"\nallownce: "+allownce
        +"\nnumber of working days: "+numberOfworkinfDays+"\nWage: "+wage);
    }
}
