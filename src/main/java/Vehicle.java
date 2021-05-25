public class Vehicle {

    private Tyre tyres;
    private Engine engine;
    private GearBox gearbox;
    private String colour;
    private double price;
    private String brand;

    public Vehicle(Tyre tyres, Engine engine, GearBox gearbox, String colour, double price, String brand) {
        this.tyres = tyres;
        this.engine = engine;
        this.gearbox = gearbox;
        this.colour = colour;
        this.price = price;
        this.brand = brand;
    }

    public Tyre getTyres() {
        return tyres;
    }

    public Engine getEngine() {
        return engine;
    }

    public GearBox getGearbox() {
        return gearbox;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
}
