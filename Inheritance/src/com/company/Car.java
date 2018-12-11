package com.company;

public class Car extends Vehicle {

    private int gears;

    public Car(int gears) {
        this(0, gears);
    }

    public Car(int speed, int gears) {
        super(speed);
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }
}
