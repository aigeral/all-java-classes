package HW4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your  quiz score");
        int quizScore=scan.nextInt();
        System.out.println("Please Enter your mid term score");
        int midTermScore=scan.nextInt();
        System.out.println("Please Enter your final score");
        int finalScore=scan.nextInt();
        int averageScore=(quizScore+midTermScore+finalScore)/3;
        System.out.println("Your average score is " +averageScore);
        if(averageScore>=90){
            System.out.println("grade A");
        } else if (averageScore>=70 && averageScore<90){
            System.out.println("grade B");
        }else if (averageScore>=50 && averageScore<70) {
            System.out.println("grade C");
        }else if(averageScore<50){
            System.out.println("grade F");

        }


    }
}
