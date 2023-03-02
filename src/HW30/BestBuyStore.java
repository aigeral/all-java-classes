package HW30;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BestBuyStore {
    public static void main(String[] args) {


    //Create a map of Best Buy store. Place
    //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
    //Retrieve all keys and values from a Best Buy map using EntrySet.


    Map<Integer,String>bestbuy=new TreeMap<>();

    bestbuy.put(232323,"Printer");
    bestbuy.put(756734,"TV");
    bestbuy.put(353536,"Laptop");
    bestbuy.put(543463,"Phone");
    bestbuy.put(6356217,"Tablet");

        Set<Map.Entry<Integer,String>>entrySet=bestbuy.entrySet();
        for(Map.Entry<Integer,String> entry:bestbuy.entrySet()){
            System.out.println("Item ID is "+ entry.getKey()+" item name is "+ entry.getValue());
        }



    }
}
