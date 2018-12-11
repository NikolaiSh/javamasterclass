package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(356,56));

    }

    public static String getDurationString(int minutes, int seconds) {

        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        int hours = (int) (minutes / 60);
        minutes %= 60;
        return (hours + "h " + minutes + "m " + seconds + "s");
    }

    public static String getDurationString(int seconds) {

        if(seconds < 0) {
            return "Invalid valus";
        }

        int minutes = (int) (seconds / 60);
        seconds %= 60;

        return getDurationString(minutes, seconds);
    }
}
