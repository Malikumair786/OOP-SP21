package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Address address ;
        AddressBook addressBook = new AddressBook();

        int temp = 0;
        while (temp == 0){
            System.out.println("""
                Enter
                1 for enter new contact
                2 for search contact
                3 for update contact
                4 for delete contact
                5 for print all contact
                6 for read the contact from the file""");
            int choice = input.nextInt();
        switch (choice) {
            case 1 -> {
                int i = 0;
                while (i == 0) {
                    System.out.println("Enter the first name: ");
                    String firstName = input.next();
                    System.out.println("Enter the last name: ");
                    String lastName = input.next();
                    System.out.println("Enter the phone number: ");
                    String phoneNumber = input.next();
                    System.out.println("Enter the address: ");
                    String adress = input.next();
                    addressBook.addContact(new Address(firstName, lastName, phoneNumber, adress));
                    System.out.println("Enter 0 if you want to again add the contact: ");
                    i = input.nextInt();
                }
            }
            case 2 -> {
                int i = 0;
                while (i == 0) {
                    System.out.println("Enter the first name: ");
                    String firstName = input.next();
                    System.out.println("Enter the last name: ");
                    String lastName = input.next();
                    address = addressBook.SearchContact(firstName, lastName);
                    System.out.println(address);
                    System.out.println("Enter 0 if you want to again search the contact: ");
                    i = input.nextInt();
                }
            }
            case 3 -> {
                int i = 0;
                while (i == 0) {
                    System.out.println("enter the first name of the address you want to update: ");
                    String firstName = input.next();
                    System.out.println("enter the last name of the address you want to update: ");
                    String lastName = input.next();
                    System.out.println("enter the phone number of the address you want to update: ");
                    String phoneNumber = input.next();
                    System.out.println("enter the address of " + firstName);
                    String addressOfcontact = input.next();
                    addressBook.updateContact(new Address(firstName, lastName, phoneNumber, addressOfcontact));
                    System.out.println("Enter 0 if you want to again update any address: ");
                    i = input.nextInt();
                }
            }
            case 4 -> {
                int i = 0;
                while (i == 0) {
                    System.out.println("enter the first name of the address you want to delete: ");
                    String firstName = input.next();
                    System.out.println("enter the last name of the address you want to delete: ");
                    String lastName = input.next();
                    System.out.println("enter the phone number of the address you want to delete: ");
                    String phoneNumber = input.next();
                    System.out.println("enter the address of " + firstName);
                    String addressOfcontact = input.next();
                    addressBook.deleteContact(new Address(firstName, lastName, phoneNumber, addressOfcontact));
                    System.out.println("Enter 0 if you want to again update any address: ");
                    i = input.nextInt();
                }
            }
            case 5 -> addressBook.printContact();
            case 6 -> addressBook.filereader();
        }
        addressBook.filerwriter();
        System.out.println("Enter 0 if you want to again perform any operation: ");
        temp = input.nextInt();
        }
    }
}
