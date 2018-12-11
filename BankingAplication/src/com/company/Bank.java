package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch(String name) {
        if(this.findBranch(name) > -1){
            System.out.println("Cannot add branch, branch already exists");
            return false;
        }
        Branch branch = Branch.newBranch(name);
        this.branches.add(branch);
        System.out.println("Branch " + name + " added");
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        int branchPosition = this.findBranch(branchName);
        if(branchPosition < 0) {
            System.out.println("Cannot add customer to the branch '" + branchName + "'. Such brunch doesn`t exist.");
            return false;
        }

        return (this.branches.get(branchPosition).addCustomer(customerName, initialTransaction));
    }

    public boolean addTransaction(String branchName, String customerName, double transaction) {
        int branchPosition = this.findBranch(branchName);
        if(branchPosition == -1) {
            System.out.println("Cannot add transaction to the customer '" + customerName + "'. Brunch '" + branchName + "' doesn`t exist.");
            return false;
        }

        return this.branches.get(branchPosition).addTransaction(customerName, transaction);
    }

    public void printBranchCustomers(String branchName) {
        int branchPosition = this.findBranch(branchName);
        if(branchPosition == -1) {
            System.out.println("Cannot print branch customers. Brunch '" + branchName + "' doesn`t exist.");
            return;
        }
        System.out.println("Customers of the '" + this.branches.get(branchPosition).getName() + "' brach:");
        this.branches.get(branchPosition).printCustomers();
    }

    private int findBranch(String name) {
        for(int i = 0; i < this.branches.size(); i++) {
            if(this.branches.get(i).getName().equals(name)) {
                return i;
            }
        }
        System.out.println("Branch not found");
        return -1;
    }

    private int findBranch (Branch branch) {
        for(int i = 0; i < this.branches.size(); i++) {
            if(this.branches.get(i).getName().equals(branch.getName())) {
                return i;
            }
        }
        System.out.println("Branch not found");
        return -1;
    }


}
