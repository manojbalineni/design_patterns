package Flyweight_Design_Pattern;

// Concrete Flyweight
class Circle implements Shape {
    private final String shapeType = "Circle"; // intrinsic state

    @Override
    public void draw(String color) {
        System.out.println("Drawing a " + shapeType + " with color " + color);
    }
}