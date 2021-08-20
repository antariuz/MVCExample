package model;

public class Scooter {

    private String id;
    private String brand;
    private FuelType fuelType;

    public Scooter() {
    }

    public enum FuelType {
        Gas, Petrol
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
}
