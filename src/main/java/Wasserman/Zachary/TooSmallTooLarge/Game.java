package Wasserman.Zachary.TooSmallTooLarge;

/**
 * Created by zacharywasserman on 9/10/16.
 */
public class Game {

    public static void main(String[] args) {
        Guess guess = new Guess();
        int secretNum = (int) (Math.random() * 100);
        guess.makeGuess();
        guess.guessCheck(guess.getGuess(), secretNum);

    }
}

