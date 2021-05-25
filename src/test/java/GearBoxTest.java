import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearBoxTest {

    GearBox gearbox;

    @Before
    public void before() {
        gearbox = new GearBox("Manual");
    }

    @Test
    public void hasType() {
        assertEquals("Manual", gearbox.getGearboxType());
    }
    
}
