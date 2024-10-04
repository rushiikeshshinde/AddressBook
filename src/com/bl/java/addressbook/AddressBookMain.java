package com.bl.java.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AddressBook addressBook = new AddressBook(); // Create an AddressBook object

        System.out.println("Welcome to Address Book Program!");

        boolean exit = false;

        // Loop to add,edit,delete and display contacts
        while(!exit){
            System.out.println("1. Add New Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Edit Existing Contacts");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = in.nextInt();
            in.nextLine(); // Consume newline

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
                    // Edit an existing contact
                    System.out.println("Enter First Name of the contact to edit: ");
                    String editFirstName = in.nextLine();

                    System.out.println("Enter Last Name of the contact to edit: ");
                    String editLastName = in.nextLine();

                    // Call editContactByName method
                    addressBook.editContactByName(editFirstName,editLastName);
                    break;

                case 4:
                    // Delete an existing contact
                    System.out.println("Enter First Name of the contact to delete: ");
                    String deleteFirstName = in.nextLine();

                    System.out.println("Enter Last Name of the contact to delete: ");
                    String deleteLastName = in.nextLine();

                    // Call deleteContactByName method
                    addressBook.deleteContactByName(deleteFirstName,deleteLastName);
                    break;

                case 5:
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
