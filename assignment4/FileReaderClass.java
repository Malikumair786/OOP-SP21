package com.company;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FileReaderClass {
    ObjectInputStream ois;
    public ArrayList<Address> readObject(){
        ArrayList<Address> arrayList1 = new ArrayList<>();
        try {
            ois = new ObjectInputStream(new FileInputStream("Records"));
            while (true){
                Address address = (Address) ois.readObject();
                arrayList1.add(address);
//                System.out.print(address.getFirstName());
//                System.out.print("\t\t"+address.getLastName());
//                System.out.print("\t\t"+address.getPhoneNumber());
//                System.out.println("\t\t"+address.getAddress());
            }
        }catch (EOFException e){
            System.out.print("");
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if (ois != null){
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return arrayList1;
    }
}
