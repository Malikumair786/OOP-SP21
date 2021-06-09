package com.company;


import java.io.Serializable;

public class Book implements Serializable {
    public String nameOfBook;
    public String PublisherName;
    public Person2 author = new Person2();
}

