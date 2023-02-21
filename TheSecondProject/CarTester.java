package TheSecondProject;

public class CarTester {
    public static void main(String[] args) {
        Truck truck=new Truck();
        System.out.println("The price of the truck is "+truck.calculateSalePrice(56000,1000));



        Sedan sedan=new Sedan();
        System.out.println("The price of Sedan is "+ sedan.calculateSalePrice(75000,25));

    }
}
