import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        printoutBoolean(a>=b);
        printoutBoolean(a>b);
        printoutBoolean(b>=a);
        printoutBoolean(b>a);
    }

    public static void printoutBoolean(boolean t) {
        if (t) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}