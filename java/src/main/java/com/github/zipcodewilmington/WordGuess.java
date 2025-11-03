package com.github.zipcodewilmington;

import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */ 
public class WordGuess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome to Word Guess! Try to guess the word I'm thinking of.");
        System.out.println("You have 3 attempts. Good luck!😈");
        System.out.println("Type quit to exit the game at any time.");
        System.out.println("Please enter your first guess:");

        while (true) {
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("quit")) {
            System.out.println("Thanks for playing! Goodbye!");
            break;
        }

        System.out.println("You guessed: " + userInput);

         }

         scanner.close();
    }
}
