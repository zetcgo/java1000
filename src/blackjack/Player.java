package blackjack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

class Player {
    String name = "blackjack.Player";
    private ArrayList<Card> hand = new ArrayList<>();
    GameStatus status = GameStatus.HIT;
    Scanner scanner = new Scanner(System.in);


    Player(String name) {
        if (!name.isBlank()) this.name = name;
    }

    @Override
    public String toString() {
        String handAsString = hand.isEmpty() ? "Ø" : hand.stream().map(Card::toString).collect(Collectors.joining());
        return String.format("%s[name=%s,hand=%s,status=%s]",
                super.toString(), name, handAsString, status.toString().toLowerCase());
    }

    void reset() {
        hand.clear();
        status = GameStatus.HIT;
    }

    String getHandAsString() {
        String cardsInHand = hand.isEmpty() ? "Ø" : hand.stream().map(Card::toString).collect(Collectors.joining());
        return String.format("%s[%d]", cardsInHand, getHandScore());
    }

    int getHandScore() {
        int aces = 0;
        int score = 0;
        for (Card card : hand) {
            if (card.rank() == 1) aces++;
            score += Math.min(card.rank(), 10);
        }
        score += Math.min(aces, (21 - score) / 10) * 10;
        return score;
    }

    public Card drawCard(Deck deck) {
        Card card = deck.pop();
        hand.add(card);
        return card;
    }

    public String respond() {
        return scanner.next();
    }
}
