import java.util.*;
import java.util.stream.*;

public class App {
    final static Vehicles v1 = new Motorcycle("Japan", "2020", "Toyota", "Old", 20000, "Red", "mo0907");
    final static Vehicles v2 = new Bicycle("Australia", "2018", "Xmount", "New", 700, "White", "Yes");
    final static Vehicles v3 = new Motorbike("Japan", "2016", "Honda", "New", 3000, "Black");
    final static Vehicles v4 = new Motorbike("Japan", "2017", "Honda", "Old", 3000, "Blue");

    private List<Vehicles> _vehiclesList = new ArrayList<Vehicles>();

    public static void main(String[] args) throws Exception {
        App app = new App();
        List<Vehicles> vehiclesList = app.getVehicles();
        vehiclesList.add(v1);
        vehiclesList.add(v3);
        vehiclesList.add(v2);
        vehiclesList.add(v4);

        String orderByValue = "brand";
        String sortingOrder = "descending";
        String groupByAttribute = "brand";

        app.orderBy(orderByValue, vehiclesList);
        app.sortingOrder(sortingOrder, vehiclesList);
        app.groupBy(groupByAttribute, vehiclesList);
    }

    public void orderBy(String orderByValue, List<Vehicles> vehiclesList) {
        Comparator<Vehicles> byBrand = Comparator.comparing(Vehicles::getBrand);
        Comparator<Vehicles> byType = Comparator.comparing(Vehicles::getType);
        Comparator<Vehicles> byLocation = Comparator.comparing(Vehicles::getLocation);
        Comparator<Vehicles> byColor = Comparator.comparing(Vehicles::getColor);
        Comparator<Vehicles> byYear = Comparator.comparing(Vehicles::getYear);
        Comparator<Vehicles> byCost = Comparator.comparing(Vehicles::getCost);
        Comparator<Vehicles> byCondition = Comparator.comparing(Vehicles::getCondition);
        if (orderByValue == "brand") {
            vehiclesList.sort(byBrand);
        } else if (orderByValue == "condition") {
            vehiclesList.sort(byCondition);
        } else if (orderByValue == "year") {
            vehiclesList.sort(byYear);
        } else if (orderByValue == "color") {
            vehiclesList.sort(byColor);
        } else if (orderByValue == "location") {
            vehiclesList.sort(byLocation);
        } else if (orderByValue == "cost") {
            vehiclesList.sort(byCost);
        } else if (orderByValue == "type") {
            vehiclesList.sort(byType);
        }
    }

    public void sortingOrder(String sortingOrder, List<Vehicles> vehiclesList) {
        if (sortingOrder == "ascending") {
            for (int i = 0; i < vehiclesList.size(); i++) {
                System.out.println(vehiclesList.get(i));
            }
        } else if (sortingOrder == "descending") {
            Collections.reverse(vehiclesList);
            for (int i = 0; i < vehiclesList.size(); i++) {
                System.out.println(vehiclesList.get(i));
            }
        }
    }

    public void groupBy(String attribute, List<Vehicles> vehicleList) {

        Map<String, List<Vehicles>> vehicleGrouped = vehicleList.stream()
                .collect(Collectors.groupingBy(v -> attribute.toLowerCase()));
        // Map<String, List<Vehicles>> vehicleGrouped_Tmp = new HashMap<>();
        // for (int i=0; i<vehicleList.size(); i++) {

        // Vehicles v = vehicleList.get(i);
        // List<Vehicles> vlist = vehicleGrouped_Tmp.get(v.brand); // get list of
        // vehicles by its brand
        // vlist.add(v);
        // }
        Iterator<Map.Entry<String, List<Vehicles>>> itr = vehicleGrouped.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

    public List<Vehicles> getVehicles() {
        return this._vehiclesList;
    }

}
