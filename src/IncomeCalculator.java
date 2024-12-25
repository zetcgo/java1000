import java.util.Scanner;

public class IncomeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int baseIncome = scanner.nextInt();
        int workingHours = scanner.nextInt();
        int totalIncome = baseIncome * workingHours;

        System.out.print(totalIncome);
    }
}
