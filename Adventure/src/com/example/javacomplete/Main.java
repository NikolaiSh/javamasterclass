package com.example.javacomplete;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        locations.put(0, new Location(0,"You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

//        directions.put("S", "S,South,go South,run South");
//            directions.put("W", "W,West,go West,run West");
//            directions.put("N", "N,North,go North,run North");
//            directions.put("E", "E,East,go East,run East");

        Map<String, String> directions = new HashMap<>();
        directions.put("EAST", "E");
        directions.put("SOUTH", "S");
        directions.put("SOUTH", "W");
        directions.put("NORTH", "N");

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
//        locations.get(1).addExit("Q", 0);

        locations.get(2).addExit("N", 5);
//        locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("W", 1);
//        locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);
//        locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
//        locations.get(5).addExit("Q", 0);

        int locat = 1;
        while(true) {
            System.out.println(locations.get(locat).getDescription());
            if (locat == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(locat).getExits();

            System.out.print("Available exits are ");
            for(String key : exits.keySet()) {
                System.out.print(key + " ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            if (direction.length() > 1) {
                String[] dir = direction.split(" ");
                for(String d : dir) {
                    if (directions.containsKey(d)) {
                        direction = directions.get(d);
                    }
                }
            }

            if (!exits.containsKey(direction)){
                System.out.println("You cannot go in that direction. Enter new direction");
            } else {
                locat = exits.get(direction);
            }
        }
    }
}
