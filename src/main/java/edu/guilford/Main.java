package edu.guilford;
//Karen Anguiano Project 4
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /* Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a letter
        System.out.print("Enter a single letter: ");
        String response = scanner.nextLine();

        // Push the user to enter only a single character
        while (response.length() > 1) {
            System.out.print("Enter a SINGLE letter: ");
            response = scanner.nextLine();
        }

        // Converts the string to a char using charAt(0) method
        char letter = response.toUpperCase().charAt(0);

        // Initialize the point value
        int points = 0;

        // Determine the Scrabble score using if statements with compound logical operators
        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' ||
            letter == 'L' || letter == 'N' || letter == 'S' || letter == 'T' || letter == 'R') {
            points = 1;
        } else if (letter == 'D' || letter == 'G') {
            points = 2;
        } else if (letter == 'B' || letter == 'C' || letter == 'M' || letter == 'P') {
            points = 3;
        } else if (letter == 'F' || letter == 'H' || letter == 'V' || letter == 'W' || letter == 'Y') {
            points = 4;
        } else if (letter == 'K') {
            points = 5;
        } else if (letter == 'J' || letter == 'X') {
            points = 8;
        } else if (letter == 'Q' || letter == 'Z') {
            points = 10;
        } else {
            System.out.println("Invalid input. Please enter a valid letter.");
            return;
        }

        // Output the point value
        System.out.println("The Scrabble point value for '" + letter + "' is: " + points); */

        System.out.println("Rock Paper Scissors");
        System.out.println("Enter your choice: rock, paper, or scissors"); 
        //these print statements inform the player of the game 

        Scanner scanner = new Scanner(System.in); //scanner object to read input 
        int choice; //variable to store the random number for the computer's cpice 
        char comp = 's'; //character: variable to store computer's choice 
        Random rand = new Random();

        String response = "whatever";
        char play ='r'; 
        //character: variable to store player's choice 


        /* while ((play != 'r') && (play != 'p') && (play != 's')) { 
            System.out.print("Type rock, paper, or scissors: "); //the while loop keeps askign for input until valid choice is made 
        response = scanner.nextLine();
        response = response.toLowerCase(); //converts the response to lowercase
        play = response.charAt(0);
        System.out.println(play);
        } */

        choice = rand.nextInt(0,4);
        System.out.println("integer sum" + choice);


        String feedback = "You threw "; //preparing feedback based on player's choice

        if (play == 'r') { 
            feedback += "rock."; //if player chooses 'r', feedback prints rock
        } // using "+=" when there is more than one if statement, because you are adding onto the feedback choices
    
        if (play == 'p') {
            feedback += "paper. "; //if player chooses 'p', feedback prints paper
        }
    
        if (play == 's') {
            feedback += "scissors. "; //if player chooses 's', feedback prints scissors 
        }

        System.out.println(feedback); //prints the player's choice feedback


        feedback = "Computer threw "; //Preparing feedback based on computer's choice

        if (comp == 'r') {
            feedback += "rock.";
        }
    
        if (comp == 'p') {
            feedback += "paper. ";
        }
    
        if (comp == 's') {
            feedback += "scissors. ";
        }

        System.out.println(feedback); //prints the computer's choice feedback


        feedback = ""; //Determine the outcome of the game

        if (comp == play) {
            feedback = "It's a draw!"; //if both choices (of play and comp) are equal to each other, feedback prints "its a draw"
        }

        System.out.println(feedback); //prints the draw feedback


        if (((play == 'r') && (comp == 'p')) || ((play == 'p') && (comp == 's')) || ((play == 's') && (comp == 'r'))) {
            feedback = "You lost!"; //determine if the player lost
        }
        System.out.println(feedback); //prints the loss feedback

        if (((play == 'p') && (comp == 'r')) || ((play == 's') && (comp == 'p')) || ((play == 'r') && (comp == 's'))) {            
            feedback = "You won!"; //determine if the player won
        }
        System.out.println(feedback); //prints the win feedback


        /* System.out.println(comp); */


    }

}