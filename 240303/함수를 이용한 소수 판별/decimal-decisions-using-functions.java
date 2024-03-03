import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumPrime(a, b);
        System.out.println(sum);

    }

    public static int sumPrime(int a, int b) {
        int sum = 0;

        for (int i=a; i<=b; i++) {
            if (i == 1) {
                continue;
            }
            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isPrime(int a) {
        for (int i=2; i<a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}