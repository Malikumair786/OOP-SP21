package com.company;

import java.io.*;

public class Lab14_ha2 {
    ObjectInputStream ois;
    public void readObject() throws IOException, ClassNotFoundException {
        try {
            ois = new ObjectInputStream(new FileInputStream("BookStore"));
            while (true){
                Book book = (Book) ois.readObject();

                System.out.println(book.nameOfBook);
                System.out.println(book.PublisherName);
                System.out.println(book.author.name);
                System.out.println(book.author.age);
            }
        }
        catch (EOFException e){
            System.out.println("End of file reached");
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        try {
            if (ois != null){
                ois.close();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
