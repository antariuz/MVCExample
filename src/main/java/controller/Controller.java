package controller;

import lombok.AllArgsConstructor;
import model.Scooter;
import view.View;

@AllArgsConstructor
public class Controller {

    private final Scooter model;
    private final View view;

    public String getScooterID() {
        return model.getId();
    }

    public void setScooterID(String id) {
        model.setId(id);
    }

    public String getScooterBrand() {
        return model.getBrand();
    }

    public void setScooterBrand(String brand) {
        model.setBrand(brand);
    }

    public Scooter.FuelType getScooterFuelType() {
        return model.getFuelType();
    }

    public void setScooterFuelType(Scooter.FuelType fuelType) {
        model.setFuelType(fuelType);
    }

    public void updateView(){
        view.getScooterInfo(model.getId(),model.getBrand(),model.getFuelType());
    }

}
