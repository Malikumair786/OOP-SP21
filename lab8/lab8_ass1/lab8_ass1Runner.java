package com.company;
import java.util.Scanner;
public class lab8_ass1Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Publication p = new Publication("Chemistry",130);
//        p.Display();
//        System.out.println(p);

        System.out.println("Enter 1 for book and 2 for tape: ");
        int n = input.nextInt();
        switch (n) {
            case 1 -> {
                System.out.println("Enter the title of the book: ");
                String title = input.next();

                System.out.println("Enter the price of the book: ");
                int price = input.nextInt();

                System.out.println("Enter the page count: ");
                int pageCount = input.nextInt();
                Book b = new Book(title, price, pageCount);
                b.Display();
//              System.out.println(b);                //for toString method
            }
            case 2 -> {
                System.out.println("Enter the title of the tape: ");
                String titleTape = input.next();
                System.out.println("Enter the price of tape: ");
                int pricetape = input.nextInt();
                System.out.println("Enter the playing time in minutes: ");
                double playingtime = input.nextDouble();
                tape t = new tape(titleTape, pricetape, playingtime);
                t.Display();
//              System.out.println(t);                //for toString method
            }
        }
    }
}
