package Class10;


import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter 5 numbers");
        int [] numbers=new int[5];
         numbers [0]=input.nextInt();
        numbers [1]=input.nextInt();
        numbers [2]=input.nextInt();
        numbers [3]=input.nextInt();
        numbers [4]=input.nextInt();

        for (int i=0;i<numbers.length;i++){
            numbers [i]=input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));


            }

        }


