import java.util.Scanner;
import java.time.YearMonth;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int date = sc.nextInt();

        YearMonth yearMonthObject = YearMonth.of(2021, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();

        if (date <= daysInMonth) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}