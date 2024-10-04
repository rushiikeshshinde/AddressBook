package com.bl.java.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    // Method to edit an existing contact by name
    public void editContactByName(String firstName, String lastName) {
        Scanner in = new Scanner(System.in);
        boolean contactFound = false;

        for(Contact contact : contactList) {
            if(contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)) {
                contactFound = true;

                // Display the existing contact details
                System.out.println("Contact Found: "+contact);

                // Prompt user for new details
                System.out.println("Enter new Address: ");
                contact.setAddress(in.nextLine());

                System.out.println("Enter new City: ");
                contact.setCity(in.nextLine());

                System.out.println("Enter new State: ");
                contact.setState(in.nextLine());

                System.out.println("Enter new ZipCode: ");
                contact.setZip(in.nextLine());

                System.out.println("Enter new Phone Number: ");
                contact.setPhoneNumber(in.nextLine());

                System.out.println("Enter new Email: ");
                contact.setEmail(in.nextLine());

                System.out.println("Contact updated successfully!");
                break;
            }
        }

        if(!contactFound) {
            System.out.println("Contact not found.");
        }
    }

}
