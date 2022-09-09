public enum PlaneType {
    BOEING747(1),
    AIRBUSA300(2);

    private int value;

    PlaneType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
