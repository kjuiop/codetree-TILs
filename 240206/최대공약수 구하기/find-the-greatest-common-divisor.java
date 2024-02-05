import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        int a = Integer.parseInt(strArray[0]);
        int b = Integer.parseInt(strArray[1]);

        for (int i=a; i>0; i--) {
            if ((a % i) == 0) {
                if ((b % i) == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}