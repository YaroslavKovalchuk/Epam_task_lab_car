import partsOfCar.*;

import java.util.List;

public abstract class Factory {

    public abstract Factory createCar(Car car);
    public abstract Factory addBody(Body body);
    public abstract Factory addBrakes(Brakes brakes);
    public abstract Factory addChassis(Chassis chassis);
    public abstract Factory addEngine(Engine engine);
    public abstract Factory addSuspension(Suspension suspension);
    public abstract Factory addTransmission(Transmission transmission);
    public abstract Factory build();
    public abstract List<Car> getCars();

}
