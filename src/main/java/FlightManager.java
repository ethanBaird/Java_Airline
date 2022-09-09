import java.util.ArrayList;

public abstract class FlightManager {

    public static int calculatePassengerBaggageWeight(Flight flight){
        ArrayList<Passenger> passengers = flight.getPassengers();
        int totalBaggageWeight = 0;
        for (Passenger passenger: passengers){
            int passengerBaggageWeight = passenger.getNoOfBags() * 10;
            totalBaggageWeight += passengerBaggageWeight;
        }
        return totalBaggageWeight;
    }

}
