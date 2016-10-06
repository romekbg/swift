
import java.util.Scanner;

public class Task1b_PrintMirrorNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n != 0) {
            System.out.print(n % 10);
            n /= 10;
        }

        System.out.println();
    }
}
