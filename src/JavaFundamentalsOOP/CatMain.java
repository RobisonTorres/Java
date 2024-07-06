package JavaFundamentalsOOP;

// To use the class, you would create an instance of Cat using the new keyword
public class CatMain {
    public static void main(String[] args) {
        // Creating a new Cat object with the 'new' keyword and the constructor
        Cat myCat = new Cat("black", "sleepy");
        Cat myCatII = new Cat("White", "Angry");

        // Accessing the public methods of the Cat class
        System.out.println("The cat is " + myCat.getColor() + " and feels " + myCat.getMood() + ".");
        myCat.makeHappy(); // Makes the cat happy which internally changes its mood and makes it purr
        System.out.println("The new cat is " + myCatII.getColor() + " and feels " + myCatII.getMood() + ".");
        myCat.meow();
        myCatII.scratch();
        myCatII.setColor("Red");
        System.out.println("The new cat's color " + myCatII.getColor() + ".");
        myCat.setMood("Unhappy");
        System.out.println("The new cat's mood " + myCat.getMood() + ".");

    }
}
