package Flyweight_Design_Pattern;

public class FlyweightDemo {
    public static void main(String[] args) {
        for (String color : new String[]{"Red", "Green", "Blue", "Red"}) {
            Shape circle = ShapeFactory.getCircle();
            circle.draw(color);  // color is extrinsic
        }
    }
}