package com.example.javacomplete;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class myMap {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("'Java' key is already in the map");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("'Java' key added successfully");
        }

        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantic");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Begginers All Purpose Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");
//        System.out.println(languages.put("BASIC", "Begginers All Purpose Symbolic Instruction Code"));
//        System.out.println(languages.put("Lisp", "Therein lies madness"));

       // System.out.println(languages.get("Java"));

        if(languages.containsKey("Java")) {
            System.out.println("'Java' key is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println(languages.get("Java"));

        System.out.println("==========================");

      //  languages.remove("Lisp");
      //  if (languages.remove("Algol", "a family of algorithmic languages")) {
        if (languages.remove("Algol", "an algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed. key/value pair not found");
        }

        System.out.println(languages.replace("Lisp", "a functional programming language with imperative features"));
        System.out.println(languages.replace("Scala", "will not be added"));

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }


    }
}
