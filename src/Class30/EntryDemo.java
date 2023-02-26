package Class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class EntryDemo {
    public static void main(String[] args) {
        Set<Entry>entrySet=new LinkedHashSet<>();
        entrySet.add(new Entry(1,"Nezir"));
        entrySet.add(new Entry(2,"Shah"));
        entrySet.add(new Entry(3,"Tami"));
        entrySet.add(new Entry(4,"Nezir"));
        entrySet.add(new Entry(5,"Ruquia"));
        entrySet.add(new Entry(6,"Saba"));
        //remove those objects for which value of key is
        //greater than2 and value contains the letter i
        Entry entry=new Entry(1,"Nezir");
        System.out.println(entry.getKey()+" "+entry.getValue());
        entrySet.removeIf(x->x.getKey()>2&&x.getValue().contains("i"));
        System.out.println(entrySet);

    }
}
