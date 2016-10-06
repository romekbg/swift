
import java.util.Scanner;

public class Task2a_PrintSumOfN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberCount = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < numberCount; i++) {
            int n = sc.nextInt();
            sum += n;
        }

        System.out.println(sum);
    }
}
