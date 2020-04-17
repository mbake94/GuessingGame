/*
Scanner class
create int for a guess
create int for random number
set boolean to true for while loop
generate random number from 1-10
ask user to guess number
set while loop to run until the number is guessed
if the number is guesst, set boolean to false to end loop

 */
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        Random rand = new Random();
        int guess;
        int randomNumber = rand.nextInt(10);
        boolean run = true;
        // System.out.print(randomNumber); // This line will give you the answer if you want to test is without guessing
        System.out.print("I'm thinking of a number between 1 and 10... Can you guess it? \n Enter number here: ");
        guess = keybd.nextInt();
        while (run = true) {
            guess = keybd.nextInt();
            if (guess != randomNumber) {
                System.out.print("Sorry, guess again..");
            } else {
                System.out.print("You guessed it!!!");
                run = false;
            }
        }

    }
}

