// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package simplifiedBlackJack;


import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * Simplified Black Jack Agent - see task
 *
 * @author  (your name(s))
 * @version (a version number or a date)
 */
public class SimplifiedBlackJackAgent {

    public void playBlackJack(){
        Deck deck = new Deck();
        int sum = 0;
        while (sum < 17) {
            Card card = deck.deal();
            int value;
            if (isAce(card)) {
                if (sum + 11 > 21) {
                    value = 1;
                } else {
                    value = 11;
                }
            } else if (card.getRank().value() > 10) {
                value = 10;
            } else {
                value = card.getRank().value();
            }
            Card.printCardArray(card);
            sum += value;
            System.out.printf("Karten-Wert: %d, Summe: %d%n", value, sum);
        }  
        System.out.printf("Endstand: %d%n", sum);
        	
        System.out.flush();
    }//method()
    
    private boolean isAce(Card card)
    {
		if (card.getRank() == Rank.ACE) {
			return true;
			};
		return false;
    }
    
   

}//class
