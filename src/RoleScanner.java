import java.util.Scanner;

public class RoleScanner {
    public static String getRole(int age) {
        if (age >= 18) return "성인";
        else if (age >= 13) return "청소년";
        else if (age >= 6) return "어린이";
        else return "유아";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String role = getRole(age);
        System.out.print(role);
    }
}
