package designpattern.factory;

public class ShapeFactory {

    public static Shape getShape(String input){
        switch (input){
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            default:
                return null;

        }
    }
}
