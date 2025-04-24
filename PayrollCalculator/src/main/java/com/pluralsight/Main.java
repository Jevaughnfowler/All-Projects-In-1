package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your hours worked: ");
        float hoursWorked = scanner.nextFloat();

        System.out.println("Enter your pay rate: ");
        float payRate = scanner.nextFloat();


        scanner.nextLine();

        float totalPay;


        if (hoursWorked > 40) {
            float regularHours = 40;
            float overtimeHours = hoursWorked - 40;
            totalPay = (regularHours * payRate) + (overtimeHours * payRate * 1.5f);
        } else {
            totalPay = hoursWorked * payRate;
        }


        System.out.println(name + " Total Is $" + totalPay);

    }
}