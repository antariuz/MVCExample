package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Scooter {

    private String id;
    private String brand;
    private FuelType fuelType;


    public enum FuelType {
        Gas, Petrol
    }
}
