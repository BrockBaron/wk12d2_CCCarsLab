import java.util.ArrayList;

public class Dealership {
    private double till;

    private ArrayList<Vehicle> vehicles;

    public Dealership(double till, ArrayList<Vehicle> vehicles) {
        this.till = till;
        this.vehicles = vehicles;
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public int getLengthVehicleList() {
        return this.vehicles.size();
    }
}
