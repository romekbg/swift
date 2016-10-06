
import java.util.Scanner;

public class Task5_PersonCharacteristics {

    public static void main(String[] args) {

        final short currentYear = 2016;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            String firstName = sc.nextLine();

            String lastName = sc.nextLine();

            short yearBorn;
            do {
                yearBorn = sc.nextShort();
            } while (!(1800 <= yearBorn && yearBorn <= currentYear));

            float weight;
            do {
                weight = sc.nextFloat();
            } while (!(30 < weight && weight < 600));

            short height;
            do {
                height = sc.nextShort();
            } while (!(30 < height && height < 300));

            sc.nextLine();

            String occupation = sc.nextLine();

            short age = (short) (currentYear - yearBorn);

            System.out.printf("%s %s is %d years old. He was born in %d. "
                    + "His weight is %f and he is %d cm tall. He is a %s.%n",
                    firstName, lastName, age, yearBorn, weight, height, occupation);

            if (age < 18) {
                System.out.println(firstName + " " + lastName + " is under-aged.");
            }
        }
    }
}
