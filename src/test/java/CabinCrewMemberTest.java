import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Ethan", Rank.FLIGHTATTENDANT);
    }

    @Test
    public void hasRank(){
        Rank rank = cabinCrewMember.getRank();
        int actual = rank.getValue();
        assertEquals(3, actual);
    }
}
