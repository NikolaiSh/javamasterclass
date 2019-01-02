package com.example.javacomplete;

public class ScopeCheck {
    public int publicVar = 0;
    private  int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ", privateVar = " + privateVar);
    }

    public int getPublicVar() {
        return publicVar;
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void teimesTwo(){
        int privateVar = 2;
        for(int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i*privateVar);
        }
    }
}
