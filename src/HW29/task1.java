package HW29;

import java.util.LinkedHashSet;

public class task1 {
    //Create a Set of cities in which you want to make sure that insertion order is maintained.
    // //Then remove any city that starts with “A”;

    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Fintas");
        cities.add("Sabah al Salem");
        cities.add("Salmiya");
        cities.add("Shuwaikh");

        cities.removeIf(city -> city.startsWith("A"));
        System.out.println(cities);
    }
}
