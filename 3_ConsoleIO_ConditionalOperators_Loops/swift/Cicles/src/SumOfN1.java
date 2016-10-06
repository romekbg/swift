
import java.util.Scanner;

public class SumOfN1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
        int num = 1;
        int sum = 1;
        System.out.print("The sum 1");
        while (num < n) {
            num++;
            sum += num;
            System.out.printf("+%d", num);
        }
        System.out.printf(" = %d%n", sum);

    }
}
