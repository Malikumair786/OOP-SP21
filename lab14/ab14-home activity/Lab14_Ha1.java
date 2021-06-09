package com.company;

import java.io.*;
import java.util.*;

public class Lab14_Ha1 {
    ObjectOutputStream oos = null;
    public void WriteObject(){
        Scanner input = new Scanner(System.in);
        try {
            oos = new ObjectOutputStream(new FileOutputStream("BookStore"));
            Book[] books = new Book[5];
            for (int i = 0 ; i<books.length ; i++){
                books[i] = new Book();
                System.out.println("Enter book name: ");
                books[i].nameOfBook = input.nextLine();
//                input.nextLine();
                System.out.println("Enter publisher name: ");
                books[i].PublisherName = input.nextLine();
                System.out.println("Enter Author Name: ");
                books[i].author.name = input.nextLine();
                System.out.println("Enter author age: ");
                books[i].author.age = input.nextInt();
                oos.writeObject(books[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (oos != null){
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}