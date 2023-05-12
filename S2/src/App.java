import java.util.*;
import java.util.stream.*;

public class App {
    public static void main(String[] args) throws Exception {
        Vehicles v1 = new Motorcycle("Japan", "2020", "Toyota", "Old", 20000, "Red", "mo0907");
        Vehicles v2 = new Bicycle("Australia", "2018", "Xmount", "New", 700, "White", "Yes");
        Vehicles v3 = new Motorbike("Japan", "2016", "Honda", "New", 3000, "Black");
        Vehicles v4 = new Motorbike("Japan", "2017", "Honda", "Old", 2000, "Blue");

        List<Vehicles> vehiclesList = new ArrayList<Vehicles>();
        vehiclesList.add(v1);
        vehiclesList.add(v3);
        vehiclesList.add(v2);
        vehiclesList.add(v4);
        
        String orderByValue = "brand";
        String sortingOrder = "ascending";
        String groupByAttribute = "condition";
        
        orderBy(orderByValue, vehiclesList);
        sortingOrder(sortingOrder, vehiclesList);
        groupBy(groupByAttribute, vehiclesList);

    }
    public static void orderBy(String orderByValue, List<Vehicles> vehiclesList) {
        if(orderByValue == "brand"){
            final Comparator<Vehicles> byBrand = Comparator.comparing(Vehicles::getBrand);
            vehiclesList.sort(byBrand);
        }
    }

    public static void sortingOrder(String sortingOrder, List<Vehicles> vehiclesList) {
        if (sortingOrder == "ascending") {
            for (int i = 0; i < vehiclesList.size(); i++) {
                System.out.println(vehiclesList.get(i));
            }
        }if (sortingOrder == "descending") {
            Collections.sort(vehiclesList, Collections.reverseOrder());
            for (int i = 0; i < vehiclesList.size(); i++) {
                System.out.println(vehiclesList.get(i));
            }
        }
    }
    public static void groupBy(String attribute, List<Vehicles> vehicleList) {
        if (attribute.toLowerCase() == "brand") {
            Map<String, List<Vehicles>> vehicleGrouped = vehicleList.stream()
                    .collect(Collectors.groupingBy(v -> v.brand));
            Iterator<Map.Entry<String, List<Vehicles>>> itr = vehicleGrouped.entrySet().iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
        if (attribute.toLowerCase() == "condition") {
            Map<String, List<Vehicles>> vehicleGrouped = vehicleList.stream()
                    .collect(Collectors.groupingBy(v -> v.condition));
            Iterator<Map.Entry<String, List<Vehicles>>> itr = vehicleGrouped.entrySet().iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }

}
