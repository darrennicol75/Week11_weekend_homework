public enum PlaneType {

    BOEING("737A", 4, 160, 80),
    AIRBUS("Dream liner", 3, 120, 60),
    SPITFIRE("Bomber", 2, 80, 40);

    private final String model;
    private final int capacity;
    private final int weight;
    private final int bagCapacity;

    PlaneType(String model, int capacity, int weight, int bagCapacity){
        this.model = model;
        this.capacity = capacity;
        this.weight = weight;
        this.bagCapacity = bagCapacity;
    }


    public String getModel(){
        return model;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getWeight() {
        return weight;
    }

    public int getBagCapacity(){
        return bagCapacity;
    }
}
