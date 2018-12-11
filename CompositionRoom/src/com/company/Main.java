package com.company;

public class Main {

    public static void main(String[] args) {

        Floor floor = new Floor(5, 8);
        Wall wall1 = new Wall(8,"white");
        Wall wall2 = new Wall(8,"white");
        Wall wall3 = new Wall(5,"white");
        Wall wall4 = new Wall(5,"white");
        Window window = new Window(1.5, 1.5);

        Room room = new Room(floor, wall1, wall2, wall3, wall4, window);
        System.out.println(room.getFloor().getCover());
        System.out.println(room.getWall1().getColor());
        room.getFloor().newFloorCover("wood");
        room.getWall2().newWallColor("yellow");
        room.changeTheRoom("carpet","blue");


    }
}
