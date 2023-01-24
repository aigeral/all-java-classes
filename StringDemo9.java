package Class12;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        String str="Java is love";
        char c=str.charAt(0);
        System.out.println(c);


        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));}

        System.out.println("********************");
        int sum = 0;
        for (int a = 0; a < str.length(); a++) {
            if (str.charAt(a) == 'a'){
                sum++;
            }
        }
        System.out.println(sum);


    }
    }

