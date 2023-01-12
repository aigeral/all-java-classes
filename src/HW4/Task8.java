package HW4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number");
        int number=scanner.nextInt();
        System.out.println("Enter the operator");
        char operator=scanner.next().charAt(0);
        System.out.println("Please Enter the second number");
        int number1=scanner.nextInt();
        if(operator=='+'){
            System.out.println("Result is " +(number+number1));
        }else if(operator=='-'){
            System.out.println("Result is " +(number-number1));
        }else if(operator=='*'){
            System.out.println("Result is " +(number*number1));
        }else if(operator=='/'){
            System.out.println("Result is " +(number/number1));
        }


    }
}
