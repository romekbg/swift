
import java.util.Scanner;

public class Task4a_StringWoVowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (char c : str.toCharArray()) {
            switch (c) {
                case 'a':
                case 'A':
                case 'o':
                case 'O':
                case 'e':
                case 'E':
                case 'u':
                case 'U':
                case 'i':
                case 'I':
                case 'y':
                case 'Y':
                    break;
                default:
                    System.out.print(c);
                    break;
            }
        }

        System.out.println();
    }
}
