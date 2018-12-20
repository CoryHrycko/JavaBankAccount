package com.example.java;

public class BankAccount {
    private double accountNumber; // TODO want to use this as id key.
    private double accounBalance;// TODO Want a class that has the money containers
    private String customerName;//TODO Want a customer info section

    public BankAccount() {
        this(000_000_0000,00.00,Please_log-in )
    }
    public BankAccount(double accountNumber, double accounBalance, String customerName) {

        this.accountNumber=accountNumber2 ;
        this.accounBalance=accounBalance;
        System.out.println("You created account "+
                this.accountNumber);
    }

    public void deposit(int addMoney) {
        if (addMoney < 0) {
            System.out.println("you canot desposit a "+
                    "negative amount.");
        }else{
            this.accounBalance=this.accounBalance + addMoney;
            System.out.println("$"+addMoney+
                    " deposited into account: "+accountNumber+".");
        }
    }

    public void withdraw(int removeMoney) {
        if (removeMoney > this.accounBalance) {
            System.out.println("No no no, Can't remove more than" +
                    "what is in there!");
        } else {
            this.accounBalance=this.accounBalance - removeMoney;
            System.out.println("$"+removeMoney+" has been withdrawn from account "+
                    this.accountNumber+".");
        }

















}
