import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        BigDecimal b = new BigDecimal(a);
        System.out.printf("%.2f", b.setScale(2, BigDecimal.ROUND_HALF_UP));
    }
}