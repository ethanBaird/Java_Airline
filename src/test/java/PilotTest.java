import org.junit.Before;
import org.junit.Test;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before(){
        pilot - new Pilot("Ethan", Rank.CAPTAIN, "LN100");
    }

    @Test
    public void hasRank(){
        Rank rank = pilot.getRank();
        int actual = rank.getValue()();
        assertEquals(1, actual);
    }

}
