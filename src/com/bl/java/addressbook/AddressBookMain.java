package com.bl.java.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AddressBook addressBook = new AddressBook(); // Create an AddressBook object

        System.out.println("Welcome to Address Book Program!");

        boolean exit = false;

        // Loop to add multiple contacts
        while(!exit){
            System.out.println("1. Add New Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Exit");
            int choice = in.nextInt();
            in.nextLine();

            switch(choice){
                case 1:
                    // Taking input for contact details

                    System.out.println("Enter First Name;  ");
                    String firstName = in.nextLine();

                    System.out.println("Enter Last Name;  ");
                    String lastName = in.nextLine();

                    System.out.println("Enter Address");
                    String address = in.nextLine();

                    System.out.println("Enter City");
                    String city = in.nextLine();

                    System.out.println("Enter State");
                    String state = in.nextLine();

                    System.out.println("Enter Zip Code");
                    String zipCode = in.nextLine();

                    System.out.println("Enter Phone Number");
                    String phoneNumber = in.nextLine();

                    System.out.println("Enter Email");
                    String email = in.nextLine();

                    Contact contact = new Contact(firstName,lastName,address,city,state,zipCode,phoneNumber,email);

                    // Add the contact to Address Book
                    addressBook.addContact(contact);
                    break;

                case 2:
                    // Display all contacts
                    addressBook.displayContacts();
                    break;

                case 3:
                    // Exit the program
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid operation! Please try again.");
            }
        }

        in.close(); // Close the scanner

    }

}
