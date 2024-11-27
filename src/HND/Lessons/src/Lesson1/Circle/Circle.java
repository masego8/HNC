package Lesson1.Circle;

public class Circle {
    public int radius;
    private double area;
    private double perimeter;

    public Circle(int r) {
        this.radius = r;

    }

  public double setRadius(int r) {
        this.radius = r;

        return this.radius;
  }

    public double getArea() {
        this.area = this.radius * this.radius * Math.PI;
        return area;
    }


    public double getPerimeter() {
        this.perimeter = this.radius * Math.PI * 2;
        return perimeter;
    }


}
