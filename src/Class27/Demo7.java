package Class27;

import java.util.ArrayList;
import java.util.logging.SocketHandler;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Fizzy");
        names.add("Abeera");
        names.add("Ron");
        names.add("Lara");
        names.add("Diego");
        names.add("Urwa");
        System.out.println(names.contains("Daria"));
        System.out.println(names);
        names.remove("Ron");
        System.out.println(names);
        names.set(3,"Sam");
        System.out.println(names);
        System.out.println(names.indexOf("Abeera"));
    }
}
