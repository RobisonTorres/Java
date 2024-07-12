package JavaLearn;

// An interface is a completely abstract class that contains only abstract methods.

interface Animal2 {
    void eat();
    void makeSound();
}

class Cat1 implements Animal2 {
    public void makeSound() {
        System.out.println("Meow");
    }
    public void eat() {
        System.out.println("omnomnom");
    }
}

public class Interface {
    public static void main(String[] args) {
        Cat1 c = new Cat1();
        c.eat();
    }
}
