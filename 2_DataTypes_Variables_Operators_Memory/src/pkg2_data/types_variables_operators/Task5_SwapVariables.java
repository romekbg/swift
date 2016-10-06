package pkg2_data.types_variables_operators;

public class Task5_SwapVariables {

    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}
