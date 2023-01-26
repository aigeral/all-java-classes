package HWClass13;

public class task2 {
    public static void main(String[] args) {
        String str="hdhfsJGFGFJ%^%&^*(";
        System.out.println(str.replaceAll("[^A-Za-z0-9]","").length());
    }
}
