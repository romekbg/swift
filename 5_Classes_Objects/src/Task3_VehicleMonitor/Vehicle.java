
package Task3_VehicleMonitor;

import java.time.Year;

public class Vehicle {
    static short currentYear = (short)Year.now().getValue();
    static short id = 0;
    
    String type;
    String model;
    short power;
    float fuelConsumption;
    float weight;
    short year;
    String licenseNo;
    String color;
    
    Vehicle(String type, String model, short power, float fuelConsumption, short year, float weight, String color){
        this.type = type;
        this.model = model;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.year = year;
        this.weight = weight;
        this.color = color;
        licenseNo = String.format("%04d", id);
        id++;
    }
    
    Vehicle(String type, String model, short power, float fuelConsumption, short year){
        this(type, model, power, fuelConsumption, year, -1, "N/A");
    }
    
    double calculateTripPrice(double fuelPrice, double distance){
        return distance * (fuelConsumption / 100) * fuelPrice;
    }
    
    double getInsurancePrice(){
        double insurancePrice = 0.01 * power * (currentYear - year) * fuelConsumption;
        
        switch (type) {
            case "car":
                insurancePrice *= 1;
                break;
            case "suv":
                insurancePrice *= 1.12;
                break;
            case "truck":
                insurancePrice *= 1.2;
                break;
            case "motorcycle":
                insurancePrice *= 1.5;
                break;
            default:
                // should be impossible
                insurancePrice = -1;
                break;
        }
        
        return insurancePrice;
    }
}