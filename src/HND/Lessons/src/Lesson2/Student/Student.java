package Lesson2.Student;

public class Student extends Person {
    String StudentID = "123";
    double fees = 20.00;

    public Student(String name, String gender, int age, String StudentID, double fees) {
        super(name, age, gender);
        this.StudentID = StudentID;
        this.fees = fees;
    }

    public void StudentInfo() {
        System.out.println("Student ID: " + StudentID);
        System.out.println("Fees: " + fees);
    }
}
