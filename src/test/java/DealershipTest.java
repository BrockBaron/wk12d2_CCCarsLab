import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Tyre tyres;
    Engine engine;
    GearBox gearbox;
    Vehicle car1;
    ArrayList<Vehicle> vehicleList;

    @Before
    public void before() {
        tyres = new Tyre("R16", "Winter");
        engine = new Engine(700, CarType.PETROL);
        gearbox = new GearBox("Automatic");
        car1 = new Vehicle(tyres, engine, gearbox, "Pink", 39846.45, "Masarati");
        vehicleList = new ArrayList<>();
        vehicleList.add(car1);
        dealership = new Dealership(200000, vehicleList);
    }

    @Test
    public void hasTill() {
        assertEquals(200000, dealership.getTill(), 0.01);
    }

    @Test
    public void hasCarList() {
        assertEquals(1, dealership.getLengthVehicleList());
    }
}
