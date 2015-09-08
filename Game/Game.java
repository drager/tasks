package Game;

import Deck.*;

public class Game {
    Deck deck;

    public Boolean play() {
        int count = 1;
        deck = new Deck();
        deck.shuffle();

        while (deck.deckSize() > 0) {
            Card card = deck.handOutNextCard();
            if ((count == 1 && card.rank == Rank.Ace) ||
               (count == 2 && card.rank == Rank.Two) ||
               (count == 3 && card.rank == Rank.Three)) {
                return false;
            }
            count += 1;
            if (count > 3) {
                count = 1;
            }
        }
        return true;
    }
}
