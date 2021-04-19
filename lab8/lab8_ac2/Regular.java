package com.company;

public class Regular extends employee {
    protected int basicPay;
    public Regular(String name,String phone,String address,int allownce,int basicPay){
        super(name,phone,address,allownce);
        this.basicPay = basicPay;
    }
    public void Display(){
        System.out.println("name: "+name+"\nphone: "+phone+"\nadress: "+adress+"\nallownce: "+allownce+"\nbasic pay: "+basicPay);
    }
}
