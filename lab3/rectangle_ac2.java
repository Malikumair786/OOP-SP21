package com.company;

public class rectangle_ac2 {
    public int length,width;
    public rectangle_ac2(){
        length = 5;
        width = 2;
    }
    public rectangle_ac2(int l,int w){
        length = l;
        width = w;
    }
    public int calculate_area(){
        return (length*width);
    }
}
