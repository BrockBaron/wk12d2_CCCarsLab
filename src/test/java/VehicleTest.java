import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Vehicle vehicle;
    Tyre tyres;
    Engine engine;
    GearBox gearbox;

    @Before
    public void setUp() {
        tyres = new Tyre("R16", "Winter");
        engine = new Engine(700, CarType.PETROL);
        gearbox = new GearBox("Automatic");
        vehicle = new Vehicle(tyres, engine, gearbox, "Pink", 39846.45, "Masarati");
    }

    @Test
    public void hasTyres() {
        assertEquals(tyres, vehicle.getTyres());
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, vehicle.getEngine());
    }

    @Test
    public void hasGearbox() {
        assertEquals(gearbox, vehicle.getGearbox());
    }

    @Test
    public void hasColour() {
        assertEquals("Pink", vehicle.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(39846.45, vehicle.getPrice(), 0.01);
    }

    @Test
    public void hasBrand() {
        assertEquals("Masarati", vehicle.getBrand());
    }
}
