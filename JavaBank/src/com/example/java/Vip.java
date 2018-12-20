package com.example.java;

public class VipPerson{
    private String name;
    private double creditLimit;
    private String email;

    public VipPerson(){
        this("Default", 50_000,"default@email.com")
    }
    public VipPerson(String name, double creditLimit) {
        this(name,creditLimit,"unkown@unkown.com")
    }

    public VipPerson(String name, double creditLimit, String email) {
        this.name = name;//this saves fields
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}