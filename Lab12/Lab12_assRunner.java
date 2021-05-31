package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab12_assRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        //Lab Work
//        HumanResource hr = new HumanResource();
//        hr.add("Umair","012","Student");
//        hr.add("Ali","123","Teacher");
//        hr.add("Usama","234","Student");
//        hr.add("Hamza","345","Teacher");
//        System.out.println(hr);
//
//        hr.delete("1223");              //1223 is not the id of anything
//        hr.delete("123");
//        System.out.println(hr);


        //Assignment:
        String name,id;
        ArrayList<HumanResource> a = new ArrayList<HumanResource>();        //built-in arraylist
        int i = 0;
        while (i == 0){
            System.out.println("Enter 1 for entering student data and 2 for entering Teacher data: ");
            int choice = input.nextInt();
            if (choice == 1){
                System.out.println("Enter the name of the student: ");
                name = input.nextLine();
                input.nextLine();
                System.out.println("Enter the id number of the student: ");
                id = input.nextLine();
                a.add(new HumanResource(name,id,"Student"));                //add method of arraylist with Human resource
            }
            else if (choice == 2){
                System.out.println("Enter the name of the teacher: ");
                name = input.nextLine();
                input.nextLine();
                System.out.println("Enter the id number of the teacher: ");
                id = input.nextLine();
                a.add(new HumanResource(name,id,"Teacher"));
            }
            System.out.println("Enter 0 if you want to again enter the record: ");
            i = input.nextInt();
        }



        i = 0;
        while (i == 0){
            System.out.println("Enter 1 if you want to remove any index and 2 for print the record:");
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Enter the index number that you want to remove: ");
                int index = input.nextInt();
                try {
                    a.remove(index);
                    System.out.println("After removing the record: ");
                    System.out.println(a);              //this will print all the records except the record that is previously in index 1
                } catch (Exception e) {
                    System.out.println("index is not present in the record");
                }
            }
            else if (choice == 2){
                System.out.println("Enter 1 for print the record aff all person and 2 for print the record in specific index: ");
                int p = input.nextInt();
                if (p == 1){
                    System.out.println(a);
                }
                else if (p == 2){
                    System.out.println("Enter the index number for printing the record: ");
                    int index = input.nextInt();
                    System.out.println(a.get(index));
                }
            }
            System.out.println("Enter 0 if you want to remove or print anything: ");
            i = input.nextInt();
        }

//        System.out.println("After removing the record: ");
//        System.out.println(a);              //this will print all the records except the record that is previously in index 1


//          //this code is only use when you dont want to add the record again and again
//        a.add(new HumanResource("Umair","023","Student"));
//        a.add(new HumanResource("Ali","345","Teacher"));
//        a.add(new HumanResource("Ali","234","Teacher"));
//        a.add(new HumanResource("Ali","456","Teacher"));
//        System.out.println(a);
//        a.remove(2);
//        System.out.println(a);



    }
}
