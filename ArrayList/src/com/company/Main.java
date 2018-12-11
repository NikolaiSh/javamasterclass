package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone phone = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        while(!quit) {
            instruction();
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1:
                    printContacts();
                    //print list of contacts
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void updateContact(){
        System.out.print("Enter contact name to be updated: ");
        String name = scanner.nextLine();
        Contact oldContact = phone.findContactByName(name);
        if(oldContact != null) {
            System.out.print("Enter new contact name: ");
            String newName = scanner.nextLine();
            System.out.print("Enter new contact phone: ");
            String phoneNumber = scanner.nextLine();
            Contact newContact = new Contact(newName, phoneNumber);
            phone.modifyContact(oldContact, newContact);
        } else {
            System.out.println("Contact is not found");
        }
    }

    public static void instruction() {
        System.out.println("1 - print contacts");
        System.out.println("2 - add new contact");
        System.out.println("3 - update contact");
        System.out.println("4 - remove contact");
        System.out.println("5 - find contact");
        System.out.println("6 - quit");
    }

    public static void findContact(){
        System.out.print("Enter contact name to be found: ");
        String name = scanner.nextLine();
        if(phone.findContactByName(name) != null) {
            String phoneNumber = phone.findContactByName(name).getPhoneNumber();
            System.out.println("Phone number: " + phoneNumber);
        } else {
            System.out.println("Contact is not found");
        }
    }

    public static void printContacts() {
        if(!phone.getContacts().isEmpty()) {
            ArrayList<Contact> c = phone.getContacts();
            int lengthC = c.size();
            for (int i = 0; i < lengthC; i++) {
                c.get(i).printContact();
            }
        } else {
            System.out.println("Contacts have not inputed jet");
        }
    }

    public static Contact addNewContact(){
        System.out.print("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new contact phone: ");
        String phoneNumber = scanner.nextLine();
        phone.addContact(name, phoneNumber);
        if(phone.findContactByName(name) != null) {
            System.out.println("Contact \"" + name + "\" was added");
            return phone.findContactByName(name);
        }
        return null;
    }

    public static void removeContact(){
        System.out.print("Enter contact name to be deleted: ");
        String name = scanner.nextLine();
        if(phone.findContactByName(name) != null) {
            phone.remove(phone.findContactByName(name));
        } else {
            System.out.println("Contact is not found");
        }
    }
}
