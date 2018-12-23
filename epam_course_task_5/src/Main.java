import filter.SearchCarParts;
import filter.SortCarParts;
import partsOfCar.*;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Factory BMW = new ConcreteFactory();

        BMW.createCar(new Car(1,"BMW X6"))
                            .addBody(new Body(1,"sedan","body", Color.Red,"2018"))
                            .addBrakes(new Brakes(45,"ABS","suspension","disk"))
                            .addChassis(new Chassis(34,"Chassis","suspensoin","outside of the city"))
                            .addEngine(new Engine(4,"disel","hood of car",2.5,3.2))
                            .addTransmission(new Transmission(5,"trans","suspension",6))
                            .addSuspension(new Suspension(56,"suspen","suspension","Strong","high"))
                            .build();

        BMW.createCar( new Car(2,"BMW X5"))
                            .addBody(new Body(7,"sedan","body", Color.Red,"2018"))
                            .addBrakes(new Brakes(8,"ABS","suspension","disk"))
                            .addChassis(new Chassis(9,"Chassis","suspensoin","outside of the city"))
                            .addEngine(new Engine(10,"disel","hood of car",2.5,3.2))
                            .addTransmission(new Transmission(11,"trans","suspension",6))
                            .addSuspension(new Suspension(12,"suspen","suspension","Strong","high"))
                            .build();

        SearchCarParts searchCarParts = new SearchCarParts();

        searchCarParts.searchByCarPartsLocation(BMW.getCars().get(0).getPartsCar(),"suspension");

        Collections.sort(searchCarParts.getSearchedCarParts(),new SortCarParts());

        System.out.println(searchCarParts.getSearchedCarParts());
    }
}
