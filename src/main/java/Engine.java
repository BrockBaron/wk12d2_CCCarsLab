public class Engine {

    private double power;
    private CarType fuelType;

    public Engine(double power, CarType fuelType) {
        this.power = power;
        this.fuelType = fuelType;
    }

    public double getPower() {
        return power;
    }

    public String getFuelType() {
        return this.fuelType.getCarType();
    }
}
