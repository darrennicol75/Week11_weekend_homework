import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("George Best", 1, 20);
    }

    @Test
    public void passengerHasName(){
        assertEquals("George Best", passenger.getName());
    }

    @Test
    public void passengerBagNumber(){
        assertEquals(1, passenger.getBagNumber());
    }

    @Test
    public void passengerBagWeight(){
        assertEquals(20, passenger.getBagweight());
    }

}
