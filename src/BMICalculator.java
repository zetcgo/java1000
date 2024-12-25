import java.util.Scanner;

public class BMICalculator {
    public static double getBMI(double weight, double tall) {
        return weight / (tall * tall);
    }

    public static String getObesity(double bmi) {
        if (bmi >= 30) return "비만";
        else if (bmi >= 25) return "과체중";
        else if (bmi >= 18.5) return "정상";
        else return "저체중";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double tall = scanner.nextDouble();

        double bmi = getBMI(weight, tall);
        String obesity = getObesity(bmi);
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.printf("%s입니다.", obesity);
    }
}
