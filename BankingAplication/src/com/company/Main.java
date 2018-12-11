package com.company;

import java.util.Scanner;

public class Main {

    public static Bank bank = new Bank("Actives");
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printInstruction();
        boolean quit = false;
        while(!quit) {
            System.out.print("Make a choice (5 - instruction): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    addBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    addTransaction();
                    break;
                case 4:
                    printCustomers();
                    break;
                case 5:
                    printInstruction();
                   break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printCustomers(){
        System.out.print("Enter branch name: ");
        String branchName = scanner.nextLine();

        bank.printBranchCustomers(branchName);
    }

    public static void addTransaction() {
        System.out.print("Enter branch name: ");
        String branchName = scanner.nextLine();

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter new transaction: ");
        double transaction = scanner.nextDouble();
        scanner.nextLine();

        bank.addTransaction(branchName, customerName, transaction);
    }

    public static void addCustomer() {
        System.out.print("Enter branch name: ");
        String branchName = scanner.nextLine();

        System.out.print("Enter new customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter initial transaction: ");
        double initialTransaction = scanner.nextDouble();
        scanner.nextLine();

        bank.addCustomer(branchName,customerName,initialTransaction);
    }

    public static void addBranch() {
        System.out.print("Enter new branch name: ");
        String branchName = scanner.nextLine();
        bank.addBranch(branchName);
    }

    public static void printInstruction() {
        System.out.println("1 - add new branch\n" +
                "2 - add a customer to branch\n" +
                "3 - add transaction\n" +
                "4 - show a list of customer for the branch\n" +
                "5 - print instruction\n" +
                "6 - quit");
    }
}
