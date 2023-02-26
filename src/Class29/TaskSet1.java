package Class29;

import java.util.TreeSet;

public class TaskSet1 {
    public static void main(String[] args) {
        //Create a SEt collection in which you need to add names of the countries.
        //In this set we want all objects  to be sorted in alphabetical order.
        //Using 2 different ways retrieve all elements from set.
        TreeSet<String> countries=new TreeSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Canada");
        countries.add("Mexico");
        countries.add("India");
        System.out.println(countries);
        for(String x:countries) {
            System.out.print(x + " ");


        }
    }
}
