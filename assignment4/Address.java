package com.company;

import java.io.*;

public class Address implements Serializable {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;


    Address(String firstName , String lastName , String phoneNumber , String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{ firstName='" + firstName + '\'' +
                ",lastName='" + lastName + '\'' +
                ",phoneNumber='" + phoneNumber + '\'' +
                ",address='" + address + '\'' +
                '}'+"\n";
    }
}
