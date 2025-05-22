package Flyweight_Design_Pattern;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
class ShapeFactory {
    private static final Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getCircle() {
        Shape shape = shapeMap.get("circle");
        if (shape == null) {
            shape = new Circle();
            shapeMap.put("circle", shape);
            System.out.println("Creating new Circle object.");
        }
        return shape;
    }
}