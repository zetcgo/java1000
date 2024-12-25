package dicesurvival;

import java.util.List;
import java.util.stream.IntStream;

public class DiceSurvival {
    static boolean willSurvive(Dice dice) {
        return dice.topNumber % 2 == 0;
    }

    public static void main(String[] args) {
        String[] zodiac = {
                "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
                "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"
        };
        List<Dice> dices = IntStream.range(0, zodiac.length)
                   .mapToObj(i -> new Dice(zodiac[i], i + 1))
                   .toList();
        System.out.println("=== Contestants ===");
        dices.forEach(System.out::println);
        for (int round = 1; !dices.isEmpty(); round++) {
            System.out.printf("=== Round %d ===\n", round);
            for (Dice dice : dices) dice.roll();
            dices = dices.stream().filter(DiceSurvival::willSurvive).toList();
            if (dices.isEmpty()) System.out.println("No contestants left!");
            else dices.forEach(System.out::println);
        }
    }
}