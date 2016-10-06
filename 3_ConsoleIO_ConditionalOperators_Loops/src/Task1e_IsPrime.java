
import java.util.Scanner;

public class Task1e_IsPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("true and false");
            return;
        }

        if (n % 2 == 0) {
            System.out.println("false");
            return;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }
}
