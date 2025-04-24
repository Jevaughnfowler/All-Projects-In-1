package com.pluralsight;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please Enter first number ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please Enter second number ");
        int secondNumber = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Possible calculations: \n" +
                "(A) Add \n" +
                "(S) Subtract \n" +
                "(M) Multiply \n" +
                "(D) Divide");

        System.out.println("Please select an option: ");
        String choice = scanner.next().trim().toUpperCase();


        switch (choice){
            case "A":
                System.out.println("Answer is " + (firstNumber + secondNumber));
                break;
            case "S":
                System.out.println("Answer is " + (firstNumber - secondNumber));
                break;
            case "M":
                System.out.println("Answer is " + (firstNumber * secondNumber));
                break;
            case "D":
                System.out.println("Answer is " + (firstNumber / secondNumber));
                break;
        }


    }

}
