package Package1;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

/*
 * This program should prompt user to enter a quote and store it
 * It should then prompt for quoter
 * finally it will print a statement with both the quote and quoter
*/
public class Solution03 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("What is the quote? ");
        String Quote = Input.nextLine();
        System.out.println("Who said it?");
        String Quotee = Input.nextLine();
        System.out.println(Quotee + " says, " + Quote + ".");
    }

}
