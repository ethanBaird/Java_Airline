public enum PlaneType {
    BOEING747(1, 100, 1000),
    AIRBUSA300(2, 200, 2000);

    private int value;
    private int capacity;
    private int totalWeight;

    PlaneType(int value, int capacity, int totalWeight) {
        this.value = value;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getValue() {
        return value;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
