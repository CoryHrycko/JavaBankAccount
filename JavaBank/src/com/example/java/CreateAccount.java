package com.example.java;

public class CreateAccount extends BankAccount {

    public CreateAccount(int i, int i1) {
        super(i, i1);
    }

    public CreateAccount(double accountNumber, double accounBalance, String customerName) {
        super(accountNumber, accounBalance, customerName);

        this.accountNumber=accountNumber ;
        this.accounBalance=accounBalance;
        System.out.println("You created account "+
                this.accountNumber);
    }
}
