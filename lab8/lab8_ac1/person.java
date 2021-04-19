package com.company;

public class person {
    protected String name;
    protected String id;
    protected int phone;

    public person(){
        name = "Nagina Bazar";
        id = "SP20-BSE-096";
        phone = 123456;
    }
    public person(String name,String id,int phone){
        this.id = id;
        this.phone = phone;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void display(){
        System.out.println("Name: "+name+" id: "+id+" phone "+phone);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", phone=" + phone;
    }
}
