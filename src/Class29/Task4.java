package Class29;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        java.util.ArrayList<String> drinks=new ArrayList<>();
        drinks.add("vodka");
        drinks.add("vodka");
        drinks.add("vodka");
        drinks.add("vodka");

        for (int i=0;i<drinks.size();i++){
            String drink=drinks.get(i);
            if(drinks.contains("a")||drink.contains("e")){
                drinks.set(i,"water");
            }
            System.out.println(drinks);
        }
    }
}
