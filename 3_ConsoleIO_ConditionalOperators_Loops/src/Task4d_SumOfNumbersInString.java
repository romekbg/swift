
import java.util.Scanner;

public class Task4d_SumOfNumbersInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int n = 0;
        int sum = 0;

        for (char c : str.toCharArray()) {
            if ('0' <= c && c <= '9') {
                n = n * 10 + (c - '0');
            } else {
                sum += n;
                n = 0;
            }
        }

        sum += n;

        System.out.println(sum);
    }
}
