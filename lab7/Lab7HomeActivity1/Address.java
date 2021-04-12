package com.company;

public class Address {
    private int streetno;
    private String houseNo;
    private String city;
    private String code;

    public Address(){
        streetno = 1;
        houseNo = "1";
        city = "AAA";
        code = "1234";
    }

    public Address(int streetno,String houseNo,String city,String code){
        this.city = city;
        this.code = code;
        this.houseNo = houseNo;
        this.streetno = streetno;
    }

    public int getStreetno() { return streetno; }

    public void setStreetno(int streetno) { this.streetno = streetno; }

    public String getHouseNo() { return houseNo; }

    public void setHouseNo(String houseNo) { this.houseNo = houseNo; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

    public void Display(){
        System.out.println("House no: "+houseNo+"\nStreet No: "+streetno+"\nCity name: "+city+"\nCode: "+code);
    }
}
