package Class12;

public class carTester {
    public static void main (String [] args){
        //create the object of the class

        car bmw=new car();
        bmw.make="BMW";
        bmw.model="i7";
        bmw.year=2023;
        bmw.color="Grey";
        bmw.moveForward();
        bmw.applyBrakes();
    }
}
