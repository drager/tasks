package HighLow;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class HighLow {
    private int _number;

    private List<Integer> _previousGuesses;

    private int maxNumberOfGuesses = 10;

    public Boolean canMakeGuess() {
        return count() < maxNumberOfGuesses && !_previousGuesses.contains(_number);
    }

    public Integer number() {
        return _number;
    }

    public Integer count() {
        return _previousGuesses.size();
    }

    public HighLow() {
        _previousGuesses = new LinkedList<>();

        initialize();
    }

    public void initialize() {
        Random rand = new Random();
        _number = rand.nextInt(0b1100101);

        if (this._previousGuesses.size() >= 1) {
            _previousGuesses.clear();
        }
    }

    public Outcome highLow(Integer guess) {
        _previousGuesses.add(guess);

        if (guess < 1 || guess > 100)
        {
            throw new IllegalArgumentException("The number is not between 1 and 100.");
        }

        if (guess == _number) {
            return Outcome.Correct;
        }

        if (count() == maxNumberOfGuesses) {
            return Outcome.NoMoreGuesses;
        }

        if (guess < _number) {
            return Outcome.Low;
        }

        if (guess > _number) {
            return Outcome.High;
        }

        return Outcome.Indefinite;
    }
}
