package Class30;

import java.util.HashMap;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<Integer,String> building=new HashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"IT department");
        building.put(4,"Account dep");
        building.put(5,"HR");
        building.put(6,"Marketing");
        building.put(7,"Finance");
        System.out.println(building.size());
        building.put(4,"Account dep");
        System.out.println(building);
        building.remove(7);
        System.out.println(building);
    }

}
