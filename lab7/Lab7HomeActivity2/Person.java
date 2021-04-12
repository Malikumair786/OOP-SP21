package com.company;

public class Person {
    private Address adress;
    private String name;
    private String fname;

    public Person(String name,String fname,Address address){
        this.name = name;
        this.fname = fname;
        this.adress = address;
    }

    public void Display(){
        System.out.println("\nname: "+name+"\nfathername: "+fname);
        adress.Display();
    }

}
