package com.company;

public class lab6_ac2_runner {
    public static void main(String[] args) {
        NoOfObject o1 = new NoOfObject();
        NoOfObject o2 = new NoOfObject(23);
        NoOfObject o3 = new NoOfObject(156);

        System.out.println(NoOfObject.getObjs());
        System.out.println(o1.getObjs());           //never change the value of getObjs() bcz NoOfObjs is static
        System.out.println(o2.getObjs());
        System.out.println(o3.getObjs());
    }
}
