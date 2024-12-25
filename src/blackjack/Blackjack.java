package blackjack;

import java.util.*;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        Player player = new Player(name);
        Game game = new Game(player);

        int wins = 0;
        int draws = 0;
        int loses = 0;
        program:
        while (true) {
            System.out.println();
            int result = game.proceed();
            if (result > 0) wins++;
            else if (result == 0) draws++;
            else loses++;
            System.out.println();

            while (true) {
                System.out.print("Type \"yes\" to play again or \"no\" to not: ");
                String response = scanner.next();
                if (response.equals("yes")) break;
                else if (response.equals("no")) break program;
                else System.out.printf("\"%s\" is wrong input.\n", response);
            }
        }
        System.out.printf("Wins: %d, Draws: %d, Loses: %d\n", wins, draws, loses);
        System.out.println("GG");
    }
}
