package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex) {
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public void fillingUpTheToner () {
        this.tonerLevel = 100;
        System.out.println("Toner filled up");
    }

    public void printing (int pagesPrinted) {
        System.out.println("Printing " + pagesPrinted + " page(s)");
        if(duplex) {
            this.pagesPrinted += pagesPrinted / 2 + pagesPrinted % 2;
        } else {
            this.pagesPrinted += pagesPrinted;
        }

        System.out.println("Number of printed pages is " + this.getPagesPrinted());

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
