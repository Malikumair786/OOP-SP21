package com.company;

public class lab7ha2Runner {
    public static void main(String[] args) {
        Address a = new Address(2,"NE-856","Rawalpindi","123456789");
        Person p = new Person("Umair","Saeed",a);
        Book b = new Book("Physics","Ali Raza",p);
        b.Display();
    }

}
