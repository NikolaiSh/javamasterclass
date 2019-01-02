package com.example.javacomplete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <=100; i++) {
            squares.add(i * i * i);
            cubes.add(i * i);
        }

        System.out.println("Squares contain " + squares.size() + " elements");
        System.out.println("Cubes contain " + cubes.size() + " elements");

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements");

        Set<Integer> intersection = new HashSet<>(cubes);
        intersection.retainAll(squares);
        System.out.println("Intersection contains " + intersection.size() + " elements:");
        for (int i : intersection) {
            System.out.println("\t" + i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "err", "is", "human", "to", "fogive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

    }
}
