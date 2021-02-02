package com.tts;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        boolean keepGoing = false;

        System.out.println("Hello World!");
        System.out.println("Welcome to AddressBook");
        System.out.println("1) Add an entry");
        System.out.println("2) Remove an entry");
        System.out.println("3) Search for a specific entry");
        System.out.println("4) Print AddressBook");
        System.out.println("5) Delete Address Book");
        System.out.println("6) Quit");
        System.out.println("Please choose what you'd like to do with the database:");
            int userInput = kb.nextInt();

        switch (userInput){
            case 1:
                System.out.println("firstName");
                String firstName = kb.next();
                System.out.println("lastName");
                String lastName = kb.next();
                System.out.println("phoneNumber");
                String phoneNumber = kb.next();
                System.out.println("emailAddress");
                String emailAddress = kb.next();
                System.out.println("Added new entry!");
                main(args);


            case 2:
                System.out.println("Enter an email to remove records");
                kb.next();
                System.out.println("Deleted the following entry: "
                        + "******** " +
                        "First Name: Test " +
                        "Last Name: Test " +
                        "Phone Number: 1111111111 " +
                        "email: " + "emailAddress "
                        + "******** ");
                main(args);
                break;


            case 3:
                System.out.println("1) First Name " +
                        "2) Last Name " +
                        "3) Phone Number " +
                        "4) Email Address " +
                        "Chose a search type ");
                        kb.next ();
                System.out.println("Enter your search: ");
                        kb.next ();
                System.out.println("******** " +
                        "First Name: Test " +
                        "Last Name: Test " +
                        "Phone Number: 1111111111 " +
                        "email: " + "emailAddress "
                        + "******** ");
                main(args);
                break;


            case 4:
                System.out.println("******** " +
                        "First Name: Test " +
                        "Last Name: Test " +
                        "Phone Number: 1111111111 " +
                        "email: " + "emailAddress "
                        + "******** ");

                System.out.println("******** " +
                        "First Name: Test " +
                        "Last Name: Test " +
                        "Phone Number: 1111111111 " +
                        "email: " + "emailAddress "
                        + "******** ");
                main(args);
                break;


            case 5:
                System.out.println("AddressBook has been deleted. " +
                        "Goodbye.");
                main(args);
                break;


            case 6:
                System.out.println("Quit");
                System.out.println("Goodbye");
                break;


            default:
                System.out.println("Return to Main Menu");
                main(args);
                break;
        }

    }

}
