package com.company;

public class lab6_ha1_runner {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount();
        SavingAccount saver2 = new SavingAccount(3000);
        SavingAccount.setAnnualInterestRate(3);
        saver1.monthlyInterestRate();
        saver2.monthlyInterestRate();
        saver1.display();
        saver2.display();

        SavingAccount.setAnnualInterestRate(4);
        saver1.monthlyInterestRate();
        saver2.monthlyInterestRate();
        saver1.display();
        saver2.display();
    }
}
