package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double lengthAtt, double widthAtt) {
        super(lengthAtt, widthAtt);
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double lengthAtt) {

    }

    @Override
    public void setWidth(double widthAtt) {

    }


    /// First Round prior to absraction and interfaces
//    protected double length;
//    protected double width;
//
//    public Rectangle(int sideA,int sideB) {
//        length = sideA;
//        width = sideB;
//        System.out.println("In rectangle constructor");
//    }
//    public double getPerimiter(){
//        return 2 * length + 2 * width;
//    }
//
//    public double getArea(){
//        return length * width;
//    }
//
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
}
