package Class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Sam f");
        studentsMap.put(4,"Aisha");
        System.out.println(studentsMap);
        System.out.println(studentsMap.get(3));
        System.out.println(studentsMap.size());
        System.out.println(studentsMap.containsKey(5));
        System.out.println(studentsMap.containsValue("Aisha"));
        System.out.println(studentsMap.remove(1));
        System.out.println(studentsMap);

        }
    }
