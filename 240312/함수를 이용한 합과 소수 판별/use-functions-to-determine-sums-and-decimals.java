import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;
        for (int i=a; i<=b; i++) {
            boolean result = isPrime(i) && isDubleSum(i);
            if (result) {
                count += 1;
            }
        }

        System.out.println(count);
        
    }

    public static boolean isPrime(int a) {

        for (int i=2; i<a; i++) {
            if (a % i == 0) {
                return false;
            } 
        }
        return true;
    }

    public static boolean isDubleSum(int a) {

        if (a == 100) {
            return false;
        } else if (a > 9) {
            int x = a / 10;
            int y = a % 10;
            int z = x + y;
            if (z % 2 == 0) {
                return true;
            }
        } else {
            if (a % 2 == 0) {
                return true;
            }
        }

        return false;
    } 
}