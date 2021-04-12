package com.company;

public class PizzaOrder {
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;
    public double cost;
    public PizzaOrder(Pizza pizza1){
        this.pizza1 = pizza1;
    }

    public PizzaOrder(Pizza pizza1,Pizza pizza2){
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
    }

    public PizzaOrder(Pizza pizza1,Pizza pizza2,Pizza pizza3){
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
        this.pizza3 = pizza3;
    }

    public double calcTotal(){
            cost = (pizza1.cost + pizza2.cost + pizza3.cost);
            return cost;
    }
}