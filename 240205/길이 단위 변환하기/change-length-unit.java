import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(30.48 * 9.2);
        System.out.printf("9.2ft = %.1fcm\n", a.setScale(1, BigDecimal.ROUND_HALF_UP));

        BigDecimal b = new BigDecimal(160934 * 1.3);
        System.out.printf("1.3mi = %.1fcm", b.setScale(1, BigDecimal.ROUND_HALF_UP));
    }
}