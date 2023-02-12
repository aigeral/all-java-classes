package Class24;

public abstract class Animal {
    //define the speak eat methods and create 3 subclasses and override the speak eat methods

   abstract void speak();
   }




class Horse extends Animal{
    @Override
    void speak() {
        System.out.println("NEEEEIGHOOO");
    }


}
class Hamster extends Animal{
    @Override
    public void speak() {
        System.out.println("khhhkhhh");
    }


}
