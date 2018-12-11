package com.company;

public class BaseBurger {
    private String name;
    private String breadRollType;
    private int meat;
    private double price;
    private int lettuce;
    private int tomato;
    private int carrot;
    private int pickles;

    public BaseBurger (String breadRollType, int meat){
        this.name = "Base Burger";
        this.breadRollType = breadRollType;
        this.meat = meat;
        if(meat == 1) {
            this.price = 8.50d;
        } else {
            this.price = 6.00d;
        }
    }

    public BaseBurger(String breadRollType, int meat, double price, int lettuce, int tomato, int carrot, int pickles) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.pickles = pickles;
    }



    public double getPrice() {
        System.out.println(getClass().getSimpleName() + " costs " + this.price + " $");
        return this.price;
    }

    public void addPrice(double price) {
        this.price += price;
    }

    public void addLettuce() {
        System.out.println("Adding lettuce... The price of lettuce is 2.20 $");
        this.addPrice(2.20d);
        this.lettuce = 1;
    }

    public void addMeat() {
        System.out.println("Adding meat...  The price of meat is 2.50 $");
        this.addPrice(2.50d);
        this.meat = 1;
    }

    public void addTomato() {
        System.out.println("Adding tomato... The price of tomato is 3.50 $");
        this.addPrice(3.50d);
        this.tomato = 1;
    }

    public void addCarrot() {
        System.out.println("Adding carrot... The price of carrotr is 2.00 $");
        this.addPrice(2.00d);
        this.carrot = 1;
    }

    public void addPickles() {
        System.out.println("Adding pickles... The price of pickles is 4.15 $");
        this.addPrice(4.15d);
        this.pickles = 1;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public int getMeat() {
        return meat;
    }

    public int getLettuce() {
        return lettuce;
    }

    public int getTomato() {
        return tomato;
    }

    public int getCarrot() {
        return carrot;
    }

    public int getPickles() {
        return pickles;
    }
}
