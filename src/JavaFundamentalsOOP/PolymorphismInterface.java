package JavaFundamentalsOOP;

import java.util.ArrayList;
import java.util.List;

// Define an interface for shapes
interface ShapeII {
    double calculateArea();
}

// Class representing a Circle that implements the Shape interface
class CircleIII implements ShapeII {
    private double radius;

    public CircleIII(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Class representing a Rectangle that implements the Shape interface
class RectangleIII implements ShapeII {
    private double width;
    private double height;

    public RectangleIII(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Class to calculate the total area of a list of shapes
class ShapeCalculator {

    // You can call a static method directly on the class itself without creating an instance.
    public static double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}

public class PolymorphismInterface {
    public static void main(String[] args) {
        // Create a list of shapes
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(4.0, 6.0));

        // Calculate and print the total area using dynamic polymorphism
        double totalArea = ShapeCalculator.calculateTotalArea(shapes);
        System.out.println("Total Area of Shapes: " + totalArea);
    }
}
