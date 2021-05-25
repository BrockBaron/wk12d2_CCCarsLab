import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before() {
        customer = new Customer(50000);
    }

    @Test
    public void hasWallet() {
        assertEquals(50000, customer.getWallet(), 0.0);
    }

    @Test
    public void hasNoCars() {
        assertEquals(0, customer.getLengthVehicleList());
    }
}
