package com.company;

public class Wall {
    private double length;
    private double height;
    private String color;

    public Wall(double length, String color) {
        this.length = length;
        this.height = 3;
        this.color = color;
    }

    public void newWallColor(String color) {
        this.color = color;
        System.out.println("New wall color is " + color);
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}
