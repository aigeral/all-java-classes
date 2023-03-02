package HW30;

import java.util.ArrayList;
import java.util.Collection;

public class Task5 {
    //Create a collection of integers in which you can keep duplicates.
    //Write a logic to find sum of all integers
    public static void main(String[] args) {
        Collection<Integer> intList = new ArrayList<>();

        intList.add(3);
        intList.add(45);
        intList.add(33);
        intList.add(34);
        intList.add(10);
        intList.add(5);

        var sum = 0;

        for (var num :intList){
            sum+=num;
        }
        System.out.println("The summary of all Integers is "+sum);



    }


}








