package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public static Customer newCustomer(String name) {

        return new Customer(name);
    }

    public boolean addTransaction(double transaction) {
        this.transactions.add(transaction);
        return true;
    }

    public void printTransactions() {
        System.out.println("    " + this.getName() + " transactions");
        for(int i = 0; i < this.transactions.size(); i++) {
            System.out.println("      "+ (i+1)+ ". " + this.transactions.get(i));
        }
    }

    public String getName() {

        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
