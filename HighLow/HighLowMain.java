package HighLow;

import java.util.Scanner;

public class HighLowMain {

    public static void main(String[] args) {

        Scanner readScanner = new Scanner(System.in);
        HighLow guess = new HighLow();
        Outcome outcome;

        int i = 1;
        while (guess.canMakeGuess()) {
            System.out.print(String.format("Guess %s: ", i));
            outcome = guess.highLow(Integer.parseInt(readScanner.nextLine()));
            if (outcome != Outcome.Correct && outcome != Outcome.NoMoreGuesses) {
                System.out.println(String.format("Hint: %s",
                        outcome == Outcome.Low
                                ? "higher"
                                : outcome == Outcome.High
                                ? "lower"
                                : ""));
            } else if (outcome == Outcome.NoMoreGuesses) {
                System.out.println(String.format("Oh noes, no more guesses! " +
                        "Please try again. The number was %s.", guess.number()));
            } else {
                System.out.println(String.format("Correct after %s guesses!", i));
            }
            i += 1;
        }

    }
}
