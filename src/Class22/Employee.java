package Class22;

public class Employee {
    String name;
    int baseSalary=30000;
    int baseHolidays=10;

    void printSalary(){
        System.out.println(baseHolidays);
    }
    void printHolidays(){
        System.out.println(baseHolidays);
    }

}
class OfficeBoy extends Employee{

}
class Manager extends Employee{
    void printSalary(){
        System.out.println((baseSalary*4)+200000);
    }
    class Developer extends Employee{
        void printSalary(){
            System.out.println((baseSalary*3)+30000);
        }
        void printHolidays(){
            System.out.println(baseHolidays+5);
        }
    }
}
