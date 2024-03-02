import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        a = cal1(a);
        a = cal2(a);

        System.out.println(a);
    }

    public static int cal1(int a) {
        if (a % 2 == 0) {
            a = a / 2;
        }
            
        return a;
    }

    public static int cal2(int a) {
        if (a % 2 == 1) {
            a = a + 1;
            a = a / 2;
        }
            
        return a;
    }
}