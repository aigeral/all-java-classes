package Class13;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        String str="FSWGEDSNGEhjkjk6757676887*&^&**";
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[a-z]","&&&&&&&&&&&"));
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));
    }
}
