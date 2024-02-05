import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        double a = 25.352;
        BigDecimal b = new BigDecimal(a);
        BigDecimal answer = b.setScale(1, BigDecimal.ROUND_HALF_UP);
        System.out.println(answer);
    }
}