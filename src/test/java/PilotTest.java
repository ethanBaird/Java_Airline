import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Ethan", Rank.CAPTAIN, "LN100");
    }

    @Test
    public void hasRank(){
        Rank rank = pilot.getRank();
        int actual = rank.getValue();
        assertEquals(1, actual);
    }

    @Test
    public void hasLicenseNumber(){
        String actual = pilot.getLicenseNumber();
        assertEquals("LN100", actual);
    }

    @Test
    public void canFlyPlane(){
        String actual = pilot.flyPlane();
        assertEquals("This is your Captain speaking!", actual);
    }
}
