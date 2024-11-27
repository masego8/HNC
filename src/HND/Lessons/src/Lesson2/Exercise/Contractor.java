package Lesson2.Exercise;

public class Contractor extends Employee {
    private int workingHours;
    public Contractor(String name, double paymentPerHour, int workingHours ) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return getPaymentPerHour() * workingHours;
    }
}
