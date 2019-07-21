import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Passenger passenger;
    Passenger passenger1;
    Passenger passenger2;
    Plane plane;
    Flight flight;

    @Before
    public void setUp() {

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
    public void getFlightDestination(){
        assertEquals("Aberdeen", flight.getFlightDestination());
    }

    @Test
    public void getFlightDeparture(){
        assertEquals("Glasgow", flight.getFlightDeparture());
    }

    @Test
    public void getFlightTime(){
        assertEquals("0830", flight.getFlightTime());
    }


    @Test
    public void checkPlaneEmpty(){
        assertEquals(0, flight.getCount());
    }

    @Test
    public void checkPlaneCapacity(){
        assertEquals(2, plane.getCapacity());
    }


    // Add passenger

//    @Test
//    public void addPassenger(){
//        flight.addPassenger(passenger);
//        assertEquals(1, flight.getCount());
//    }
//


    // Add passenger whilst considering capacity

    @Test
    public void addPassenger(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(2, flight.getCount());
    }

    // Test remaining capacity

    @Test
    public void ReturnSeatAvailability(){
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger);
        assertEquals(0, flight.getAvailableSeats());
    }

    //Remove passenger

    @Test
    public void removePassenger(){
        flight.addPassenger(passenger);
        flight.removePassenger(passenger);
        assertEquals(0, flight.getCount());
    }

    // Bag Capacity/ Flight management

    @Test
    public void getBagCapacity(){
        assertEquals(40, plane.getBagCapacity());
    }

    @Test
    public void addPassengerBags(){
        flight.addPassenger(passenger);
        assertEquals(20, passenger.getBagweight());
    }

    @Test
    public void ReturnBagCapacity(){
        flight.addPassenger(passenger);
        assertEquals(true, flight.hasBagCapacity());
    }
}
