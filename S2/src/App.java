import java.util.*;
import java.util.Map.Entry;
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
        String sortingOrder = "descending";
        String groupByAttribute = "cost";

        orderBy(orderByValue, vehiclesList);
        sortingOrder(sortingOrder, vehiclesList);
        groupBy(groupByAttribute, vehiclesList);

    }
    public static void orderBy(String orderByValue, List<Vehicles> vehiclesList) {
        Comparator<Vehicles> byBrand = Comparator.comparing(Vehicles::getBrand);
        Comparator<Vehicles> byType = Comparator.comparing(Vehicles::getType);
        Comparator<Vehicles> byLocation = Comparator.comparing(Vehicles::getLocation);
        Comparator<Vehicles> byColor = Comparator.comparing(Vehicles::getColor);
        Comparator<Vehicles> byYear = Comparator.comparing(Vehicles::getYear);
        Comparator<Vehicles> byCost = Comparator.comparing(Vehicles::getCost);
        Comparator<Vehicles> byCondition = Comparator.comparing(Vehicles::getCondition);
        if(orderByValue == "brand"){ 
            vehiclesList.sort(byBrand);
        }
        if(orderByValue == "condition"){
            vehiclesList.sort(byCondition);
        }
        if(orderByValue == "year"){
            vehiclesList.sort(byYear);
        }
        if(orderByValue == "color"){
            vehiclesList.sort(byColor);
        }
        if(orderByValue == "location"){
            vehiclesList.sort(byLocation);
        }
        if(orderByValue == "cost"){
            vehiclesList.sort(byCost);
        }
        if(orderByValue == "type"){
            vehiclesList.sort(byType);
        }
        
    }

    public static void sortingOrder(String sortingOrder, List<Vehicles> vehiclesList) {
        if (sortingOrder == "ascending") {
            
            for (int i = 0; i < vehiclesList.size(); i++) {
                System.out.println(vehiclesList.get(i));
            }
        }else if (sortingOrder == "descending") {
            Collections.reverse(vehiclesList);
            for (int i = 0; i < vehiclesList.size(); i++) {
                System.out.println(vehiclesList.get(i));
            }
        }
    }
    public static void groupBy(String attribute, List<Vehicles> vehicleList) {
        if (attribute.toLowerCase() == "brand") {
            Map<String, List<Vehicles>> vehicleGrouped = vehicleList.stream()
                    .collect(Collectors.groupingBy(v -> v.brand));

            // Map<String, List<Vehicles>> vehicleGrouped_Tmp = new HashMap<>();
            // for (int i=0; i<vehicleList.size(); i++) {

            //     Vehicles v = vehicleList.get(i);
            //     List<Vehicles> vlist = vehicleGrouped_Tmp.get(v.brand); // get list of vehicles by its brand
            //     vlist.add(v);
            // }   

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
        if (attribute.toLowerCase() == "type") {
            Map<String, List<Vehicles>> vehicleGrouped = vehicleList.stream()
                    .collect(Collectors.groupingBy(v -> v.type));
            Iterator<Map.Entry<String, List<Vehicles>>> itr = vehicleGrouped.entrySet().iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
        if (attribute.toLowerCase() == "location") {
            Map<String, List<Vehicles>> vehicleGrouped = vehicleList.stream()
                    .collect(Collectors.groupingBy(v -> v.location));
            Iterator<Map.Entry<String, List<Vehicles>>> itr = vehicleGrouped.entrySet().iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
        if (attribute.toLowerCase() == "color") {
            Map<String, List<Vehicles>> vehicleGrouped = vehicleList.stream()
                    .collect(Collectors.groupingBy(v -> v.color));
            Iterator<Map.Entry<String, List<Vehicles>>> itr = vehicleGrouped.entrySet().iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
        if (attribute.toLowerCase() == "year") {
            Map<String, List<Vehicles>> vehicleGrouped = vehicleList.stream()
                    .collect(Collectors.groupingBy(v -> v.year));
            Iterator<Map.Entry<String, List<Vehicles>>> itr = vehicleGrouped.entrySet().iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
        if (attribute.toLowerCase() == "cost") {
            Map<Object, List<Vehicles>> vehicleGrouped = vehicleList.stream()
            .collect(Collectors.groupingBy(v -> v.cost));
            Iterator<Entry<Object, List<Vehicles>>> itr = vehicleGrouped.entrySet().iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }

}
