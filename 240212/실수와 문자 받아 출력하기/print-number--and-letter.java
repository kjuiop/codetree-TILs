import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.printf("%s\n", c);
        System.out.printf("%.2f\n", a);
        System.out.printf("%.2f\n", b);
    }
}