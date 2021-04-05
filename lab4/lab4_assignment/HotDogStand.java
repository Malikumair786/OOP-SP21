package com.company;
public class HotDogStand {
    private int id;
    private int sold;

    public HotDogStand() {
        id = 0;
        sold = 0;
    }
    public HotDogStand(int id, int sold) {
        this.id = id;
        this.sold = sold;
    }

    public void justSold() {
        sold+=1;
    }
    public int getId() {
        return id;
    }
    public void getsold() {
        System.out.println("The hot dog sold for " + id + " id number is " + sold);
    }
}