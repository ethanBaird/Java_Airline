import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

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
        testPilots = new ArrayList<>();
        testCabinCrewMembers = new ArrayList<>();
        testPassengers = new ArrayList<>();

        pilot = new Pilot("Ethan", Rank.CAPTAIN, "LN100");
        cabinCrewMember = new CabinCrewMember("Rachel", Rank.FLIGHTATTENDANT);

        testPilots.add(pilot);
        testCabinCrewMembers.add(cabinCrewMember);
        testPassengers.add(passenger);

        plane = new Plane(PlaneType.BOEING747);

        flight = new Flight(testPilots, testCabinCrewMembers, testPassengers, plane, "FN123", "GLA", "EDB", "0700");
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

    

}
