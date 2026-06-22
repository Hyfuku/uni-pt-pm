package tripleFinder;

import cards.Card;

import java.util.ArrayList;
import java.util.HashMap;

public class CardProcessor implements CardProcessor_I {

    private final HashMap<Card.Rank, ArrayList<Card>> storage = new HashMap<>();

    @Override
    public Object process(Card card) {
        Card.Rank rank = card.getRank();

        if (!storage.containsKey(rank)) {
            storage.put(rank, new ArrayList<>());
        }

        storage.get(rank).add(card);

        if (storage.get(rank).size() == 3) {
            ArrayList<Card> triple = storage.get(rank);
            return triple.toArray(new Card[0]);
        }
        return null;
    }

    @Override
    public void reset() {
        storage.clear();
    }
}
