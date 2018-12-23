package partsOfCar;

public class Engine extends CarPart{

    private double power;
    private double volume;

    public Engine(int id, String name, String location, double power, double volume) {
        super(id, name,location);
        this.power = power;
        this.volume = volume;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
