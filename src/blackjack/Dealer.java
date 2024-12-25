package blackjack;

class Dealer extends Player {
    Dealer() {
        super("blackjack.Dealer");
    }

    @Override
    public String respond() {
        if (getHandScore() > 16) return "stay";
        else return "hit";
    }
}
