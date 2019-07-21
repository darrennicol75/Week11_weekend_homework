import java.util.ArrayList;

public class FlightManager {

    private ArrayList<Passenger> passengers;
    private ArrayList<Flight> flight;
    private ArrayList<FlightManager> bagCapacities;
    private ArrayList<Plane> plane;

    public FlightManager() {
        this.passengers = new ArrayList<Passenger>();
        this.flight = new ArrayList<Flight>();
        this.bagCapacities = new ArrayList<FlightManager>();
        this.plane = new ArrayList<Plane>();
    }

    public void addFlight(Flight flight) {
        this.flight.add(flight);
    }

//    public int getRemainingBagCapacity() {
//        return bagCapacities -= plane.getBagCapacity();
//    }
}




