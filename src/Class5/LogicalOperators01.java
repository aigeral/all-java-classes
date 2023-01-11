package Class5;

public class LogicalOperators01 {
    public static void main(String[] args) {

        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);
        System.out.println(false||true|false|false);
       boolean boughtCho=true;
       boolean boughtFlowers=true;
       if(boughtCho||boughtFlowers){
           System.out.println("I am happy");
       }else{
           System.out.println("I am sad");
       }
    }
}
