public class Bicycle extends Vehicles {
    String foldable;
    public Bicycle(String location, String year, String brand, String condition, double cost, String color, String foldable) {
        super("Bicycle", location, year, brand, condition, cost, color);
        this.foldable = foldable;
    }
    public String getFoldable() {
        return foldable;
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
                + this.foldable;
    }
    
}
