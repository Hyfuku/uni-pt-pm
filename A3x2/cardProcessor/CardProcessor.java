package cardProcessor;

import cards.*;

/**
 * CardProcessor - sort cards in-place - see task
 */
public class CardProcessor {


    public void sortCards(final Card[] cardsToBeSorted) {
        if (cardsToBeSorted == null || cardsToBeSorted.length == 0) {
            return;
        }

        Card[][] cardMatrix = generateCardMatrix(cardsToBeSorted);

        // In-Place zurückschreiben: Spalten absteigend (Ass→2), Zeilen aufsteigend (Club→Diamond)
        int index = 0;
        for (int col = 12; col >= 0; col--) {      // 1. Priorität: Rang absteigend
            for (int row = 0; row < 4; row++) {    // 2. Priorität: Club, Pik, Herz, Karo
                if (cardMatrix[row][col] != null) {
                    cardsToBeSorted[index++] = cardMatrix[row][col];
                }
            }
        }
    }

    private Card[][] generateCardMatrix(Card[] givenCards) {
        Card[][] cardMatrix = new Card[4][13];

        for (Card card : givenCards) {
            int row = getSuitIndex(card);
            int col = card.getRank().value() - 2;  // value() 2..14 → Index 0..12
            cardMatrix[row][col] = card;
        }

        return cardMatrix;
    }

    private int getSuitIndex(Card card) {
        return switch (card.getSuit()) {
            case CLUB -> 0;
            case SPADES -> 1;
            case HEART -> 2;
            case DIAMOND -> 3;
        };
    }
}