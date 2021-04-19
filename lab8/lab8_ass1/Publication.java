package com.company;

public class Publication {
    private String title;
    private int price;

    public Publication(String title,int price){
        this.title = title;
        this.price = price;
    }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

//    @Override
//    public String toString() {                    //we can use the display function if we want but
//        return "title='" + title + '\'' +         //the requirement in the question is to use display function
//                ", price=" + price ;
//    }
    public void Display(){
        System.out.print("Title: "+title+"\t\tPrice: "+price);
    }
}
