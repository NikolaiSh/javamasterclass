package com.company;

import javafx.collections.transformation.SortedList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        myArray = sortArray(myArray);
        printArray(myArray);


    }

    public static void printArray(int[] arrayToPrint) {
        int arrayLength = arrayToPrint.length;
        for(int i = 0; i < arrayLength; i++) {
            System.out.println("arrayToPrint[" + i + "] = " + arrayToPrint[i]);
        }
    }



    public static int[] sortArray(int[] arrayToSort) {

        int arrayLength = arrayToSort.length;

        for(int i = 0; i < arrayLength; i++) {
            int j = 0;
            while(j <  arrayLength) {
                if (arrayToSort[i] > arrayToSort[j]) {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[i];
                    arrayToSort[i] = temp;
                }
                ++j;
            }
        }

        System.out.println("Array sorted...");

        return arrayToSort;
    }


    public static int[] getIntegers(int amountOfInt) {
        Scanner scanner = new Scanner(System.in);

        int[] newArray = new int[amountOfInt];

        System.out.println("Enter " + amountOfInt + " integer numbers");

        for(int i = 0; i < amountOfInt; i++) {
            newArray[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return newArray;

    }
}
