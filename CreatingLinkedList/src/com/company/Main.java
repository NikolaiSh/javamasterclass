package com.company;

public class Main {

    public static void main(String[] args) {

        String text = "Melbourne Darwin AliceSpring Abey Seattle";
        String[] textToArray = text.split(" ");

        MyLinkedList myLinkedList = new MyLinkedList();
        for(int i = 0; i < textToArray.length; i++) {
            myLinkedList.addItem(new Item(textToArray[i]));
        }

        myLinkedList.printMyLinkedList();

        myLinkedList.removeItem("Melbourne");

        myLinkedList.printMyLinkedList();

        myLinkedList.removeItem("AliceSpring");

        myLinkedList.printMyLinkedList();

        myLinkedList.removeItem("Abey");

        myLinkedList.printMyLinkedList();


        for(int i = 0; i < textToArray.length; i++) {
            myLinkedList.addItem(new Item(textToArray[i]));
        }

        myLinkedList.printMyLinkedList();
    }
}
