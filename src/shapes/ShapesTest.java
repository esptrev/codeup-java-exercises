package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape;
        myShape = new Square(10);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Rectangle(10,15);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

    }















//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(10,6);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimiter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimiter());
//
//        Square sBox1 = new Square(7);
//        System.out.println(sBox1.getArea());
//        System.out.println(sBox1.getPerimiter());
//    }
}
