package com.company;

public class account {
    private int balance;
    private int withdraw;
    private int deposit;
    public account(){
        balance = 100;
    }
    public account(int a,int b,int c){
        balance = a;
        deposit = b;
        withdraw = c;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setWithdraw(int w){
        withdraw = w;
    }
    public  void setdeposit(int d){
        deposit = d;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public int getDeposit() {
        return deposit;
    }
    public void display(){
        balance = balance+deposit-withdraw;
        System.out.println("your remaining balance is: "+balance);
    }
}
