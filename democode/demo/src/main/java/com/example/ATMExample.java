package com.example;

import java.util.Scanner;

// Create the ATMExample class to implement ATM functionality
public class ATMExample {
    public static void main(String[] args) {
        // Declare and initialize balance, withdraw, and deposit
        int balance = 100000;
        int withdraw, deposit;

        // Create a scanner class object to get the user's choice
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform: ");

            // Get the choice from the user
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to be withdrawn: ");
                    // Get the withdrawal amount from the user
                    withdraw = sc.nextInt();

                    // Check whether the balance is greater than or equal to the withdrawal amount
                    if (balance >= withdraw) {
                        // Remove the withdrawal amount from the total balance
                        balance -= withdraw;
                        System.out.println("Please collect your money.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter the amount to be deposited: ");
                    // Get the deposit amount from the user
                    deposit = sc.nextInt();

                    // Add the deposit amount to the total balance
                    balance += deposit;
                    System.out.println("Your money has been successfully deposited.");
                    System.out.println();
                    break;

                case 3:
                    // Display the total balance of the user
                    System.out.println("Balance: " + balance);
                    System.out.println();
                    break;

                case 4:
                    // Exit from the menu
                    System.exit(0);
            }
        }
    }
}