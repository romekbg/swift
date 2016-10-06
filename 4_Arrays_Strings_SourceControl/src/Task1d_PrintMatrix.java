
import java.util.Scanner;

public class Task1d_PrintMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int x = 1;

        int row = 0, col = 0;
        int dirRow = 0, dirCol = 1;

        while (x <= n * n) {

            while (col < n) {
                if (arr[row][col] == 0) {
                    arr[row][col++] = x++;
                } else {
                    break;
                }
            }

            col--;
            row++;

            while (row < n) {
                if (arr[row][col] == 0) {
                    arr[row++][col] = x++;
                } else {
                    break;
                }
            }

            row--;
            col--;

            while (col >= 0) {
                if (arr[row][col] == 0) {
                    arr[row][col--] = x++;
                } else {
                    break;
                }
            }

            col++;
            row--;

            while (row >= 0) {
                if (arr[row][col] == 0) {
                    arr[row--][col] = x++;
                } else {
                    break;
                }
            }

            row++;
            col++;
        }

        for (row = 0; row < n; row++) {
            for (col = 0; col < n; col++) {
                System.out.printf("%4d", arr[row][col]);
            }
            System.out.println();
        }
    }
}
