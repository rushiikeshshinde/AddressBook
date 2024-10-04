package com.bl.java.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Address Book Program!");

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


        // Displaying the contact details
        System.out.println("Contact Added: "+contact);

    }

}
