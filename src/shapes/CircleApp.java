package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
       buildCircle();
    }
/// GO BACK AND REDO WITH DOC ROBS INPUT ///
    public static void buildCircle(){
        Input input = new Input();
        Circle circle = new Circle(input.getDouble());
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
        if(input.yesNo("Build again?")) {
            buildCircle();
        }
    }



}
