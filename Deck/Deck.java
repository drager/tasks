package Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    List<Card> cards = new ArrayList<>();

    public Deck() {
        for (Rank rank : Rank.values()) {
            for (Suite suite : Suite.values()) {
                cards.add(new Card(rank, suite));
            }
        }
    }

    public void shuffle() {
        if (cards.size() != 52) {
            throw new IllegalStateException("Less than 52 cards left in the deck!");
        }
        Collections.shuffle(cards);
    }

    public Card handOutNextCard() {
        return cards.remove(0);
    }

    public Integer deckSize() {
        return cards.size();
    }
}
