import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Passenger passenger;
    Passenger passenger1;
    Passenger passenger2;
    Flight flight;
    Plane plane;

    @Before
    public void setUp(){
        flight = new Flight("ABZ101", "Aberdeen", "Glasgow", "0830", 2, 40);

        plane = new Plane(PlaneType.SPITFIRE);

        passenger = new Passenger("George Best", 1, 20);
        passenger1 = new Passenger("Pele", 1, 20);
        passenger2 = new Passenger("Maradonna", 1, 20);

        flight.addPlane(plane);
    }


    @Test
    public void getFlightNumber(){
        assertEquals("ABZ101", flight.getFlightNumber());
    }

    @Test
    public void getBagCapacity(){
        assertEquals(40, plane.getBagCapacity());
    }

    @Test
    public void addPassengerBags(){
        flight.addPassenger(passenger);
        assertEquals(20, passenger.getBagweight());
    }

//    @Test
//    public void getRemainingBagCapacity(){
//        assertEquals(20, plane.getBagCapacity());
//    }
}
