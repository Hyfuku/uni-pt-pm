package cardProcessor;

import static cards.Card.*;
import static cards.Card.Constant.*;
import cards.*;

/**
 * CardProcessor - sort cards in-place - see task
 */
public class CardProcessor {

	
    public Card[] sortCards(final Card[] cardsToBeSorted) {

        if (cardsToBeSorted == null || cardsToBeSorted.length == 0) {
            return cardsToBeSorted;
        }

        if (cardsToBeSorted.length > 52) {
            return cardsToBeSorted;
        }

        Card[][] cardMatrix = new Card[4][13];

        int clubIndex = 0;
        int spadeIndex = 0;
        int heartIndex = 0;
        int diamondIndex = 0;

        for (Card card : cardsToBeSorted) { //better in method (clean code) to lazy
            switch (card.getSuit()) {

                case CLUB:
                    cardMatrix[0][clubIndex++] = card;
                    break;
                    
                case SPADES:
                    cardMatrix[1][spadeIndex++] = card;
                    break;

                case HEART:
                    cardMatrix[2][heartIndex++] = card;
                    break;

                case DIAMOND:
                    cardMatrix[3][diamondIndex++] = card;
                    break;
                
            }
        }

        sortCardValue(cardMatrix);

        resolveCardMatrix(cardMatrix, cardsToBeSorted);
        return cardsToBeSorted;
    }


    private void sortCardValue(Card[][] cardMatrix) {
        for (Card[] row : cardMatrix) { //iterate through CardMatrix

            for (int n = row.length; n > 1; n--) { //Bubble Sort Implementation
                for (int i = 0; i < n - 1; i++) {

                    if (row[i] == null || row[i + 1] == null) { //Null Pointer Exception
                        continue;
                    }

                    if (row[i].getRank().value() < row[i + 1].getRank().value()) { 
                        Card temp = row[i]; //local Variable to sort
                        row[i] = row[i + 1];
                        row[i + 1] = temp;
                    }
                }
            }
        }
    }


    private void resolveCardMatrix(final Card[][] cardMatrix, final Card[] targetArray) {

        int i = 0;

        for (Card[] row : cardMatrix) {
            for (Card card : row) {
                if (card != null) {
                    targetArray[i++] = card;
                }
            }
        }
    }
}