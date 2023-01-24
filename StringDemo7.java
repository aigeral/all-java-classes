package Class12;

public class StringDemo7 {
    public static void main(String []args){
        String str="I love Java";
        boolean startsWith=str.startsWith("i");
        System.out.println(startsWith);
        System.out.println(str.endsWith("java"));

        // Method changing is when multiple are called on the same line
        //only those methods can be chained which returns a String
        System.out.println(str.toLowerCase().startsWith("i"));
        //System.out.println(str.length().startsWith("i"));


        System.out.println(str.contains("java"));





    }
}
