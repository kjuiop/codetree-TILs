import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        float x = a + b;
        float y = a - b;
        float z = x / y;

        System.out.printf("%.2f", z);
    }
}