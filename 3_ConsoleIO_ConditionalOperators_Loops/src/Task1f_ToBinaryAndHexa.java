
import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int base = 2;
        int n = number;

        String result = "";

        while (n != 0) {
            result = n % base + result;
            n /= base;
        }

        System.out.println(result);

        base = 16;
        n = number;
        result = "";

        while (n != 0) {
            int digit = n % base;

            if (digit < 10) {
                result = digit + result;
            } else {
                result = (char) ('A' + (digit - 10)) + result;
            }

            n /= base;
        }

        System.out.println(result);
    }
}
