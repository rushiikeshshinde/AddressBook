package com.bl.java.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contactList;

    // Constructor
    public AddressBook() {
        contactList = new ArrayList<>();
    }

    // Method to add a new contact
    public void addContact(Contact contact) {
        contactList.add(contact);
        System.out.println("Contact added successfully!");
    }

    // Method to display all the contacts
    public void displayContacts() {
        if(contactList.isEmpty()) {
            System.out.println("No contacts in Address Book.");
        }
        else {
            for(Contact contact : contactList) {
                System.out.println(contact);
            }
        }
    }

}
