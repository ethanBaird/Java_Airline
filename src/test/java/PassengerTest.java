import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Ethan", 1);
    }

    @Test
    public void hasNoOfBags() {
        int actual = passenger.getNoOfBags();
        assertEquals(1, actual);
    }
}
