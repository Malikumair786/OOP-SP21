package com.company;

public class rectangle {
    private int length,width;
    public rectangle(){
        length = 5;
        width = 2;
    }
    public rectangle(int l,int w){
        length = l;
        width = w;
    }
    public void setLength(int l){
        length = l;
    }
    public void setWidth(int w){
        width = w;
    }
    public int getlength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public int area(){
        return (length*width);
    }
}
