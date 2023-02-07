package HWClass17;

public class Students {
    //Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade.
    // Test Student class for 5 different students with different marks.
    // Your program should print an average mark of each students name.
    //NOTE: please use different names for instance and local variables.
    String name;
    int math;
    int literature;
    int biology;

    Students(String name1,int math1,int literature1,int biology1){
        name=name1;
        math=math1;
        literature=literature1;
        biology=biology1;
    }
    void print(){
        int average=(math+literature+biology)/3;
        System.out.println(name+"'s average score is "+average);
    }
}












