package com.company;

import java.io.*;

public class ObjectInputStreamExample {
    ObjectInputStream ois;
    public void readObject(){
            try {
                ois = new ObjectInputStream(new FileInputStream("Filename"));
                while (true){
                    Person personread = (Person) ois.readObject();
                    System.out.println(personread.name);
                    System.out.println(personread.age);
                }
            }
            catch (EOFException e){
                System.out.println("End of file reached");
            }
            catch (ClassNotFoundException | IOException e){
                e.printStackTrace();
            } finally {
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
}
