public class Motorbike extends Vehicles {

    Motorbike(String location, String year, String brand, String condition, double cost, String color) {
        super("Motorbike", location, year, brand, condition, cost, color);
    }
    @Override
    public String toString() {
        return this.type + " "
                + this.brand + " "
                + this.year + " "
                + this.location + " "
                + this.condition + " "
                + this.cost + " "
                + this.color;
    }
    
}
