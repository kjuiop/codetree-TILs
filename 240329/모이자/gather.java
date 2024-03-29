import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int houseCnt = scanner.nextInt();
        int[] peopleCnt = new int[houseCnt];
        for (int i = 0; i < houseCnt; i++) {
            peopleCnt[i] = scanner.nextInt();
        }
        System.out.println(solution(houseCnt, peopleCnt));

        scanner.close();
    }

    public static int solution(int houseCnt, int[] peopleCnt) {
        int[] sum = new int[houseCnt];
        for (int i = 0; i < houseCnt; i++) {
            int total = 0;
            for (int j = 0; j < houseCnt; j++) {
                if (i == j) {
                    continue;
                }
                int diff = Math.abs(j - i);
                total += diff * peopleCnt[j];
            }
            sum[i] = total;
        }

        return findMin(sum);
    }

    public static int findMin(int[] arr) {
        if (arr.length == 0) {
            return 0; // 빈 배열인 경우 0을 반환하거나, 에러 처리를 수행할 수 있습니다.
        }

        int minValue = arr[0]; // 초기값으로 첫 번째 요소를 설정

        for (int v : arr) {
            if (v < minValue) {
                minValue = v;
            }
        }

        return minValue;
    }
}