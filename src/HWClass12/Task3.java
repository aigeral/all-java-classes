package HWClass12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Write a program that reads two people's first
        //names and if they expecting boy or girl?
        //Based on the input suggests a name for a baby:
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? boy
        //Suggested baby name: DANRY



        String momname = "Mary";

        String dadname = "Daniel";

        String expectation= "girl";
        String firstHalf="";
        String secondHalf="";

        if (expectation.equalsIgnoreCase("boy")) {
          firstHalf = dadname.substring(0, dadname.length() / 2);
            secondHalf = momname.substring(momname.length() / 2);


        }else {
            firstHalf=momname.substring(0,momname.length()/2);
            secondHalf=dadname.substring(0,dadname.length()/2);
        }
        System.out.println(firstHalf + secondHalf);
    }

}









