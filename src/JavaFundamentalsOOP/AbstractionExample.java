package JavaFundamentalsOOP;

// Abstract Shape class defining common behavior
abstract class Shape {
    // Abstract method to calculate the area of the shape
    public abstract double calculateArea();
}

// Concrete Circle class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete Rectangle class
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Create instances of shapes
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Calculate and display the areas
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}

