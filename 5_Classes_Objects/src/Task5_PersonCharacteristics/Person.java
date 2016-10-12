package Task5_PersonCharacteristics;

import java.time.Year;

public class Person {

    static short gradesCount = 4;

    String firstName;
    String lastName;
    short yearBorn;
    char gender;
    float weight;
    short height;
    String occupation;
    float[] grades;

    Person(String firstName, String lastName, short yearBorn, char gender, float weight, short height, String occupation) {
        this(firstName, lastName, yearBorn, gender, weight, height, occupation, null);
    }

    Person(String firstName, String lastName, short yearBorn, char gender, float weight, short height, String occupation, float[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearBorn = yearBorn;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.occupation = occupation;
        this.grades = grades;
    }

    double getAverageGrade() {

        float avgGrade = 0;

        for (float grade : grades) {
            avgGrade += grade;
        }

        return avgGrade / gradesCount;
    }

    short getAge() {
        return (short) (Year.now().getValue() - yearBorn);
    }

    String getInfo() {

        String heOrShe;
        String hisOrHer;

        if (gender == 'M') {
            heOrShe = "He";
            hisOrHer = "His";
        } else {
            heOrShe = "She";
            hisOrHer = "Her";
        }

        String result = String.format("%s %s is %d years old.", firstName, lastName, getAge());
        result += String.format(" %s was born in %d.", heOrShe, yearBorn);
        result += String.format(" %s weight is %.1f and %s is %d cm tall.", hisOrHer, weight, heOrShe.toLowerCase(), height);
        result += String.format(" %s is a %s with an average grade of %.3f.", heOrShe, occupation, getAverageGrade());

        if (isUnderAged()) {
            result += String.format(" %s %s is under-aged.", firstName, lastName);
        }

        return result;
    }

    boolean isUnderAged() {
        return getAge() < 18;
    }

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    short getYearBorn() {
        return yearBorn;
    }

    float getWeight() {
        return weight;
    }

    void setWeight(float newWeight) {
        this.weight = newWeight;
    }

    short getHeight() {
        return height;
    }

    void setHeight(short newHeight) {
        this.height = newHeight;
    }

    String getOccupation() {
        return occupation;
    }

    void setOccupation(String newOccupation) {
        this.occupation = newOccupation;
    }

    float[] getGrades() {
        return grades;
    }

    void setGrades(float grade1, float grade2, float grade3, float grade4) {
        grades[0] = grade1;
        grades[1] = grade2;
        grades[2] = grade3;
        grades[3] = grade4;
    }
}
