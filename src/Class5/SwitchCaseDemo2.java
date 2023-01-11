package Class5;

import java.util.Scanner;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender m f");
        char gender=scanner.next().charAt(0);
      switch (gender){
          case 'f':
          case 'F':
              System.out.println("Female");
              break;
          case 'M':
              System.out.println("Male");
              break;
          default:
              System.out.println("not specified");
      }

        }


    }

