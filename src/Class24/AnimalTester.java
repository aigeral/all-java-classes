package Class24;

public class AnimalTester {
    public static void main(String[] args) {
        Animal [] arr={new Horse(),new Hamster()};
        for (Animal animal:arr){
            animal.speak();
        }
    }
}
