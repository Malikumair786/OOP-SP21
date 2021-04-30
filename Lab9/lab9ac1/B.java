package com.company;

public class B extends A{
    private int k;
    public B(int a,int b,int k){
        super(a,b);
        this.k = k;
    }
    public void Show(){
        System.out.println("K is: "+k);
    }

}
