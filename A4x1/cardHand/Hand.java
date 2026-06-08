package cardHand;

import cards.Card;

import java.util.Arrays;

public class Hand {
    Card[] cards;

    Hand (Card... args) {
        if (args == null) {
            throw new IllegalArgumentException("Card array is empty");
        }

        Arrays.stream(args).forEach(card -> {
            if (card == null) throw new IllegalArgumentException("Card is null");
        });

        this.cards = args;
    }

    void add(Hand handToBeAdded) {
        add(handToBeAdded.cards);
    }

    void add(Card... cardsToBeAdded) {
        Card[] newCards = new Card[cards.length + cardsToBeAdded.length];
        for (int i = 0; i < cards.length; i++) {
            newCards[i] = cards[i];
        }

        for (int i = 0; i < cardsToBeAdded.length; i++) {
            newCards[cards.length + i] = cardsToBeAdded[i];
        }

        this.cards = newCards;
    }

    boolean isSuited() {
        if (this.cards.length == 0) return true;

        Card.Suit startSuit = this.cards[0].getSuit();

        for (Card card : this.cards) {
            if (startSuit != card.getSuit()) return false;
        }

        return true;
    }

    public Card[] getHandCards() {
        return this.cards;
    }

    public void setHandCards(Card... cards) {
        this.cards = cards;
    }
}
