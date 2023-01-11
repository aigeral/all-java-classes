package HW4;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        double num1,num2,num3;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        num1=scan.nextDouble();
        num2=scan.nextDouble();
        num3=scan.nextDouble();
        if((num1>num2) && (num1>num3)){
            System.out.println("The largest number is "+ num1);
        }else if (num2>num1 && num2>num3){
            System.out.println("The largest number is "+ num2);
        }else if (num3>num1 && num3>num2){
            System.out.println("The largest number is "+ num3);
        }
    }
}
