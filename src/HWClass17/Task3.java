package HWClass17;

public class Task3 {
    //Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    // and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
    // 3 - from different class inside different package  and observe result.

    String name;
    int age;
    char grade;

    Task3() {

    }

    public Task3(String sName) {
        name = sName;
    }

    private Task3(int sAge) {
        age = sAge;
    }

    protected Task3(String sName, int sAge,char sGrade) {
        name = sName;
        age = sAge;
        char sGrade1 = sGrade;

    }

    public static void main(String[] args) {

        Task3 task3 = new Task3("Shami", 10,'A');

    }

}







