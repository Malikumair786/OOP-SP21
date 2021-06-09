package com.company;

import java.io.*;
import java.util.Scanner;

public class Person implements Serializable {
    public String name = null;
    public int age = 0;
}
class ObjectOutputStreamExample{
    ObjectOutputStream oos = null;
Scanner input = new Scanner(System.in);
    public void writeObject() throws IOException {
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Filename"));
            Person[] p = new Person[2];
            for (int i = 0 ; i< p.length ; i++){
                p[i] = new Person();
                System.out.println("Person naem: ");
                p[i].name = input.nextLine();
                System.out.println("Person age: ");
                p[i].age = input.nextInt();
                oos.writeObject(p[i]);
            }
//            Person p = new Person();
//            p.name = "Umair";
//            p.age = 18;
//            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos !=null ){
                    oos.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
            }
    }
}
