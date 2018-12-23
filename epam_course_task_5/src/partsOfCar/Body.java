package partsOfCar;

public class Body extends CarPart{

    private Color color;
    private String sort;

    public Body(int id, String name, String location, Color color, String sort) {
        super(id, name,location);
        this.color = color;
        this.sort = sort;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

}
