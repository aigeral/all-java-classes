package HW3;

import java.util.Scanner;

public class Experience {
    public static void main(String[] args) {
        Scanner main = new Scanner(System.in);
        int years=main.nextInt();

        if(years>=5) {
            System.out.println("You are eligible for the bonus");
        }else{
            System.out.println("You are not eligible for the bonus");

            System.out.println("What is your annual salary?");
            int salary = main.nextInt();

            if (salary>50000) {
                System.out.println("Your bonus will be 5000");
            }else{
                System.out.println("Your bonus will be 3000");
            }
        }
    }
}
