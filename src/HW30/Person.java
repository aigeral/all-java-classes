package HW30;

import java.util.Map;
import java.util.TreeMap;

public class Person {
    //Create a Person class with following private fields: name, lastName, age, salary.
    //Variables should be initialized through constructor.
    //Inside the class also create a method to print user details.
    //In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.
    private  String name;
    private String LastName;
    private int age;
    private double salary;
    public Person(String nme,String LastName,int age,double salary){
        this.name=name;
        this.LastName=LastName;
        this.age=age;
        this.salary=salary;
    }

    public void printDetails(){
        System.out.println(name+ " "+ LastName+ " "+age +" "+ salary);
    }

    public class PersonTester{
    }

    public static void main(String[] args) {
        Map<Integer,Person> personMap= new TreeMap<>();

        Person person1=new Person("Ron", "Smith",33,97000.0);
        Person person2=new Person("Nelly","Key", 44,85000.0);
        Person person3=new Person  ("Sam","Ken",23,28777.0);

        personMap.put(1,person1);
        personMap.put(2,person2);
        personMap.put(3,person3);

        for (Person person: personMap.values()){
            person.printDetails();
            System.out.println();
        }



    }








}
