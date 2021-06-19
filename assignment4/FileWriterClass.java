package com.company;

import java.io.*;
import java.util.ArrayList;

public class FileWriterClass {
    ObjectOutputStream oos;
    public void writeObject(ArrayList<Address> arrayList){
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Records"));
            for (Address address : arrayList) {
                oos.writeObject(address);
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
