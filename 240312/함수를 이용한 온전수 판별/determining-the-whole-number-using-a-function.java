import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;
        for (int i=a; i<=b; i++) {
            if (isCompleteNumber(i)) {
                result += 1;
            }
        }

        System.out.println(result);
    }

    public static boolean isCompleteNumber(int num) {

        if (num % 2 == 0) {
            return false;
        }

        if (num % 10 == 5) {
            return false;
        }

        if (num % 3 == 0 && num % 9 != 0) {
            return false;
        }

        return true;
    }
}