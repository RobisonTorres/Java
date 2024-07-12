package JavaLearn;
import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}
//your code goes here

class Square extends Shape {
    Square(int num) {
        width = num;
    }

    void area() {
        System.out.println(width * width);
    }
}

class Circle extends Shape {
    Circle(int num) {
        width = num;
    }

    void area() {
        System.out.println(Math.PI * width * width);
    }
}

public class ShapesMath {
    public static void main(String[ ] args) {
        Scanner myObj = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}