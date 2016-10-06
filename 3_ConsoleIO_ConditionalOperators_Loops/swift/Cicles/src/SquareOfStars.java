
import java.util.Scanner;

public class SquareOfStars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the side of the square: ");
        n = input.nextInt();
        String stars = "*";
        if (n > 0 && n < 21) {

            for (int i = 0; i <= n - 1; i++) {
                System.out.print("* ");

            }
            System.out.println("");
            for (int i = 1; i <= n - 2; i++) {
                System.out.print("*");
                for (int b = 0; b < n * 2 - 3; b++) {
                    System.out.print(" ");

                }
                System.out.println("*");

            }
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");

            }
        }
    }
}
