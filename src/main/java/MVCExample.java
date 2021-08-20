import controller.Controller;
import model.Scooter;
import view.View;

public class MVCExample {

    private static Scooter initializeScooter(){
        Scooter scooter = new Scooter();
        scooter.setId("007");
        scooter.setBrand("NEW");
        scooter.setFuelType(Scooter.FuelType.Gas);
        return scooter;
    }

    public static void main(String[] args) {
        Scooter model = initializeScooter();
        View view = new View();
        Controller controller = new Controller(model,view);
        controller.updateView();
        controller.setScooterID("666");
        controller.setScooterFuelType(Scooter.FuelType.Petrol);
        controller.updateView();
    }
}
