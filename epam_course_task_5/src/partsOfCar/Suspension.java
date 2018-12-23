package partsOfCar;

public class Suspension extends CarPart{

    private String sort;
    private String endurance;

    public Suspension(int id, String name, String location, String sort, String endurance) {
        super(id, name,location);
        this.sort = sort;
        this.endurance = endurance;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getEndurance() {
        return endurance;
    }

    public void setEndurance(String endurance) {
        this.endurance = endurance;
    }
}
