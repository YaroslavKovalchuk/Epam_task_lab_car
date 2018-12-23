import partsOfCar.*;

import java.util.ArrayList;
import java.util.List;

public class ConcreteFactory extends Factory {

    private List<Car> cars;

    public ConcreteFactory(){
        cars = new ArrayList<>();
    }

    @Override
    public Factory createCar(Car c) {
        Car car = new Car(c.getId(),c.getName());
        cars.add(car);
        return this;
    }

    @Override
    public Factory addBody(Body body) {
            cars.get(cars.size()-1).addPart(body);
            return this;
    }

    @Override
    public Factory addBrakes(Brakes brakes) {
        cars.get(cars.size()-1).addPart(brakes);
            return this;
    }

    @Override
    public Factory addChassis(Chassis chassis) {
        cars.get(cars.size()-1).addPart(chassis);
            return this;
    }

    @Override
    public Factory addEngine(Engine engine) {
        cars.get(cars.size()-1).addPart(engine);
        return this;
    }

    @Override
    public Factory addSuspension(Suspension suspension) {
        cars.get(cars.size()-1).addPart(suspension);
        return this;
    }

    @Override
    public Factory addTransmission(Transmission transmission) {
        cars.get(cars.size()-1).addPart(transmission);
        return this;
    }

    @Override
    public ConcreteFactory build() {
        return this;
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {

        String s = new String();

        for (Car c:cars) {
            s = s +"No: " + c.getId() +", name: "+ c.getName() +";"+"\n";
        }

        return s;
    }
}
