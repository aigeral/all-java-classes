package Class8;

import java.util.Scanner;

public class LOOpWithString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");

        while(input.next().equalsIgnoreCase("Sha")){
            System.out.println("Great student who always wanted an example with String in loop");
        }
    }

}
