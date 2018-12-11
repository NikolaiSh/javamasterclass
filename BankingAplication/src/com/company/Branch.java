package com.company;
import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {return customers;}

    public static Branch newBranch(String name) {return new Branch(name);}

    public boolean addCustomer(String name, double initialTransaction) {
        if(findCustomer(name) > -1) {
            System.out.println("Cannot add customer, customer already exists");;
            return false;
        }
        Customer customer = Customer.newCustomer(name);
        customer.addTransaction(initialTransaction);
        this.customers.add(customer);
        System.out.println("Customer '" + name + "' added to branch '" + this.name + "' with the initial transaction: " + initialTransaction);
        return true;
    }

    public boolean addTransaction(String customerName, double transaction) {
        int position = this.findCustomer(customerName);
        if(position == -1) {
            System.out.println("Cannot add transaction");
            return false;
        }
        this.customers.get(position).addTransaction(transaction);
        System.out.println(transaction + " added as transaction to customer " + this.customers.get(position).getName());
        return true;
    }

    private int findCustomer(String name) {
        for(int i = 0; i < this.getCustomers().size(); i++) {
            if(this.getCustomers().get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void printCustomers() {
        for(int i = 0; i < this.customers.size(); i++) {
            System.out.println((i + 1) + ". " + this.customers.get(i).getName());
            this.customers.get(i).printTransactions();
        }
    }

    private int findCustomer(Customer customer) {
        for(int i = 0; i < this.customers.size(); i++) {
            if(this.customers.get(i).getName().equals(customer.getName())) {
                return i;
            }
        }
        System.out.println("Customer not found");
        return -1;
    }
}
