package Lesson1.Circle;

public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        System.out.println("Circle 1:");
        System.out.println("Area = " + circle1.getArea());
        System.out.println("Perimeter = " + circle1.getPerimeter() + "\n");


        Circle circle2 = new Circle(5);

        System.out.println("Circle 2:");
        System.out.println("Area = " + circle2.getArea());
        System.out.println("Perimeter = " + circle2.getPerimeter() + "\n");

        System.out.println("Circle 2:");
        System.out.println("New Radius = " + circle2.setRadius(8));
        System.out.println("Area = " + circle2.getArea());
        System.out.println("Perimeter = " + circle2.getPerimeter() + "\n");




    }
}
