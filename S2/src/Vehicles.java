/**
 * Vehicles
 */
public abstract class Vehicles {

    String type;
    String location;
    String year;
    String brand;
    String condition;
    double cost;
    String color;

    Vehicles(String type, String location, String year, String brand, String condition, double cost, String color){

        this.type = type;
        this.location = location;
        this.brand = brand;
        this.condition = condition;
        this.color = color;
        this.cost = cost;
        this.year = year;
    }
    public abstract String toString();
    public String getColor(){
        return this.color;
    }
    public String getType(){
        return this.type;
    }
    public String getBrand() {
        return brand;
    }
    public String getCondition() {
        return condition;
    }
    public double getCost() {
        return cost;
    }
    public String getLocation() {
        return location;
    }
    public String getYear() {
        return year;
    }
    
}