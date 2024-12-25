package blackjack;

import java.util.Random;

class Game {
    Player user;
    Dealer dealer;
    Deck deck;

    Game(Player user) {
        System.out.println("Welcome to the blackjack.Blackjack!!!");
        this.user = user;
        this.dealer = new Dealer();
        this.deck = new Deck();
    }

    int proceed() {
        deck.reset();
        user.reset();
        dealer.reset();
        user.drawCard(deck);
        user.drawCard(deck);
        dealer.drawCard(deck);
        dealer.drawCard(deck);
        System.out.printf("This is your hand: %s\n", user.getHandAsString());

        Random random = new Random();
        Player player = random.nextBoolean() ? user : dealer;
        System.out.printf("%s will start the game.\n", player.name);

        game:
        while (user.status != GameStatus.STAY || dealer.status != GameStatus.STAY) {
            if (player.status == GameStatus.STAY) {
                System.out.printf("=== %s is staying right now. ===\n", player.name);
                player = player == user ? dealer : user;
                continue;
            }

            System.out.printf("=== %s's Turn! ===\n", player.name);
            while (true) {
                if (player == user) System.out.println("Type \"hit\" or \"stay\" for next action.");
                String response = player.respond();

                if (response.equals("hit")) {
                    System.out.printf("%s will hit this turn.\n", player.name);
                    Card card = player.drawCard(deck);
                    if (player == user) {
                        System.out.printf("You drawed %s!\n", card);
                        System.out.printf("This is your hand: %s\n", user.getHandAsString());
                    }
                    if (player.getHandScore() > 21) {
                        System.out.printf("Oops! %s busted!\n", player.name);
                        player.status = GameStatus.BUST;
                        break game;
                    }
                    break;
                } else if (response.equals("stay")) {
                    System.out.printf("%s will stay from this turn.\n", player.name);
                    player.status = GameStatus.STAY;
                    break;
                } else {
                    System.out.println("You typed wrong response. Try again!");
                }
            }
            player = player == user ? dealer : user;
        }

        System.out.println("=== GAME OVER ===");
        System.out.printf("%s's hand: %s\n", user.name, user.getHandAsString());
        System.out.printf("%s's hand: %s\n", dealer.name, dealer.getHandAsString());
        if (user.getHandScore() == dealer.getHandScore()) {
            System.out.println("You drawed...");
            return 0;
        } else {
            Player winner = user.status != GameStatus.BUST &&
                    (dealer.status == GameStatus.BUST || user.getHandScore() > dealer.getHandScore())
                    ? user : dealer;
            System.out.printf("%s WINS!!!\n", winner.name);
            if (winner == user) return 1;
            else return -1;
        }
    }
}
