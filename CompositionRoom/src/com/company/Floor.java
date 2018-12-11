package com.company;

public class Floor {
    private double width;
    private double length;
    private String cover;

    public Floor(double width, double length) {
        this(width, length, "concrete");
    }

    private Floor(double width, double length, String cover) {
        this.width = width;
        this.length = length;
        this.cover = cover;
    }

    public void newFloorCover(String cover) {
        this.cover = cover;
        System.out.println("New floor cover is " + cover);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String getCover() {
        return cover;
    }
}
