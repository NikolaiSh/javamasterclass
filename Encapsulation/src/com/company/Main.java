package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(true);
        System.out.println("Toner level is " + printer.getTonerLevel() + "%");
        printer.fillingUpTheToner();
        System.out.println("Toner level is " + printer.getTonerLevel() + "%");
        printer.printing(120);
        printer.printing(100);
        printer.printing(25);
    }
}
