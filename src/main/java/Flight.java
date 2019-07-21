import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private ArrayList<Plane> plane;
    private ArrayList<FlightManager> bagCapacities;
    private String flightNumber;
    private String flightDestination;
    private String flightDeparture;
    private String flightTime;
    private int capacity;
    private int bagCapacity;

    //Think I could have done this without specifically adding in capacity?

    public Flight(String flightNumber, String flightDestination, String flightDeparture, String flightTime, int capacity, int bagCapacity) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = new ArrayList<Plane>();
        this.bagCapacities = new ArrayList<FlightManager>();
        this.flightNumber = flightNumber;
        this.flightDestination = flightDestination;
        this.flightDeparture = flightDeparture;
        this.flightTime = flightTime;
        this.capacity = capacity;
        this.bagCapacity = bagCapacity;
    }

    // Add plane

    public void addPlane(Plane plane) {
        this.plane.add(plane);
    }

    // Check flight details

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public String getFlightDeparture() {
        return flightDeparture;
    }

    public String getFlightTime() {
        return flightTime;
    }

    // Check plane passenger count

    public int getCount() {
        return this.passengers.size();
    }

    // Check Capacity

    public int getCapacity(){
        return this.plane.size();
    }

    // Add passenger

//    public void addPassenger(Passenger passenger) {
//        this.passengers.add(passenger);
//    }

    // Add passenger and check against flight capacity

    public boolean hasCapacity() {
        return capacity > passengers.size();
    }

    public void addPassenger(Passenger passenger){
        if (hasCapacity()){
            this.passengers.add(passenger);
        }
    }

    public int getAvailableSeats() {
        return capacity -= passengers.size();
    }

    // Remove passenger

    public void removePassenger(Passenger passenger) {
        this.passengers.remove(passenger);
    }

    // Bags capacity

    public boolean hasBagCapacity(){
        return bagCapacity > bagCapacities.size();
    }

}




