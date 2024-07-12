package JavaLearn;

/*
Every Animal makes a sound, but each has a different way to do it.
That's why we define an abstract class Animal, and leave the implementation
of how they make sounds to the subclasses. This is used when there is no
meaningful definition for the method in the superclass.
*/

abstract class Animal1 {
    int legs = 0;
    abstract void makeSound();
}

class Cat extends Animal1 {
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
    }
}