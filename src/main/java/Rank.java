public enum Rank {
    CAPTAIN(1),
    FIRSTMATE(2),
    FLIGHTATTENDANT(3);

    private int value;

    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

