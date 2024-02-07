public class Main {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        int answer = 0;
        answer += a;
        answer += b;
        answer += c;
        a = b = c = answer;
        System.out.printf("%d %d %d", a, b, c);
    }
}