
import java.util.Scanner;

public class Task4c_PrintEverySentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (char c : str.toCharArray()) {
            System.out.print(c);

            if (c == '.' || c == '!' || c == '?') {
                System.out.println();
            }
        }
    }
}
