package Class20;

public class JavaTeacher extends Teacher {
    void code(){
        System.out.println("Java teacher teaches how to code");
    }
    public static void main(String[]args){
        JavaTeacher java=new JavaTeacher();
        java.teacherName="Asel";
        java.teacherId="123";


        java.homework();
        java.grade();
        java.scholarship();
    }
}
