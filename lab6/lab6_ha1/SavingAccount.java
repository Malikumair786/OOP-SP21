package com.company;

public class SavingAccount {
    private static double annualInterestRate;
    public double balance;
    static int increment = 0;
    public SavingAccount(){
        balance = 2000;
        increment++;
    }

    public SavingAccount(double balance){
        this.balance = balance;
        increment++;
    }
    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingAccount.annualInterestRate = annualInterestRate;
    }

    public void monthlyInterestRate(){
        balance += (balance*annualInterestRate)/12;          //monthly interestRate
    }

    public void display(){
        System.out.println("Your new balance is:"+balance+" and your total number of object created is "+increment);
    }
}
