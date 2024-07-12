package JavaLearn;

class Interface2 {
    public static void main(String[] args) {
        Animal3 dog = new Dog2();
        Animal3 cat = new Cat2();
        dog.swim();
        dog.play();
        cat.swim();
        cat.play();
    }
}

interface Swimmer {
    void swim();
}

interface Player {
    void play();
}

//implement the Swimmer and the Player interfaces
abstract class Animal3 implements Swimmer, Player {}

class Dog2 extends Animal3 {
    //Override the swim() and the play() methods
    public void swim() {
        System.out.println("Dog is swimming");
    }
    public void play() {
        System.out.println("Dog is playing");
   }
}

class Cat2 extends Animal3 {
    //Override the swim() and the play() methods
    public void swim() {
        System.out.println("Cat is swimming");
    }
   public void play() {
        System.out.println("Cat is playing");
    }
}
