public class EmployeeIncomeCalculator {
    private static final String ERROR = "\u001B[31m";
    private static final String RESET = "\u001B[0m";

    public static void printIncome(double baseIncome, int hours) {
        if (baseIncome < 8.00) System.out.printf(ERROR + "최저시급이 이행되지 않았습니다.");
        else if (hours > 60) System.out.printf(ERROR + "주당 제한 근무시간을 초과하였습니다.");
        else {
            double totalIncome = baseIncome * hours;
            System.out.printf("총 임금: $%.3f", totalIncome);
        }
        System.out.println(RESET);
    }

    public static void main(String[] args) {
        printIncome(7.50, 35);
        printIncome(8.20, 47);
        printIncome(10.00, 73);
    }
}
