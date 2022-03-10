package shapes;

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double side) {
        this.length = side;
//        this.length = this.width = side;  Doc Rob version
    }

    @Override
    public void setWidth(double side) {
    this.width = side;
//    this.length = this.width = side;  Doc Rob version
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }


//    public Square(int sideC) {
//        super(sideC, sideC);
//        System.out.println("In the square");
//    }
//    public double getPerimiter(){
//        System.out.println("OVERRIDING SQ PERIMITER METHOD");
//        return 2 * length + 2 * width;
//    }
//
//    public double getArea(){
//        System.out.println("OVERRIDING SQ AREA METHOD");
//        return length * width;
//    }







}




