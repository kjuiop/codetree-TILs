import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        isYooneoun(a);
    }

    public static void isYooneoun(int a) {
        if (a % 4 != 0) {
            System.out.println("false");
            return;
        }

        if (a % 100 == 0 && a % 400 != 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}