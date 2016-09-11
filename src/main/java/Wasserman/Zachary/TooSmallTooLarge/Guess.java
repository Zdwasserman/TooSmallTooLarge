package Wasserman.Zachary.TooSmallTooLarge;

import java.util.Scanner;

/**
 * Created by zacharywasserman on 9/11/16.
 */
public class Guess {
    private int guess;
    private int numOfGuesses;
    private int lastGuess;
    public int makeGuess() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number 1 - 100: ");
        guess = input.nextInt();
        previousGuess(guess, lastGuess);
        lastGuess = guess;
        return guess;
    }

    public int getGuess() {
        return guess;
    }

    public void guessCheck(int guess, int secretNum) {
        if (this.guess != secretNum) {
            smallLarge(this.guess, secretNum);
            guessCheck(getGuess(), secretNum);
            }

        else{
            System.out.println("Correct!");
            System.out.println("Number of guesses: " +numOfGuesses);
        }



    }
    public void smallLarge(int guess, int secretNum){
        if(this.guess < secretNum){
            System.out.println("Too Small!");
        }
        if(this.guess > secretNum){
            System.out.println("Too large!");
        }
        System.out.println("Guess again, Bruh!");
        System.out.println(" ");
        makeGuess();
    }
    public void previousGuess(int guess, int lastGuess){
        if (guess != lastGuess){
            numOfGuesses++;
        }
    }
}
