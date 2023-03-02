package HW30;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {


    //Create a Map that will store Employee name and salary.
    // Write a logic to retrieve an employee who gets the highest salary.
    // Output should be in the below format
    //John Smith=$100000

    Map<String, Integer> empinfo = new HashMap<>();

        empinfo.put("Ron Smith", 80000);
        empinfo.put("Michael Con", 97000);
        empinfo.put("Rassel Cane", 99000);


    var entrySet = empinfo.entrySet();
    int highest = 0;
    String employee = "";
        for (var e : entrySet) {
        if (e.getValue() > highest) {
            highest = e.getValue();
            employee = e.getKey();

        }
    }
        System.out.println(employee+" "+highest+"$");

}
}






