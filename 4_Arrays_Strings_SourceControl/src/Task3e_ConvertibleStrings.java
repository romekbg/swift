
import java.util.Scanner;

// Test with:
// I love orange t-shirts
// I love oranges
// Result:
// true
public class Task3e_ConvertibleStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();
        String target = sc.nextLine();

        int lastIdx = -1;
        for (int i = 0; i < target.length(); i++) {
            char targetChar = target.charAt(i);

            lastIdx = source.indexOf(targetChar, lastIdx + 1);
            if (lastIdx == -1) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
