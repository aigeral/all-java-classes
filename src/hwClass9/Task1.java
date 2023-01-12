package hwClass9;

import java.util.Scanner;

public class Task1 {
    //Write a program to ask a user to enter item they want to buy and the price of that item. User will
    //       be entering 5 items. Every time user enters price accumulate the price and tell the user how much
    //        totalPrice that they should pay.
    //        If user give more money program should return a change. Whenever a user done with payments program
    //        should say "Thank you for shopping!"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;
        for (int i = 0; i < 3; i++) {

            System.out.println("Please Enter the item and its price");
            String itemName = scanner.next();
            double itemPrice = scanner.nextDouble();
            totalPrice = totalPrice + itemPrice;
            System.out.println("This is the totalPrice amount that you have to pay " + totalPrice);
        }
        System.out.println("Please pay for the items");
        double amountPaid = scanner.nextDouble();

        if (amountPaid > totalPrice) {
            double chang = amountPaid - totalPrice;
            System.out.println("Hey here is your change " + chang);
        } else if (amountPaid < totalPrice) {
            System.out.println();
        }
        System.out.println("Thank you for shopping!");

    }
}
