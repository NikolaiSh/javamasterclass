package com.company;

public class Vehicle {

    private int speed;

    public Vehicle() {
        this(0);
    }

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
