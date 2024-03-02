import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        a = calculate(a);
        a = calculate(a);

        System.out.println(a);
    }

    public static int calculate(int a) {
        if (a <= 1) {
            return a;
        }
        
        if (a % 2 == 0) {
            a = a / 2;
        } else {
            a += 1;
            a = a / 2;
        }

        return a;
    }
}