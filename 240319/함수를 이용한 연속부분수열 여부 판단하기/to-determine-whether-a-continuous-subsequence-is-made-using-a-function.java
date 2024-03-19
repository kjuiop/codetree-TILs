import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arrN = new int[n];
        int[] arrM = new int[m];

        for(int i = 0; i < n; i ++) {
            arrN[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i ++) {
            arrM[i] = sc.nextInt();
        }

        boolean isResult = false;
        for (int i=0; i<= n-m; i++) {
            boolean isMatch = true;
            for (int j=0; j < m; j++){
                if (arrN[i+j] != arrM[j]) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                isResult = true;
                break;
            }
        }

        if (isResult) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}