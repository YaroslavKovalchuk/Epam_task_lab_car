package partsOfCar;

public class Transmission extends CarPart{

    private int numberOfGeas;

    public Transmission(int id, String name, String location, int numberOfGeas) {
        super(id, name,location);
        this.numberOfGeas = numberOfGeas;
    }

    public int getNumberOfGeas() {
        return numberOfGeas;
    }

    public void setNumberOfGeas(int numberOfGeas) {
        this.numberOfGeas = numberOfGeas;
    }
}
