
import java.util.Scanner;

public class Task3c_PrintChristmasTree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j <= n - 4 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i <= n - 4; i++) {
            System.out.print(" ");
        }

        System.out.println("*");

        for (int i = 0; i <= n - 5; i++) {
            System.out.print(" ");
        }

        System.out.println("***");
    }
}
