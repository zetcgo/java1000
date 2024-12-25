import java.util.Scanner;

public class FreeFallCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double acceleration = 9.81;
        double time = scanner.nextDouble();
        double initialPosition = 1000.0;

        double finalPosition = initialPosition - 0.5 * acceleration * time * time;
        System.out.printf("%.3f초 후, 물체의 고도는 %.3fm", time, finalPosition);
    }
}
