package Deck;

public class Card {
    public final Rank rank;
    public final Suite suite;

    public Card(Rank rank, Suite suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public String toString() {
        return rank.name() + " of " + suite.name();
    }
}
