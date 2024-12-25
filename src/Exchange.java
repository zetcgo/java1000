import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int euro = scanner.nextInt();
        int dollar = scanner.nextInt();

        double euroRate = 1320.48026;
        double dollarRate = 1063.82979;

        int won = (int)(euro * euroRate + dollar * dollarRate);
        System.out.printf("%d유로 + %d달러 = %d원", euro, dollar, won);
    }
}
