package HW3;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner main= new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String card = main.next();
        if (card.equals("Yes")){
            System.out.println("What is your balance?");
            int balance = main.nextInt();

            if(balance>1000){
                System.out.println("You should pay it off immediately");
            }else{
                System.out.println("You can spend more");
            }
        }
        }
    }

