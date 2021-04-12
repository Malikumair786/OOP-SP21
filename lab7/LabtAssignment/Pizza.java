package com.company;

public class Pizza {
    private String size;        //e.g: Small,medium,large
    private int cheese;
    private int pepperoni;
    private int ham;
    double cost;

    public Pizza(String size,int cheese,int pepperoni,int ham){
        this.cheese = cheese;
        this.ham = ham;
        this.pepperoni = pepperoni;
        this.size = size;
    }

    public double getCost() {
        return cost;
    }


    public String getSize() { return size; }

    public void setCost(double cost) {
        this.cost = cost;
    }


    public void setSize(String size) { this.size = size; }

    public int getCheese() { return cheese; }

    public void setCheese(int cheese) { this.cheese = cheese; }

    public int getPepperoni() { return pepperoni; }

    public void setPepperoni(int pepperoni) { this.pepperoni = pepperoni; }

    public int getHam() { return ham; }

    public void setHam(int ham) { this.ham = ham; }

    public double calcCost(){
        double x = (2*cheese)+(2*ham)+(2*pepperoni);
        if (size.equalsIgnoreCase("Small")){
            cost = 10+x;
        }
        if (size.equalsIgnoreCase("Medium")){
            cost = 12+x;
        }
        if (size.equalsIgnoreCase("Large")){
            cost = 14+x;
        }
        return cost;
    }
    public void getDiscription(){
        System.out.println("The size of the Pizza is: "+size+"\nQuantity of cheese: "+cheese
        +"\nQuantity od pepperoni: "+pepperoni+"\nQuantity of ham: "+ham);
    }
}
