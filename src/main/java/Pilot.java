public class Pilot extends Person{

    private Rank rank;
    private String licenseNumber;

    public Pilot(String name, Rank rank, String licenseNumber) {
        super(name);
        this.rank = rank;
        this.licenseNumber = licenseNumber;
    }

    public Rank getRank() {
        return rank;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
}
