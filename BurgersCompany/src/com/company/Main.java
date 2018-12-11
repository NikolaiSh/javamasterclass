package com.company;

public class Main {

    public static void main(String[] args) {
        BaseBurger hamburger = new BaseBurger("Bread Roll", 1);
        hamburger.getPrice();
        hamburger.addTomato();
        hamburger.addPickles();
        hamburger.addLettuce();
        hamburger.getPrice();

        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.getPrice();
        healthyBurger.addPickles();
        healthyBurger.addCottageChees();
        healthyBurger.getPrice();

        DeluxBurger deluxBurger = new DeluxBurger("Delux Bread roll");
        deluxBurger.getPrice();
    }
}
