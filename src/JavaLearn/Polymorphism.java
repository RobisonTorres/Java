package JavaLearn;

class Polymorphism {


    /*Polymorphism, which refers to the idea of "having many forms", occurs when
    there is a hierarchy of classes related to each other through inheritance.
    A call to a member method will cause a different implementation to be executed,
    depending on the type of the object invoking the method.
    Here is an example: Dog and Cat are classes that inherit from the Animal class.
    Each class has its own implementation of the makeSound() method.*/

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Polymorphism {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Polymorphism {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class MainPo {
    public static void main(String[] args) {
        Polymorphism myAnimal = new Polymorphism();  // Create an Animal object
        Polymorphism myPig = new Pig();  // Create a Pig object
        Polymorphism myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
