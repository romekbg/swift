package Task3_VehicleMonitor;

import java.util.Scanner;

public class VehicleMonitor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double fuelPrice = sc.nextDouble();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] split = line.split(",");

            String type = split[0].trim();
            String model = split[1].trim();
            short power = Short.parseShort(split[2].trim());
            float fuelConsumption = Float.parseFloat(split[3].trim());
            short year = Short.parseShort(split[4].trim());
            short distance = Short.parseShort(split[5].trim());

            Vehicle vehicle;

            if (split.length == 8) {
                float weight = Float.parseFloat(split[6].trim());
                String color = split[7].trim();
                vehicle = new Vehicle(type, model, power, fuelConsumption, year, weight, color);
            } else {
                vehicle = new Vehicle(type, model, power, fuelConsumption, year);
            }

            System.out.printf("%s - %s, %s", vehicle.licenseNo, vehicle.model, vehicle.year);
            if (vehicle.color != null) {
                System.out.printf(", %s%n", vehicle.color);
            }
            System.out.printf("Insurance cost: %.2f - Travel cost: %.2f%n",
                    vehicle.getInsurancePrice(), vehicle.calculateTripPrice(fuelPrice, distance));
        }
    }
}
