
import java.util.Scanner;

public class Task3b_PrintZFigure {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }

        System.out.println();

        for (int i = 1; i < n - 1; i++) {

            for (int j = 0; j < n; j++) {
                if (j == n - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();

        }

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }

        System.out.println();
    }
}
