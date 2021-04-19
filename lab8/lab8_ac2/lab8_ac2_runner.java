package com.company;

public class lab8_ac2_runner {
    public static void main(String[] args) {
        Regular regularobj = new Regular("Umair","0333-5631160","national town",23000,50000);
        regularobj.Display();

        Adhoc adhoc = new Adhoc("Ali","0309-5099693","Rawalpindi",45000,5,1);
        adhoc.Display();
    }
}
