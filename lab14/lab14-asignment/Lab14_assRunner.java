package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Lab14_assRunner {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i == 0){
        System.out.println("Enter 1 for writing in the file and 2 for reading in the file, 3 for perform operation on specific account number: ");
        int choice = input.nextInt();
        switch (choice){
            case 1->{
                FileWriterClass fwc = new FileWriterClass();
            }
            case 2->{
                Filereader2 fr2 = new Filereader2();
            }
            case 3->{
                System.out.println("Enter the account number: ");
                String accountNumber = input.next();
                FileReaderClass frc = new FileReaderClass(accountNumber);
            }
        }
            System.out.println("Enter 0 for again perform operation: ");
        i = input.nextInt();
    }
    }
}
