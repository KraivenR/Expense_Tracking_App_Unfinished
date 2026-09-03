package com.example.expensestrackinglist;

public class Bill{

    private String name;
    private String date;
    private double amount;

    public Bill(String name, String date, double amount){

        this.name = name;
        this.date = date;
        this.amount = amount;
    }
    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
    public double getAmount() {
        return amount;
    }

}
