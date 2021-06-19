package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook implements Serializable {
    Scanner input = new Scanner(System.in);
    ArrayList<Address> contact = new ArrayList<>();


    public void addContact(Address address){
        contact.add(address);
    }       //contact is add in the list

    public Address SearchContact(String firstName,String lastName) {
        int i = 0;
        while (!contact.get(i).getFirstName().equals(firstName) && !contact.get(i).getLastName().equals(lastName)){
            i++;
        }
        return contact.get(i);
    }
    public void updateContact(Address address) {
        //call the search contact method and then those method return our required address
        Address address1 = SearchContact(address.getFirstName(), address.getLastName());
        System.out.println("Enter 1 for update first name,2 for update last name,3 for phone number and 4 for address");
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Enter the first name: ");
                String fname = input.next();
                address1.setFirstName(fname);
            }
            case 2 -> {
                System.out.println("Enter the last name: ");
                String lname = input.next();
                address1.setLastName(lname);
            }
            case 3 -> {
                System.out.println("Enter the mobile number: ");
                String mobnumb = input.next();
                address1.setPhoneNumber(mobnumb);
            }
            case 4 -> {
                System.out.println("Enter the adrees: ");
                String adress = input.next();
                address1.setAddress(adress);
            }
        }
    }
    public void deleteContact(Address address){
        //call the search contact method and then those method return our required address
        Address address2 = SearchContact(address.getFirstName(),address.getLastName());
        if (address2 != null) {
            contact.remove(address2);
        }
        else {
            System.out.println("Does not exist");
        }
    }

    public void printContact(){
        //print the array of address
        for (int i = 0 ; i<contact.size() ; i++){
            System.out.print(contact.get(i).getFirstName());
            System.out.print("\t\t"+contact.get(i).getLastName());
            System.out.print("\t\t"+contact.get(i).getPhoneNumber());
            System.out.println("\t\t"+contact.get(i).getAddress());
        }
    }
    public void filerwriter(){
        FileWriterClass fws = new FileWriterClass();        //call the filewriter class method and then those method write in the file
        fws.writeObject(contact);
    }
    public void filereader(){
        FileReaderClass frs = new FileReaderClass();        //call the filereader class method and then those method read from the file
        contact = frs.readObject();
        System.out.println(contact);
    }
}
