package JavaLearn;

public class ClassMethods {

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called " +
                "without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called" +
                " by creating objects");
    }

    public void myPublicTest() {
        System.out.println("Test");
    }

    // Main method
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        ClassMethods myObj = new ClassMethods(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object
    }
}
