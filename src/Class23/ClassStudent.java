package Class23;

public class ClassStudent {
    //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    //Define common behavior within parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Write example of achieving run time polymorphism

    void eat() {
        System.out.println("Students eat during the break");
    }

    void sleep() {
        System.out.println("Students sleep during the break");
    }

    void talk() {
        System.out.println("Students talk during the class");
    }

}

class SyntaxStudent extends ClassStudent {
    @Override
    void eat() {
        System.out.println("Syntax students also eat during the break");
    }

    @Override
    void sleep() {
        System.out.println("Syntax students also sleep during the break");
    }

    @Override
    void talk() {
        System.out.println("Syntax students also talk during the class");
    }
}

class CollegeStudent extends ClassStudent {
    @Override
    void eat() {
        System.out.println("College students do not eat during the break");
    }

    @Override
    void sleep() {
        System.out.println("College students do not sleep during the break");
    }

    @Override
    void talk() {
        System.out.println("College students do not talk during the class");
    }

    public static void main(String[] args) {

        ClassStudent[] students = {new SyntaxStudent(), new CollegeStudent()};

        for (ClassStudent s : students) {
            s.eat();
            s.talk();
            s.sleep();
        }

    }
}
