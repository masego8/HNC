package Lesson2.Exercise;

public class Main {
    public static void main(String[] args) {

        Employee contractor = new Contractor("Jason",17.50, 40);
        Employee fullTimeEmployee = new FullTimeEmployee("Damian", 15.65);
        System.out.println("Contractor Salary: £"+ contractor.calculateSalary());
        System.out.println("Employee Salary: £"+ fullTimeEmployee.calculateSalary());
    }
}
