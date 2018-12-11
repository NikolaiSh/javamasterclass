package com.company;

public class HealthyBurger extends BaseBurger {
    private String name;
    private int rukola;
    private int cottageChees;

    public HealthyBurger() {
        super("Brawn rye bread roll", 0);
        this.name = "Healthy Burger";
    }

    public void addRukola() {
        System.out.println("Adding rukola...");
        super.addPrice(1.75d);
        this.rukola = 1;
    }

    public void addCottageChees() {
        System.out.println("Adding Cottage Chees...");
        this.addPrice(4.45d);
        this.rukola = 1;
    }

    public String getName() {
        return name;
    }

    public int getRukola() {
        return rukola;
    }

    public int getCottageChees() {
        return cottageChees;
    }
}
