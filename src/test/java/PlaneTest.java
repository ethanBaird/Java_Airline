import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasPlaneType() {
        PlaneType planeType = plane.getPlaneType();
        int actual = planeType.getValue();
        assertEquals(1, actual);
    }
}
