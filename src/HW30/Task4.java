package HW30;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        //Create the collection that will store single uniques Objects of a String type in which order is preserved.
        //Write a logic to concatenate all string from the collection.

        Set<String> s = new LinkedHashSet<>();

        s.add("I");
        s.add("need a");
        s.add("rest");

        for (String j:s){
            System.out.println(j+" ");
        }


    }


}



