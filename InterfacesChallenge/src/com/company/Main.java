package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ISaveabale player = new Player("Mik", "warrior");
        ((Player) player).setAttack(15);
        ((Player)player).setDefence(9);
        System.out.println(player.toString());
        ((Player)player).setDefence(12);
        ((Player)player).setAttack(18);
        System.out.println(player);
        save(player);
        //load(player);
       // System.out.println(player);

        ISaveabale monster = new Monster("Slug", 20, 3, false);
        System.out.println(monster.toString());
        save(monster);
        ((Monster) monster).setName("Mug");
        ((Monster)monster).setAttack(17);
        ((Monster)monster).setDefence(5);
        ((Monster)monster).setIsMagic(true);
        System.out.println(monster.toString());
        save(monster);



    }

    private static List<String> readValue(){
        List<String> arrayList = new ArrayList<String>();

        boolean quit = false;
        while (!quit) {
            System.out.println("Available actions: \n" +
                    "0 - quit;\n" +
                    "1 - enter a string");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    arrayList.add(scanner.nextLine());
                    break;
            }
        }

        return arrayList;
    }

    private static void load(ISaveabale character) {
        List<String> listToLoad = readValue();
        if(!listToLoad.isEmpty()) {
            character.populate(listToLoad);
        } else {
            System.out.println("There are no values to load");
        }
    }

    private static boolean save(ISaveabale character){
        if(character.saveToMedium().size() > 0) {
            for(String value: character.saveToMedium()) {
                System.out.println("Now saving " + value);
            }
            return true;
        } else {
            System.out.println("There are no values to be save");
            return false;
        }
    }
}
