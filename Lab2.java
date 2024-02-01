// Programmers: Bonita Rodrigues, Molly Kyle
// Course:  CS 212, Dr.Nweke
// Due Date: 2/3/24
// Lab Assignment: Lab2 Lottery Tickets
// Problem Statement:  This program will output 10 lottery tickets (each having 6 numbers) to the user.
// Input: name
// Output: 10 tickets (each w/ 6 numbers), Outputs good luck statement (w/ users first name), estimated jackpot
// Credits: none

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

class Lab2 {
    public static void main(String[] args) {
        long prize = 225938745L;
        Scanner input = new Scanner(System.in);

        //Making object rand
        Random rand = new Random();
        //Making object dfmt
        DecimalFormat dfmt = new DecimalFormat("#00");

        // Opening statements
        System.out.println("CS 212 - Lab 2");
        System.out.println("\nThis program generates 10 lottery tickets.");
        // User input (users name)
        System.out.print("What's your name? ");
        String customerName = input.nextLine();
        System.out.println("\nHere is your ticket: ");
        // Initializes num used later for random numbers

        // Nested for loop (10 tickets each with 6 numbers)
        for(int i=0 ; i < 10 ; i++) {
            for(int j=0 ; j < 6 ; j++) {
                int num = rand.nextInt(99);
                System.out.print(dfmt.format(num) + " ");
            }
            // Shifts to the next line (so tickets are formatted correctly)
            System.out.println(" ");
        }

        // Checks if the user entered last name and takes only the first name
        customerName = customerName.strip();
        if (customerName.contains(" ")) {
            String[] smth = customerName.split(" "); // turns string into a list
            customerName = smth[0]; // calls first item in list (first name)
        }

        // Ending statements
        System.out.println("\nGood luck " + customerName + "!");
        System.out.println("The Estimated Jackpot:\n" + prize);

    }
}
