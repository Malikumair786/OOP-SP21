package com.company;

public class ABC {
    public static int i;
    public String s;

    public static void DisplayStatic(){
        System.out.println("i is "+i);
//        System.out.println("s is "+s);         //display error because s is non static cannot access in static method
    }
    public void nonStatic(){                    //non static access the static and non static variables.
        System.out.println("i is "+i);
        System.out.println("s is "+s);
    }
}
