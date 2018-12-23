package filter;

import partsOfCar.CarPart;

import java.util.Comparator;

public class SortCarParts implements Comparator<CarPart> {
    @Override
    public int compare(CarPart o1, CarPart o2) {
        return o1.getId() - o2.getId();
    }
}
