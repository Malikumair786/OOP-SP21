package com.company;

public class Book extends Publication{
    private  int pageCount;

    public Book(String title,int price, int pageCount){
        super(title,price);
        this.pageCount = pageCount;
    }

    public int getPageCount() { return pageCount; }

    public void setPageCount(int pageCount) { this.pageCount = pageCount; }

//    @Override
//    public String toString() {                  //we can use the display function if we want but
//        return super.toString()+                //the requirement in the question is to use display function
//                ", pageCount=" + pageCount;
//    }

    public void Display(){
        super.Display();
        System.out.println("\t\tPage count: "+pageCount);
    }
}
