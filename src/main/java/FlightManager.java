import jdk.jfr.FlightRecorderPermission;

import java.util.ArrayList;

public abstract class FlightManager {

    public static int calculatePassengerBaggageWeight(Passenger passenger){
        return passenger.getNoOfBags() * 15;
    }

    public static int calculateTotalBaggageWeight(Flight flight){
        ArrayList<Passenger> passengers = flight.getPassengers();
        int totalBaggageWeight = 0;
        for (Passenger passenger: passengers){
            int passengerBaggageWeight = FlightManager.calculatePassengerBaggageWeight(passenger);
            totalBaggageWeight += passengerBaggageWeight;
        }
        return totalBaggageWeight;
    }

    public static int calculateRemainingBaggageWeight(Flight flight) {
        int usedBaggageWeight = FlightManager.calculateTotalBaggageWeight(flight);
        Plane plane = flight.getPlane();
        PlaneType planeType = plane.getPlaneType();
        int planeAvailableBaggageWeight = planeType.getTotalBaggageWeight();
        return planeAvailableBaggageWeight - usedBaggageWeight;

    }
}
