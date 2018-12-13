package com.company;

public class Value {
    private String name;
    private String parametr;

    public Value(String name, String parametr) {
        this.name = name;
        this.parametr = parametr;
    }

    public String getName() {
        return name;
    }

    public String getQuantity() {
        return parametr;
    }
}
