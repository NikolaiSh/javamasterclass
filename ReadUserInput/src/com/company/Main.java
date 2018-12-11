package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;

       //adding boolean flag
       //       boolean first = true;
       boolean hasNextInt;
       int input;

       while(true) {
           System.out.println("Enter next number:");
           hasNextInt = scanner.hasNextInt();
           if(hasNextInt) {
               input = scanner.nextInt();

//               With boolaean flag:
//               if(first) {
//                   first = false;
//                   min = input;
//                   max = input;
//               }

               // checking min, max
               if(input > max) {
                   max = input;
               }
               if(input < min) {
                   min = input;
               }

           } else {
               break;
           }
           scanner.nextLine();
       }

        System.out.println("min = " + min + ", max = " + max);

       scanner.close();

    }
}
