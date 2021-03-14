package com.company;

public class lab3_ha2_runner {
    public static void main(String[] args) {
        account ac1 = new account();
        ac1.withdraw();

        account ac2 = new account(1000,100);
        ac2.withdraw();
    }
}
