package view;

import model.Scooter;

public class View {
    public void getScooterInfo(String id, String brand, Scooter.FuelType fuelType) {
        System.out.println("Scooter: {" +
                "ID: " + id + "; " +
                "Brand: " + brand + "; " +
                "Fuel type: " + fuelType + "}");
    }
}
