package com.company;

public class Main {

    public static void main(String[] args) {
        printFactors(32);

    }

    public static void printFactors(int number) {
        if(number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        int remain = number / 2;
        for(int i = 1; i <= remain; i++){
            if(number % i ==0) {
                System.out.println(i);
            }
        }
        System.out.println(number);

    }

//// Euclidean algorithm for computing the greatest common divisor (GCD) of two numbers
//
//    public static int getGreatestCommonDivisor(int first, int second) {
//
//        if(first < 10 || second < 10) {
//            return -1;
//        }
//
//        int remain;
//        do {
//            remain = first % second;
//            if(remain == 0) {
//                return second;
//            }
//            first = second;
//            second = remain;
//        } while (remain != 0);
//
//        return -1;
//    }



}
