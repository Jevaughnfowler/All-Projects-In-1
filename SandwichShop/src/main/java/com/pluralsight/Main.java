package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0; // Start with invalid input so the loop runs

        double regular = 5.45;
        double large = 8.95;
        double finalPrice = 0.0;

        System.out.println("Welcome to Jevaughn's Sandwich Shop!");
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

        // Ask for age for discount
        System.out.print("\nPlease enter your age for available discounts: ");
        int age = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid age.");
                scanner.next(); // Clear invalid input
            }
        }

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

        // Apply discount if any
        finalPrice = finalPrice - (finalPrice * discount);
        System.out.printf("Final price after discount: $%.2f\n", finalPrice);

        scanner.close();
    }
}