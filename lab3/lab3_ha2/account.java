package com.company;

public class account {
    public int balance;
    public int deposit;
    public account(){
        balance = 100;
        deposit = 0;
    }
    public account(int x,int y){
        balance = x;
        deposit = y;
    }
    public void withdraw(){
        System.out.println("You withdraw "+deposit+"$, now your remaining balance is "+(balance-deposit)+"$");
    }
}
