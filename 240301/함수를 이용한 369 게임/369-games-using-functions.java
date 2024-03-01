import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findNumber(a, b));
    }

    public static int findNumber(int a, int b) {
        int count = 0;
        for (int i=a; i<=b; i++) {
            String str = String.valueOf(i);
            if (i % 3 == 0 || str.contains("3") || str.contains("6") || str.contains("9")) {
                count++;
            }
        }
        return count;
    }
}