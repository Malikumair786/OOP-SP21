package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FileWriterClass {
    ObjectOutputStream oos;
    Account[] accounts = new Account[10];
    Scanner input = new Scanner(System.in);
    public  FileWriterClass() throws IOException {
        try {
            oos = new ObjectOutputStream(new FileOutputStream("ATMR File"));
            for (int i = 0; i < accounts.length; i++) {
                accounts[i] = new Account();
                System.out.print("Enter the name: ");
                accounts[i].name = input.next();
                System.out.print("Enter the Account number: ");
                accounts[i].AccountNumber = input.next();
                System.out.println("Enter the total balance: ");
                accounts[i].TotalBalance = input.nextInt();
                oos.writeObject(accounts[i]);
            }
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
        finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}