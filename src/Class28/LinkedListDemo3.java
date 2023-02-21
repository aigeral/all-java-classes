package Class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        //LinkedList=>57 ms
        //ArrayList=>2871
        long startTime=System.currentTimeMillis();
       ArrayList<String> numbers=new ArrayList<>();
        for(int i=0;i<100000;i++){
            numbers.add(0,"Test Data");
        }

        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
