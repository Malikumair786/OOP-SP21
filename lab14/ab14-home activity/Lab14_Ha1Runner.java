package com.company;
import java.io.IOException;

public class Lab14_Ha1Runner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Lab14_Ha1 lab14_ha1 = new Lab14_Ha1();
        lab14_ha1.WriteObject();

        Lab14_ha2 a = new Lab14_ha2();
        a.readObject();
    }
}
