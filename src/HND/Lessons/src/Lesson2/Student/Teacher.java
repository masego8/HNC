package Lesson2.Student;

public class Teacher extends Person {
    String EmpID;
    double Salary;

    public Teacher(String name, String gender, int age, String EmpID, double salary) {
        super(name, age, gender);
        this.EmpID = EmpID;
        this.Salary = Salary;
    }

    public void TeacherInfo() {
        System.out.println("Employee ID: " + EmpID);
        System.out.println("Salary: " + Salary);

    }
}
