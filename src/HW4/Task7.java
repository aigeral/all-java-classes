package HW4;

import java.util.Scanner;

public class Task7 {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your country");
        String country= scanner.next();
        switch (country){
            case "kuwait":
                System.out.println("arabic");
                break;
            case "Kazakhstan":
                System.out.println("kazakh");
                break;
            case "turkey":
                System.out.println("turkish");
                break;
            case "USA":
                System.out.println("english");
                break;

        }
        System.out.println("From the scale of A to D how will you grade your language skill");
        char grade=scanner.next().charAt(0);
        if(grade=='A'){
            System.out.println("Your entered "+grade+" it is graded excellent");
        }else if(grade=='B'){
            System.out.println("Your entered "+grade+" it is graded good");
        }else if(grade=='C'){
            System.out.println("Your entered "+grade+" it is graded average");
        }else if (grade=='D'){
            System.out.println("Your entered "+grade+" it is graded bad");
        }else{
            System.out.println("Not acceptable");
        }


    }






    }

