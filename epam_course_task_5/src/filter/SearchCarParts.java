package filter;

import partsOfCar.CarPart;

import java.util.ArrayList;
import java.util.List;

public class SearchCarParts {

    private List<CarPart> searchedCarParts = new ArrayList<>();

    public void searchByCarPartsLocation(List<CarPart> list, String carPartsLocation){

        String formatedType = carPartsLocation.replace(" ","");

            for (CarPart s : list) {

                    if (s.getLocation().toLowerCase().contains(formatedType.toLowerCase())) {

                            searchedCarParts.add(s);
                    }
            }
    }

    public List<CarPart> getSearchedCarParts() {
        return searchedCarParts;
    }
}
