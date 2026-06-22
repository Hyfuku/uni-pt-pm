package cardComparator;


import cards.Card;

import java.util.Comparator;

import static cards.Card.Suit;


/**
 * Comparator for Cards defining "usual order"
 *
 * @author (your name(s))
 * @version (a version number or a date)
 */
public class UsualOrder implements Comparator<Card> {

    private int suitOrder(Suit suit) {
        switch (suit) {
            case CLUB:
                return 0;
            case SPADES:
                return 1;
            case HEART:
                return 2;
            case DIAMOND:
                return 3;
            default:
                return -1;
        }
    }

    @Override
    public int compare(Card c1, Card c2) {
        int rankCmp = Integer.compare(c2.getRank().ordinal(), c1.getRank().ordinal());
        if (rankCmp != 0) return rankCmp;
        return Integer.compare(suitOrder(c1.getSuit()), suitOrder(c2.getSuit()));
    }
}
