import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a, b 입력값 
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        int a = Integer.parseInt(strArray[0]);
        int b = Integer.parseInt(strArray[1]);

        // 그리기
        for (int i=0; i<a; i++) {
            for (int j=0; j<b; j++) {
                System.out.print(1);
            }
            System.out.println("");
        }

    }
}