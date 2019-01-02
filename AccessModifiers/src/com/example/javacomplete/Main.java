package com.example.javacomplete;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account mikAccount = new Account("Mik");
        mikAccount.deposit(1000);
        mikAccount.withdraw(500);
        mikAccount.withdraw(-200);
        mikAccount.deposit(-20);
        mikAccount.culateBalance();
       // mikAccount.balance = 5000;
       // mikAccount.transactions.add(4500);

    }
}
