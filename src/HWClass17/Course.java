package HWClass17;

public class Course {
    //Write a java class that will have a constructor: one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.

    String Name;
    String Duration;
    int Price;

    Course(String cName, String cDuration, int cPrice) {
        Name = cName;
        Duration = cDuration;
        Price = cPrice;

    }

    Course(){

    }



    void printInfo(){
        System.out.println("Name "+Name+" Duration "+Duration+" Price "+Price);


    }







}
