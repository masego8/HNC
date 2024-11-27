package Lesson2.Exercise;

public abstract class Employee {
    private String name;
    private  double paymentPerHour;

    public Employee(String name, double paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public abstract double calculateSalary();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(double paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
}
