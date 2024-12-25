package blackjack;

import java.util.HashMap;

enum Suit {
    SPADE('♠'), HEART('♡'), DIAMOND('♢'), CLOVER('♣');

    static final HashMap<Suit, Color> SUIT_TO_COLOR = new HashMap<>();

    static {
        SUIT_TO_COLOR.put(SPADE, Color.SPADE);
        SUIT_TO_COLOR.put(HEART, Color.HEART);
        SUIT_TO_COLOR.put(DIAMOND, Color.DIAMOND);
        SUIT_TO_COLOR.put(CLOVER, Color.CLOVER);
    }

    final char symbol;

    Suit(char symbol) {
        this.symbol = symbol;
    }
}
