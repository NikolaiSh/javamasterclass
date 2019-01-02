package com.example.javacomplete;

import java.util.Scanner;

public class X {
    private int x;

    public X() {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        this.x = x.nextInt();
        x.nextLine();
    }

    public void x(){
        System.out.println("The time table of " + this.x + " is:");
        for(int x = 1; x <= 12; x++) {
            System.out.println(x * this.x);
        }
    }

}
