package blackjack;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.IntStream;

class Deck {
    private LinkedList<Card> container;
    int size = 52;

    Deck() {
        container = new LinkedList<>();
        Arrays.asList(Suit.values()).forEach(suit ->
                IntStream.range(1, 14).forEach(rank -> container.add(new Card(suit, rank)))
        );
        Collections.shuffle(container);
    }

    void reset() {
        container.clear();
        Arrays.asList(Suit.values()).forEach(suit ->
                IntStream.range(1, 14).forEach(rank -> container.add(new Card(suit, rank)))
        );
        Collections.shuffle(container);
    }

    boolean isEmpty() {
        return size == 0;
    }

    Card pop() {
        size--;
        return container.pop();
    }
}
