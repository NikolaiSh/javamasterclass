package com.company;

public class DeluxBurger extends BaseBurger {
    private String name;
    private int chips;
    private int drink;

    public DeluxBurger(String breadRollType) {
        super(breadRollType, 1, 15.50d, 0, 0, 0, 0);
        this.name = "Delux Burger";
        this.chips = 1;
        this.drink = 1;
    }

    @Override
    public void addLettuce() {
        System.out.println("Can`t add lettuce to Delux Burger");
    }

    @Override
    public void addMeat() {
        System.out.println("Can`t add meat to Delux Burger");
    }

    @Override
    public void addTomato() {
        System.out.println("Can`t add tomato to Delux Burger");
    }

    @Override
    public void addCarrot() {
        System.out.println("Can`t add carrot to Delux Burger");
    }

    @Override
    public void addPickles() {
        System.out.println("Can`t add pickles to Delux Burger");
    }

    public String getName() {
        return name;
    }

    public int getChips() {
        return chips;
    }

    public int getDrink() {
        return drink;
    }
}
