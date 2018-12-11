package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void modifyContact(Contact oldContact, Contact newContact) {
        int position = this.searchContact(oldContact);
        this.getContacts().set(position, newContact);
    }

    public void remove (Contact contact) {
        this.getContacts().remove(searchContact(contact));
    }

    public void addContact(String contactName, String phoneNumber) {
        Contact newContact = new Contact();
        newContact.setName(contactName);
        newContact.setPhoneNumber(phoneNumber);
        this.getContacts().add(newContact);
    }

    private int searchContact (Contact contact) {
        return this.getContacts().indexOf(contact);
    }


    public Contact findContactByName(String name) {
        int position = -1;
        for(int i = 0; i < this.getContacts().size(); i++) {
            if(this.getContacts().get(i).checkName(name)){
                position = i;
            }
        }
        if(position > -1) {
            return this.getContacts().get(position);
        } else {
            return null;
        }
    }

}
