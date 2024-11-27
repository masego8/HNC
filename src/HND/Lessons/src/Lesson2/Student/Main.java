package Lesson2.Student;


public class Main {
    public static void main(String[] args) {
       Person p1 = new Person("John",22,"Male");
       Student s1 = new Student("Paul", "Male", 31, "94939", 10000);

       s1.PersonInfo();
       s1.StudentInfo();
       p1.PersonInfo();

    }
}
