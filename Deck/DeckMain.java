package Deck;

public class DeckMain {
    public static void main(String[] args) {
        Deck myDeck = new Deck();

        System.out.println(myDeck.cards);

        myDeck.shuffle();

        System.out.println(myDeck.cards);

        System.out.println(myDeck.handOutNextCard());

        System.out.println(myDeck.deckSize());

        myDeck.shuffle();

    }
}
