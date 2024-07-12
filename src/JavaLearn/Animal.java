package JavaLearn;

public class Animal {
    void bark() {
        System.out.println("Woof-Woof");
    }
}

class MyClass1 {
    public static void main(String[ ] args) {
        Animal dog = new Animal();
        dog.bark();
    }
}