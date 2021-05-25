import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre("R16", "Winter");
    }

    @Test
    public void tyreHasSize() {
        assertEquals("R16", tyre.getTyreSize());
    }

    @Test
    public void tyreHasType() {
        assertEquals("Winter", tyre.getTyreType());
    }
}
