package partsOfCar;

public class Brakes extends CarPart{

    private String sort;

    public Brakes(int id, String name, String location, String sort) {
        super(id, name,location);
        this.sort = sort;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
