package com.company;

import java.io.*;

public class ObjectInputStreamExample2 {
    ObjectInputStream ois;
    public void SearchObject(String name){
        try {
            ois = new ObjectInputStream(new FileInputStream("Filename"));
            while (true){
                Person personread = (Person) ois.readObject();
                System.out.println("K");
                if (personread.name.equalsIgnoreCase(name)){
                    System.out.println("K1");
                    System.out.println(personread.name);

                    System.out.println(personread.age);
                    break;
                }
            }
        }
        catch (EOFException e){
            System.out.println("End of file reached");
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        finally {
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
