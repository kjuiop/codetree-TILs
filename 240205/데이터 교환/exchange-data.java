public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int temp1 = b;
        int temp2 = c;

        b = a;
        c = temp1;
        a = temp2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}