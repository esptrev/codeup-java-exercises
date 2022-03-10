package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
protected double length;
protected double width;


    public Quadrilateral(double lengthAtt, double widthAtt) {
        this.length = lengthAtt;
        this.width = widthAtt;
    }


    public double getLength() {
        return length;
    }

    public abstract void setLength(double lengthAtt);

    public double getWidth() {
        return width;
    }

    public abstract void setWidth(double widthAtt);



}
