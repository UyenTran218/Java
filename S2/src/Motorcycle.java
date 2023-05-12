public class Motorcycle extends Vehicles {
    String vinID;

    public Motorcycle(String location, String year, String brand, String condition, double cost,
            String color, String vinID) {
        super("Motorcycle", location, year, brand, condition, cost, color);

        this.vinID = vinID;
    }

    public String getVinID() {
        return vinID;
    }

    @Override
    public String toString() {
        return this.type + " "
                + this.brand + " "
                + this.year + " "
                + this.location + " "
                + this.condition + " "
                + this.cost + " "
                + this.color + " "
                + this.vinID;
    }

}
