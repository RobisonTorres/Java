package javalearn;

class Polymorphism {
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
        Polymorphism myAnimal = new Polymorphism();  // Create a Animal object
        Polymorphism myPig = new Pig();  // Create a Pig object
        Polymorphism myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
