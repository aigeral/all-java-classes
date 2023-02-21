package Class28;

import Class17.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerycArrayList {

    public static void main(String[] args) {
       // ArrayList<String> name=new ArrayList<>();
        Object a=new String("some value");
        Object b=new Integer(10);
        Object c =new Scanner(System.in);

        ArrayList name=new ArrayList<>();
        name.add("Zafar");
        name.add(10);
        name.add('a');


        for(Object j:name){
            ((String)j).trim();
        }

    }
}
