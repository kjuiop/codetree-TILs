import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = cal1(a, b);
        int d = cal2(a, b);

        System.out.printf("%d %d", c, d);
    
    }

    public static int cal1(int a, int b) {
        if (a < b) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int cal2(int a, int b) {
        if (a == b) {
            return 1;
        } else {
            return 0;
        }
    }
}