import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Date departureTime;
    private ArrayList<Pilot> testPilots;
    private ArrayList<CabinCrewMember> testCabinCrewMembers;
    private ArrayList<Passenger> testPassengers;

    private Pilot pilot;
    private CabinCrewMember cabinCrewMember;
    private Passenger passenger;

    private Plane plane;

    private Flight flight;

    @Before
    public void before(){
        departureTime = new Date(2022, 9, 9,7,0);

        testPilots = new ArrayList<>();
        testCabinCrewMembers = new ArrayList<>();
        testPassengers = new ArrayList<>();

        pilot = new Pilot("Ethan", Rank.CAPTAIN, "LN100");
        cabinCrewMember = new CabinCrewMember("Rachel", Rank.FLIGHTATTENDANT);
        passenger = new Passenger("Minnie", 2);

        testPilots.add(pilot);
        testCabinCrewMembers.add(cabinCrewMember);

        plane = new Plane(PlaneType.BOEING747);

        flight = new Flight(testPilots, testCabinCrewMembers, testPassengers, plane, "FN123", "GLA", "EDB", departureTime);
    }

    @Test
    public void hasPilot(){
        int actual = flight.getPilots().size();
        assertEquals(1, actual);
    }

    @Test
    public void hasCabinCrewMembers(){
        int actual = flight.getCabinCrewMembers().size();
        assertEquals(1, actual);
    }

    @Test
    public void startsWithNoPassengers(){
        int actual = flight.getPassengers().size();
        assertEquals(0, actual);
    }

    @Test
    public void hasPlane(){
        int actual = flight.getPlane().getPlaneType().getValue();
        assertEquals(1, actual);
    }

    @Test
    public void hasOtherAttributes(){
        assertEquals("FN123", flight.getFlightNumber());
        assertEquals("GLA", flight.getDestination());
        assertEquals("EDB", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        Date actual = flight.getDepartureTime();
        assertEquals(departureTime, actual);
    }

    @Test
    public void canGetPassengerCount(){
        testPassengers.add(passenger);
        assertEquals(1, flight.getPassengerCount());
    }

    @Test
    public void canGetNumberOfAvailableSeatsWhenEmpty(){
        int actual = flight.getAvailableSeats();
        assertEquals(100, actual);
    }

    @Test
    public void canGetAvailableSeatsAfterPassengerAdded(){
        testPassengers.add(passenger);
        assertEquals(99, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger);
        assertEquals(99, flight.getAvailableSeats());
        assertEquals(1, flight.getPassengerCount());
        assertEquals(flight.getFlightNumber(), passenger.getFlight());
    }

}
