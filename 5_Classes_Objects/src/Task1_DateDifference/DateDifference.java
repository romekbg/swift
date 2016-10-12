package Task1_DateDifference;

import java.util.*;

public class DateDifference {

    static SwiftDate readSwiftDate(Scanner sc) {

        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        return new SwiftDate(year, month, day);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SwiftDate date1 = readSwiftDate(sc);
        SwiftDate date2 = readSwiftDate(sc);

        System.out.println(date1.getDaysDifference(date2));
        date1.printInfo();
        date2.printInfo();
    }
}
