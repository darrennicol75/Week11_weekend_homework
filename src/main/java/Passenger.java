public class Passenger {

    private String name;
    private int bag;
    private int bagweight;

    public Passenger(String name, int bag, int bagweight){
        this.name = name;
        this.bag = bag;
        this.bagweight = bagweight;
    }

    public String getName(){
        return name;
    }

    public int getBagNumber(){
        return bag;
    }

    public int getBagweight(){
        return bagweight;
    }

}
