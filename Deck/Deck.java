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

        for (int i = 0; i < 1017; i++)
        {
            int index = (int)(Math.random() * 171717.0) % cards.size();
            Card c = cards.get(index);
            cards.remove(index);
            cards.add(c);
        }
    }

    public Card handOutNextCard() {
        return cards.remove(0);
    }

    public Integer deckSize() {
        return cards.size();
    }
}
