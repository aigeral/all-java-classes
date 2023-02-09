package Class21;

public class Animal {

        String name;
        String color="Black";

    }

    class Cat extends Animal{
        String color="white";
        int age=10;
        double weight;
        void printColor(){
            String color="blue";
            System.out.println(super.color);
        }

    }
    class AnimalTester {
        public static void main(String[] args) {

            Cat cat = new Cat();
            System.out.println(cat.color);

        }
    }
