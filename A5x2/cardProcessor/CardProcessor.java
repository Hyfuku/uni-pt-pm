// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package cardProcessor;


import cards.Card;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;


/**
 * CardProcessor removing duplicates - see task
 * 
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 */
public class CardProcessor {
    
    /**
     * Die Methode removeDuplicates() entfernt Doppelte aus den übergebenen Karten.
     * Welche Karte (von den mehrfach vorhandenen Karten) übrig bleibt ist egal.
     * Wichtig ist, dass es bei den als Ergebnis abgelieferten Katen keine Doppelten gibt,
     * aber sonst jede Karten erhalten bleibt. 
     *
     * @param cards     die übergebenen Karten aus denen die Doppelten entfernt werden.
     * 
     * @return          die Karten befreit von Doppelten.
     */

    public Card[] removeDuplicates(Card[] cards) {
        HashSet<Card> set = new HashSet<>(Arrays.asList(cards)); // → man würde eigentlich ein stream nutzten mit toSet
        return set.toArray(new Card[0]); // → man könnte auch ein forLoop nehmen, aber man müsste das halt zwischenspeichern
    }
}//class
