import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.SPITFIRE);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.SPITFIRE, plane.getPlaneType());
    }

    @Test
    public void planeHasModel(){
        assertEquals("Bomber", plane.getModel());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(2, plane.getCapacity());
    }

    @Test
    public void planeHasWeight(){
        assertEquals(80, plane.getWeight());
    }

    @Test
    public void planeHasBagCapacity(){
        assertEquals(40, plane.getBagCapacity());
    }

}
