import partsOfCar.CarPart;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private long id;
    private String name;
    private List<CarPart> partsCar = new ArrayList<>();

    public Car(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addPart(CarPart part){
        partsCar.add(part);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CarPart> getPartsCar() {
        return partsCar;
    }

    @Override
    public String toString() {
        return "Car" +
                "No=" + id +
                ", name='" + name + '\'' +
                ", body='" + partsCar.get(0).getName() + '\'' +
                ", brakes='" + partsCar.get(1).getName() + '\'' +
                ", chassis='" + partsCar.get(2).getName() + '\'' +
                ", engine='" + partsCar.get(3).getName() + '\'' +
                ", transmission='" + partsCar.get(5).getName() + '\'' +
                ", suspension='" + partsCar.get(4).getName() + '\'' +
                ';';
    }
}
