package HW3;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner main= new Scanner(System.in);
        System.out.println("Please enter your city");
        String city=main.next();

        System.out.println("Please enter the city temperature");
        double temperature= main.nextDouble();
        temperature=(temperature-32)*5/9;
        System.out.println("The temperature in the city of " + city + " is " + temperature);

    }
}



