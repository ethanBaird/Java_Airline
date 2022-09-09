import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
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
    public void canCalcPassengerBaggageWeight(){
        int actual = FlightManager.calculatePassengerBaggageWeight(passenger);
        assertEquals(30, actual);
    }

    @Test
    public void canCalculateFlightTotalBaggageWeight(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        int actual = FlightManager.calculateTotalBaggageWeight(flight);
        assertEquals(60, actual);
    }

    @Test
    public void canCalculateRemainingBaggageWeight(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        int actual = FlightManager.calculateRemainingBaggageWeight(flight);
        assertEquals(440, actual);
    }
}
