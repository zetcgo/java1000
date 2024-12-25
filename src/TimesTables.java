public class TimesTables {
    public static void main(String[] args) {
        for (int first = 2; first <= 9; first++) {
            System.out.printf("%d단\n", first);
            for (int second = 1; second <= 9; second++) {
                int result = first * second;
                System.out.printf("\t%d * %d = %d\n", first, second, result);
            }
        }
    }
}
