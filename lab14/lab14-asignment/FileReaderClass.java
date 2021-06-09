package com.company;

import java.io.*;
import java.util.Scanner;

public class FileReaderClass {
    Scanner input = new Scanner(System.in);
    ObjectInputStream ois;
    FileReaderClass(String accNumber) {
        try {
            ois = new ObjectInputStream(new FileInputStream("ATMR File"));
            int i = 0;
            while (true) {
                Account account = (Account) ois.readObject();
                if (accNumber.equals(account.AccountNumber)) {
                    while (i == 0) {
                        System.out.println("Enter 1 if you want to withdraw money, 2 for deposit, 3 for transferring and 4 for balance inquiry");
                        int choice = input.nextInt();
                        switch (choice) {
                            case 1 -> {
                                System.out.println("Enter the amount you want to withdraw: ");
                                int with = input.nextInt();
                                account.TotalBalance -= with;
                                System.out.println("You withdraw " + with + " rupees successfully and now you remaining balance is " + account.TotalBalance);
                            }
                            case 2 -> {
                                System.out.println("Enter the amount you want to deposit: ");
                                int dep = input.nextInt();
                                account.TotalBalance += dep;
                                System.out.println("You deposited " + dep + " rupees and now you balance is " + account.TotalBalance);
                            }
                            case 3 -> {
                                System.out.println("Enter the account number you want to transfer the money: ");
                                String acc = input.next();
                                System.out.println("Enter the amount you want to transfer: ");
                                int am = input.nextInt();
                                account.TotalBalance -= am;
                                System.out.println("You Transfer " + am + " rupees to " + acc + " account number and now your balance is " + account.TotalBalance);
                            }
                            case 4 -> System.out.println("Your information:\t\tName: " + account.name +
                                    "\t\taccount number: " + account.AccountNumber + "\t\tTotal balance: "
                                    + account.TotalBalance);
                        }
                        System.out.println("Enter 0 if you want to again perform any operation: ");
                        i = input.nextInt();
                    }
                }

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