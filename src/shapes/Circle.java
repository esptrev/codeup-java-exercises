package shapes;

public class Circle {
    private static double radius;

    public Circle(double rad) {
        radius = rad;
    }
    public double getArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }
    public double getCircumference() {
        double circumference = (2 * Math.PI * radius);
        return circumference;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(1.0);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

    }


}
