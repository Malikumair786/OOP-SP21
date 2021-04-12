package com.company;

import java.security.PublicKey;

public class Book {
    private String bookname;
    private String publisher;
    private Person person;

    public Book(String bookname,String publisher,Person person){
        this.person = person;
        this.bookname = bookname;
        this.publisher = publisher;
    }

    public String getBookname() { return bookname; }

    public void setBookname(String bookname) { this.bookname = bookname; }

    public String getPublisher() { return publisher; }

    public void setPublisher(String publisher) { this.publisher = publisher; }

    public Person getPerson() { return person; }

    public void setPerson(Person person) { this.person = person; }

    public void Display(){
        System.out.println("Publisher name: "+publisher+"\nBook name: "+bookname+"\ninfromation of buyer is as follows:");
        person.Display();
    }
}
