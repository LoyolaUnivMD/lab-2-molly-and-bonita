// Programmers:  [your names here]
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

class Lab2 {
    public static void main(String[] args) {
        long prize = 225938745L;
        Scanner input = new Scanner(System.in);

        //Making object rand
        Random rand = new Random();

        //Making object decimal format
        DecimalFormat dfmt = new DecimalFormat("##00");

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        System.out.print("What's your name? ");
        String customerName = input.nextLine();

        String lottery = "";
        int num = 0;
        int numFormat = 0;
        for(int i=0 ; i < 10 ; i++) {
            for(int j=0 ; j < 6 ; j++) {

                num = rand.nextInt(99);
                //DecimalFormat numFormat = dfmt.format(num);
                System.out.println(dfmt.format(num));
//

//                String lottery =
            }
        }

    }
}
