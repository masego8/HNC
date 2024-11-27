package Lesson2.Exercise;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, double paymentPerHour) {
        super(name, paymentPerHour);
    }
    @Override
    public double calculateSalary() {
        return getPaymentPerHour() * 8;
    }
}
