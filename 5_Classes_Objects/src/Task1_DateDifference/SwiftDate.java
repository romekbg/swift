package Task1_DateDifference;

public class SwiftDate {

    int year;
    int month;
    int day;

    SwiftDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    static int getDaysCount(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
        }

        return -1;
    }

    boolean isLeapYear() {
        return isLeapYear(year);
    }

    int getDaysCount() {
        return getDaysCount(month, year);
    }

    int getCentury() {
        return (year / 100) + 1;
    }

    int getDaysDifference(SwiftDate other) {
        SwiftDate older, recent;

        int dateComparisonResult = this.compareTo(other);

        if (dateComparisonResult < 0) {
            older = this;
            recent = other;
        } else if (dateComparisonResult > 0) {
            older = other;
            recent = this;
        } else {
            // dates are equal => difference is 0
            return 0;
        }

        int daysDifference = 1;
        int y = older.year;
        int m = older.month;
        int d = older.day;

        while (!(y == recent.year && m == recent.month && d == recent.day)) {
            d++;
            daysDifference++;
            if (d > getDaysCount(m, y)) {
                d = 1;
                m++;
                if (m > 12) {
                    m = 1;
                    y++;
                }
            }
        }

        return daysDifference;
    }

    void printInfo() {
        System.out.printf("%04d %02d %02d - %2d century.", year, month, day, getCentury());

        if (isLeapYear()) {
            System.out.print(" It is a LEAP year");
        }

        System.out.println();
    }

    private int compareTo(SwiftDate other) {
        if (this.year > other.year) {
            return 1;
        } else if (this.year < other.year) {
            return -1;
        } else if (this.month > other.month) {
            return 1;
        } else if (this.month < other.month) {
            return -1;
        } else if (this.day > other.day) {
            return 1;
        } else if (this.day < other.day) {
            return -1;
        }

        return 0;
    }
}

