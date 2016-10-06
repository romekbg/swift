package pkg2_data.types_variables_operators;

public class Task6_SecondsInBiggerIntervals {

    public static void main(String[] args) {
        int S = 1234567;
        int M = S / 60;
        S = S % 60;
        int H = M / 60;
        M = M % 60;
        int D = H / 24;
        H = H % 24;

        System.out.printf("%d days - %d hours - %d minutes - %d seconds\n", D, H, M, S);
    }
}
