import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();

        int hundreds = integer / 100;
        int tens = integer / 10 % 10;
        int ones = integer % 10;

        int totalDigitsSum = hundreds + tens + ones;
        System.out.print(totalDigitsSum);
    }
}
