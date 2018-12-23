package partsOfCar;

public class Chassis extends CarPart{

    private String sort;

    public Chassis(int id, String name, String location, String sort) {
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
