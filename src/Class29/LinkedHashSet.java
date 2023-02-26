package Class29;

public class LinkedHashSet {
    public static void main(String[] args) {
        //does not allow duplicates and retains the insertion order
        java.util.LinkedHashSet<String> fruit = new java.util.LinkedHashSet<>();
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Banana");
        fruit.add("Kiwi");
        fruit.add("Apple");
        System.out.println(fruit);



    }
}
