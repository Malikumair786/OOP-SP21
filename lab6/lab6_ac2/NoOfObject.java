package com.company;

public class NoOfObject {
    private static int objs = 0;
    private int a;
    public NoOfObject(){
        objs++;
    }
    public NoOfObject(int a){
        this.a = a;
        objs++;
    }
    public static int getObjs(){
        return objs;
    }
}
