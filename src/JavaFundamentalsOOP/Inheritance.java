package JavaFundamentalsOOP;

class Animal {

    String name;
    String species;
    // Constructor
    public Animal(String name, String species){
        this.name = name;
        this.species = species;
    }
}

class Dog extends Animal{

    // Constructor
    public Dog(String name, String species){
        super(name, species);
    }
    void bark(){
        System.out.println(this.name + " is barking.");
    }
}

class Bird extends Animal {

    public Bird(String name, String species){
        super(name, species);
    }
    // Method in the superclass
    void makeSound(){
        System.out.println(name + " makes a sound.");
    }
}

class Sparrow extends Bird {

    public Sparrow(String name, String species){
        super(name, species);
    }
    // Overriding the method from superclass
    @Override
    void makeSound(){

        // Calling the parent class's description method
        super.makeSound();
        System.out.println("It chirps.");
    }
}

public class Inheritance {

    public static void main(String[] args){

        Dog newDog = new Dog("Big", "Dog");
        System.out.println(newDog.name);
        System.out.println(newDog.species);
        newDog.bark();
        System.out.println();
        Sparrow flyer = new Sparrow("Captain", "Bird");
        System.out.println(flyer.name);
        System.out.println(flyer.species);
        flyer.makeSound();
    }
}