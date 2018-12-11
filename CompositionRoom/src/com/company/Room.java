package com.company;

public class Room {
    private Floor floor;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Window window;

    public Room(Floor floor, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Window window) {
        this.floor = floor;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.window = window;
    }

    public void changeTheRoom (String floorCover, String wallColor) {
        floor.newFloorCover(floorCover);
        wall1.newWallColor(wallColor);
        wall2.newWallColor(wallColor);
        wall3.newWallColor(wallColor);
        wall4.newWallColor(wallColor);
    }

    public Floor getFloor() {
        return floor;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Window getWindow() {
        return window;
    }
}
