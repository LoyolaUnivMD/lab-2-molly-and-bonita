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

        Scanner input = new Scanner(System.in);
        //Making object rand (for lottery numbers)
        Random rand = new Random();
        //Making object lotNums (for lottery numbers)
        DecimalFormat lotNums = new DecimalFormat("#00");
        //Making object jackpot (for estimated jackpot)
        DecimalFormat jackpot = new DecimalFormat("#0,000.00");

        // Opening statements
        System.out.println("CS 212 - Lab 2");
        System.out.println("\nThis program generates 10 lottery tickets.");

        // User input (users name)
        System.out.print("What's your name? ");
        String customerName = input.nextLine();

        //Ask for amount they want to gamble
        System.out.println("How much money would you like to bet?");
        double BetAmount = input.nextFloat();

        // Checks if the user entered last name and takes only the first name
        customerName = customerName.strip();
        if (customerName.contains(" ")) {
            String[] smth = customerName.split(" "); // turns string into a list
            customerName = smth[0]; // calls first item in list (first name)
        }


        System.out.println("Great! " + customerName + " wants to play $" + jackpot.format(BetAmount));
        System.out.println("-".repeat(20));
        System.out.println("Here is your ticket: ");


        // Nested for loop (10 tickets each with 6 numbers)
        for(int i=0 ; i < 10 ; i++) {
            for(int j=0 ; j < 6 ; j++) {
                int num = rand.nextInt(99);
                //raise amount bet by 1.75 every time number generated matches one of the winning numbers
                if (num == 3 ||  num == 5 || num == 16 || num == 58 || num == 59 || num == 11){
                    BetAmount = Math.pow(BetAmount, 1.75);
                }
                System.out.print(lotNums.format(num) + " ");
            }
            // Shifts to the next line (so tickets are formatted correctly)
            System.out.println(" ");
        }

        // Ending statements
        System.out.println("-".repeat(20)); // better way to repeat characters/strings
        System.out.println("Good luck " + customerName + "!");
        System.out.println("-".repeat(20));
        System.out.println("Your winnings are:\n" + "$" + jackpot.format(BetAmount)); //Decimal format
        System.out.println("-".repeat(20));

    }
}
