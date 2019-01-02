package com.example.javacomplete;

public class Main {

    public static void main(String[] args) {
	    String privateVar = "this is private to main()";

	    ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println("scopeCheck privateVar is " + scopeCheck.getPrivateVar());
        System.out.println(privateVar);

        scopeCheck.teimesTwo();

    }
}
