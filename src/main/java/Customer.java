import java.util.ArrayList;

public class Customer {
    private double wallet;

    private ArrayList<Vehicle> vehicles;

    public Customer(double wallet, ArrayList<Vehicle> vehicles) {
        this.wallet = wallet;
        this.vehicles = vehicles;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }


}
