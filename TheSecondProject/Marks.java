package TheSecondProject;

public abstract class Marks {
    //We have to calculate the average of marks obtained in three subjects by student A and by student B.
    // Create class 'Marks' with an abstract method 'getPercentage' that will be returning
    // the average percentage of marks. Provide implementation of abstract method in classes 'A' and 'B'.
    // The constructor of student A takes the marks in three subjects as its parameters
    // and the marks in four subjects as its parameters for student B.
    // Test your code
    abstract void getPercentage ();
}
class StudentA extends Marks {
    int Math;
    int History;
    int PE;

    StudentA(int Math, int History, int PE) {
        this.Math = Math;
        this.History = History;
        this.PE = PE;
    }

    @Override
    void getPercentage() {
        double averageGrade = (Math + History + PE) / 3;
        if (averageGrade >= 90) {
            System.out.println("StudentA's average mark is A");
        } else if (averageGrade >= 80 && averageGrade < 90) {
            System.out.println("StudentA's average mark is B");
        } else if (averageGrade >= 70 && averageGrade < 80) {
            System.out.println("StudentA's average mark is C");
        } else if (averageGrade >= 50 && averageGrade < 70) {
            System.out.println("StudentA's average mark is D");
        } else {
            System.out.println("StudentA's mark is F");

        }
    }
}
class StudentB extends Marks {
    int Math;
    int History;
    int PE;
    int Geography;

    StudentB(int Math, int History, int PE, int Geography) {
        this.Math = Math;
        this.History = History;
        this.PE = PE;
        this.Geography = Geography;
    }

    @Override
    void getPercentage() {
        double AverageGrade = (Math + History + PE + Geography) / 4;
        if (AverageGrade >= 90) {
            System.out.println("StudentB's average mark is A");
        } else if (AverageGrade >= 80 && AverageGrade < 90) {
            System.out.println("StudentB's average mark is B");
        } else if (AverageGrade >= 70 && AverageGrade < 80) {
            System.out.println("StudentB's average mark is C");
        } else if (AverageGrade >= 50 && AverageGrade < 70) {
            System.out.println("StudentB's average mark is D");
        } else {
            System.out.println("StudentB's average mark is F");
        }
    }
}

