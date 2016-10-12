package Task5_PersonCharacteristics;

import java.util.Scanner;

public class PersonCharacteristics {

    public static Person[] enroll() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();

            String firstName = sc.nextLine();
            String lastName = sc.nextLine();
            char gender = sc.nextLine().toCharArray()[0];
            short yearBorn = sc.nextShort();
            float weight = sc.nextFloat();
            short height = sc.nextShort();
            sc.nextLine();
            String occupation = sc.nextLine();
            float[] grades = new float[Person.gradesCount];
            for (int j = 0; j < Person.gradesCount; j++) {
                float grade = sc.nextFloat();
                grades[j] = grade;
            }

            Person person = new Person(firstName, lastName, yearBorn, gender, weight, height, occupation, grades);
            people[i] = person;
        }

        return people;
    }

    public static void main(String[] args) {

        Person[] people = enroll();

        for (Person person : people) {

            System.out.println(person.getInfo());
        }
    }
}
