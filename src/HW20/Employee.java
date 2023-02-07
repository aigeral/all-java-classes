package HW20;

public class Employee {
    //Create an Employee class that will have variables and methods. Constructor that should initialize
    // instance variables
    //Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    //Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.

    String name;
    String salary;
    int id;

    Employee(String name,String salary,int id){
        this.name=name;
        this.salary=salary;
        this.id=id;

    }
    public void employee(){
        System.out.println("Name "+name+" id"+ id);
    }
}
class FullTime extends Employee{
    String position;
    String hours;
    FullTime(String name,String salary,int id,String position,String hours){
        super(name,salary,id);
        this.position=position;
        this.hours=hours;
    }
    public void info(){
        System.out.println("Position "+position+" hours "+hours+" salary "+salary);
    }

}

class PartTime extends Employee {
    String start;
    String end;

    PartTime(String name, String salary, int id, String start, String end) {
        super(name, salary, id);
        this.start = start;
        this.end = end;
    }

    public void partTime() {
        System.out.println("Part time " + name + " Started on " + start + " and finished at " + end);
    }
}