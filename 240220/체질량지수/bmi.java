import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int weight = sc.nextInt();

        double bunmo = ((double)height * (double)height) / 10000;
        int bmi =  (int)(weight / bunmo);
        if (bmi >= 25) {
            System.out.println(bmi);
            System.out.println("Obesity");
        } else {
            System.out.println(bmi); 
        }
    }
}