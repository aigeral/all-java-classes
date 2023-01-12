package HWClass8;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter two numbers starting point and ending point");
        int start = input.nextInt();
        int end = input.nextInt();
        System.out.println(" start " + start + " end " + end);

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number " + i);
            } else {
                System.out.println("Odd number " + i);
            }

        }
    }
}