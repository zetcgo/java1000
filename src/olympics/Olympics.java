package olympics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Olympics {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Norway", 10, 9, 8));
        countries.add(new Country("Germany", 9, 5, 4));
        countries.add(new Country("Netherlands", 6, 5, 2));
        countries.add(new Country("Canada", 5, 5, 6));
        countries.add(new Country("United States", 5, 3, 2));
        countries.add(new Country("Sweden", 4, 3, 0));
        countries.add(new Country("Austria", 4, 2, 4));
        countries.add(new Country("France", 4, 2, 4));
        countries.add(new Country("South Korea", 3, 2, 2));
        countries.add(new Country("Japan", 2, 5, 3));

        System.out.println("=== Result Before 20 Games ===");
        countries.forEach(System.out::println);

        for (int games = 20; games > 0; games--) {
            System.out.printf("=== %d blackjack.Game%s Left... ===\n", games, games != 1 ? "s" : "");
            Collections.shuffle(countries);
            List<Country> prizedCountries = countries.subList(0, 3);

            prizedCountries.get(0).golds++;
            System.out.printf("%s gets gold medal!\n", prizedCountries.get(0).name);
            prizedCountries.get(1).silvers++;
            System.out.printf("%s gets silver medal!\n", prizedCountries.get(1).name);
            prizedCountries.get(2).bronzes++;
            System.out.printf("%s gets bronze medal!\n", prizedCountries.get(2).name);
        }

        countries.sort(new Comparator<Country>() {
            @Override
            public int compare(Country first, Country second) {
                if (first.golds != second.golds) return Integer.compare(second.golds, first.golds);
                else if (first.silvers != second.silvers) return Integer.compare(second.silvers, first.silvers);
                else if (first.bronzes != second.bronzes) return Integer.compare(second.bronzes, first.bronzes);
                else return first.name.compareTo(second.name);
            }
        });

        System.out.println("=== Total Result ===");
        countries.forEach(System.out::println);
    }
}
