import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine(250, CarType.DIESEL);
    }

    @Test
    public void hasPower() {
        assertEquals(250, engine.getPower(), 0.0);
    }

    @Test
    public void hasFuelType() {
        assertEquals("Diesel", engine.getFuelType());
    }
}
