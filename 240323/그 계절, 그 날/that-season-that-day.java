import java.util.Scanner;
import java.time.YearMonth;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        YearMonth yearMonthObject = YearMonth.of(y, m);
        int daysInMonth = yearMonthObject.lengthOfMonth();

        if (d > daysInMonth) {
            System.out.println(-1);
            return;
        }

        if (m >=3 && m < 6) {
            System.out.println("Spring");
        } else if (m >= 6 && m < 9) {
            System.out.println("Summer");
        } else if (m >= 9 && m < 12) {
            System.out.println("Fall");
        } else {
            System.out.println("Winter");
        }

    }
}