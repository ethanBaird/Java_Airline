public class Passenger extends Person {

    private int noOfBags;
    private String flightNumber;

    public Passenger(String name, int noOfBags) {
        super(name);
        this.noOfBags = noOfBags;
    }

    public int getNoOfBags() {
        return noOfBags;
    }

    public String getFlight(){
        return this.flightNumber;
    }

    public void addFlight(String flightNumber){
        this.flightNumber = flightNumber;
    }
}
