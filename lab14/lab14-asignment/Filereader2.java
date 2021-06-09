package com.company;

import java.io.*;
import java.util.Scanner;

public class Filereader2 {
    ObjectInputStream ois;

    Scanner input = new Scanner(System.in);

    Filereader2() {
        try {
            ois = new ObjectInputStream(new FileInputStream("ATMR File"));
            while (true) {
                Account account = (Account) ois.readObject();
                System.out.print("Name: " + account.name);
                System.out.print("Account number: " + account.AccountNumber);
                System.out.println("Balance: " + account.TotalBalance);
            }
        } catch (EOFException e) {
            System.out.println("End of file reached");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
