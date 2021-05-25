import org.junit.Before;

import java.util.ArrayList;

public class DealershipTest {

    Dealership dealership;
    Tyre tyres;
    Engine engine;
    GearBox gearbox;
    Vehicle car1;
    ArrayList<>

    @Before
    public void before() {
        tyres = new Tyre("R16", "Winter");
        engine = new Engine(700, CarType.PETROL);
        gearbox = new GearBox("Automatic");
        car1 = new Vehicle(tyres, engine, gearbox, "Pink", 39846.45, "Masarati");
        dealership = new Dealership(200000);
    }

}
