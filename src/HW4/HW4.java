package HW4;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your heights in inches");
        int height=scan.nextInt();
        if(height<60){
            System.out.println("Short");
        }else if(height>=60){
            System.out.println("Medium");
        }else if(height>72){
            System.out.println("Tall");
        }














    }
}


