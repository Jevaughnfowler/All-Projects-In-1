package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //loading my scanner for prompt input and assigning values

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        double regular = 5.45;
        double large = 8.95;
        double finalPrice = 0.0;

        System.out.println("Welcome to Don's Sandwich Shop!");
        System.out.println("Would you like to place an order?");
        System.out.println("Please look at the menu options closely:");
        System.out.println("1: Regular - Base price $5.45");
        System.out.println("2: Large - Base price $8.95");

        while (true) {
            System.out.print("Choose your sandwich size (1 or 2): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    break;
                } else {
                    System.out.println("Invalid number. Please enter 1 or 2.");
                }
            } else {
                System.out.println("That's not a number. Try again.");
                scanner.next();
            }
        }

        if (choice == 1) {
            finalPrice = regular;
            System.out.println("You chose Regular. Price: $" + regular);
        } else {
            finalPrice = large;
            System.out.println("You chose Large. Price: $" + large);
        }

        scanner.nextLine();

        //asking the customer if they want the sandwich loaded 

        System.out.println("Would you like your sandwich loaded? (yes/no)");
        String select = scanner.nextLine().trim().toLowerCase();

        if (select.equals("yes")) {
            System.out.println("Good choice!" +
                    "\nYou have two options:" +
                    "\n1: Regular Loaded - $1.00" +
                    "\n2: Large Loaded - $1.75");

            int loadChoice = 0;
            while (true) {
                System.out.print("Please enter 1 for Regular or 2 for Large loaded: ");
                if (scanner.hasNextInt()) {
                    loadChoice = scanner.nextInt();
                    if (loadChoice == 1) {
                        finalPrice += 1.00;
                        break;
                    } else if (loadChoice == 2) {
                        finalPrice += 1.75;
                        break;
                    } else {
                        System.out.println("Invalid option. Choose 1 or 2.");
                    }
                } else {
                    System.out.println("That's not a number. Try again.");
                    scanner.next();
                }
            }
        }

        // Ask for age for discount
        System.out.print("\nPlease enter your age for available discounts: ");
        int age = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid age.");
                scanner.next();
            }
        }
        //checking the customers age for discount
        double discount = 0.0;

        if (age <= 17) {
            discount = 0.10;
            System.out.println("10% Discount Applied");
        } else if (age >= 65) {
            discount = 0.20;
            System.out.println("20% Discount Applied");
        } else {
            System.out.println("No discount applied.");
        }

        // totally calculation including discounts
        finalPrice = finalPrice - (finalPrice * discount);
        System.out.printf("Final price after discount: $%.2f\n", finalPrice);

        scanner.close();
    }
}