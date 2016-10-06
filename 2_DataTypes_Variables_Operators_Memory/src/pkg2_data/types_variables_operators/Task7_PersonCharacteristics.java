package pkg2_data.types_variables_operators;

public class Task7_PersonCharacteristics {

    public static void main(String[] args) {
        String firstName = "Ivo";
        String lastName = "Stefanov";
        int ageOfBirthday = 1983;
        int weight = 86;
        int hight = 178;
        String occupation = "SoMe";
        System.out.printf("%s %s was born %d year. His weight is %d and hight is %d. His occupation is %s.\n", firstName, lastName, ageOfBirthday, weight, hight, occupation);

//if (ageOfBirthday > 1998){
        //System.out. println("Ivo is not adult");
        //else {
        //System.out.println("Ivo is adult");
        if (ageOfBirthday > 1998) {
            System.out.println("Ivo is not adult");
        } else {
            System.out.println("Ivo is adult");
        }
    }
}
