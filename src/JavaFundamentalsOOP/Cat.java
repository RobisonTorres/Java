package JavaFundamentalsOOP;

public class Cat {

    /* Using 'private' to restrict access to the properties from outside this class.
    This approach not only protects the data from being changed in unintended ways
    but also enables a controlled interface for other classes to interact with the
    Cat objects.
    */
    private String color;
    private String mood;

    // Public constructor for Cat class
    public Cat(String color, String mood) {
        // The 'this' keyword refers to the current instance of the class
        this.color = color;
        this.mood = mood;
    }

    // Public method to access the private color field
    public String getColor() {
        return color;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    // Public method to access the private mood field
    public String getMood() {
        return mood;
    }

    public void setMood(String newMood){
        this.mood = newMood;
    }

    // Private method, only accessible within this class
    private void changeMood(String newMood) {
        mood = newMood;
    }

    // Public method to expose the behavior of the Cat object
    public void purr() {
        System.out.println("Cat purrs");
    }

    // Public method to interact with the private changeMood method
    public void makeHappy() {
        changeMood("happy");
        purr(); // The cat purrs when made happy
    }

    public void meow(){
        System.out.println("Meow!");
    }

    public void scratch(){
        System.out.println("Scratches!");
    }
}

/*
public class Cat {
    // Private instance variables, encapsulating the state of the Cat object
    private String name;
    private int age;

    // Constructor that initializes a Cat object with a given name and age
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter for the name, allowing read access to the private variable
    public String getName() {
        return this.name;
    }

    // Public setter for the name, allowing write access to the private variable
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for the age, allowing read access to the private variable
    public int getAge() {
        return this.age;
    }

    // Public setter for the age, allowing write access to the private variable
    public void setAge(int age) {
        this.age = age;
    }

    // Public method to display the Cat's attributes
    public void displayInfo() {
        System.out.println(this.name + " is " + this.age + " year(s) old.");
    }
}
*/