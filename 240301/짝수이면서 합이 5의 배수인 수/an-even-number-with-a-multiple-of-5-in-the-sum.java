import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a / 10;
        int c = a % 10;
        if (a % 2 == 0 && (b+c) % 5 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}