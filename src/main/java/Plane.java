public class Plane {

    private PlaneType planetype;

    public Plane(PlaneType planetype){
        this.planetype = planetype;
    }

    public PlaneType getPlaneType(){
        return planetype;
    }

    public String getModel(){
        return this.planetype.getModel();
    }

    public int getCapacity(){
        return this.planetype.getCapacity();
    }

    public int getWeight(){
        return this.planetype.getWeight();
    }

    public int getBagCapacity() {
        return this.planetype.getBagCapacity();
    }
}
