package com.company;

public class CarType extends Car {

    private String name;
    private boolean handSteering;
    private boolean gearChange;

    public CarType(int gears, String name) {
        this(0, gears, name, false, false);
    }

    public CarType(int speed, int gears, String name, boolean handSteering, boolean gearChange) {
        super(speed, gears);
        this.name = name;
        this.handSteering = handSteering;
        this.gearChange = gearChange;
    }

    public String getName() {
        return name;
    }

    public boolean isGearChange() {
        return gearChange;
    }

    public void setHandSteering(boolean handSteering) {
        this.handSteering = handSteering;
    }

    public boolean isHandSteering() {
        return handSteering;
    }

    public
}
