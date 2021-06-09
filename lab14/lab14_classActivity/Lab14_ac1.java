package com.company;

import java.io.*;

public class Lab14_ac1 implements Serializable {
    public static void main(String[] args) throws IOException {
//        ObjectOutputStreamExample oose = new ObjectOutputStreamExample();
//        oose.writeObject();
        ObjectInputStreamExample oise = new ObjectInputStreamExample();
        oise.readObject();

//        ObjectInputStreamExample2 ois2 = new ObjectInputStreamExample2();
//        ois2.SearchObject("Filename");

    }
}
