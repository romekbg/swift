
import java.util.Scanner;

public class Task4b_PrintCountOfWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;
        boolean oldWord = false;

        for (char c : str.toCharArray()) {
            if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
                if (!oldWord) {
                    oldWord = true;
                    count++;
                }
            } else {
                oldWord = false;
            }
        }

        System.out.println(count);
    }
}
