package com.company;

public class lab7_ass1Runner {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("large",1,1,2);
        System.out.println("The total cost is "+p1.calcCost());
        p1.getDiscription();

        Pizza p2 = new Pizza("medium",1,1,2);
        System.out.println("The total cost is "+p2.calcCost());
        p2.getDiscription();

        Pizza p3 = new Pizza("small",1,1,2);
        System.out.println("The total cost is "+p3.calcCost());
        p2.getDiscription();

        PizzaOrder po = new PizzaOrder(p1,p2,p3);
        System.out.println("The total cost is: "+po.calcTotal());


    }
}
