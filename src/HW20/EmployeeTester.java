package HW20;

public class EmployeeTester {
    public static void main(String[] args) {
        FullTime full=new FullTime("Mike","$60",123,"Teacher","43 hours");
        Employee employee=new Employee("Mike","$60k",123);
        employee.employee();
        full.info();
    }

}
