package JavaLearn;

public class Constructor {
    int x;
    int modelYear;
    String modelName;

    // A class constructor. Note that the constructor name must match
    // the class name, and it cannot have a return type (like void).
    public Constructor(int y, int year, String name) {

        this.x = y;
        this.modelYear = year;
        this.modelName = name;

    // Constructors can also take parameters,
    // which is used to initialize attributes.
    // You can have as many as you want.
    }
    public static void main(String[] args) {
        Constructor myObj = new Constructor(5, 2000, "Gto");
        System.out.println(myObj.x);  // Output - 5
        System.out.println("I have a " + myObj.modelName
                + " and its year is " + myObj.modelYear + ".");
        // Output - I have a Gto and its year is 2000.
    }
}

/*
You can think of constructors as methods that will set up your class by default,
so you don’t need to repeat the same code every time.
 */


